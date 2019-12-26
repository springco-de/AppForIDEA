package de.springco.appforidea.QR;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.List;

import de.springco.appforidea.Basic.MainActivity;
import de.springco.appforidea.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QRActivity extends AppCompatActivity {

    private String qrResult;
    private int qrCode;
    TextView textFromApi;
    TextView textViewQR;

    private static final String TAG = "MainActivity";

    VideoView videoView;

    Button btnBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);

        loadData();

        textFromApi = findViewById(R.id.text_from_api);
        textViewQR = findViewById(R.id.text_view_qrcode);


        Bundle args = getIntent().getExtras();
        qrResult = args.getString("qr_result");
        qrCode = Integer.parseInt(qrResult);

        btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QRActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public void loadData() {

        final MediaController mediaController = new MediaController(this);

        Api api = ApiClient.getClient().create(Api.class);
        Call<List<Model>> gallery = api.galleryContent();

        gallery.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {

                if (response.body() != null && response.isSuccessful()) {
                    Log.i("test", "onResponse: " + response.body().size());

                    textFromApi.setMovementMethod(new ScrollingMovementMethod());

                    List<Model> models = response.body();
                    Model model = models.get(qrCode);

                    //textFromApi.append(model.getId() + "\n");
                    //textFromApi.append(model.getPhoto01() + "\n");
                    //textFromApi.append(model.getPhoto02() + "\n");
                    //textFromApi.append(model.getAudio()+"\n");

                    textFromApi.append(model.getDescription() + "\n\n");
                    textViewQR.append(model.getName());

                    String urlVideo = model.getVideo();
                    videoView = findViewById(R.id.video_view);

                    mediaController.setAnchorView(videoView);
                    videoView.setMediaController(mediaController);
                    videoView.setVideoURI(Uri.parse(urlVideo));
                    mediaController.setAnchorView(videoView);
                    videoView.setMediaController(mediaController);
                    videoView.setVideoURI(Uri.parse(urlVideo));


                } else {
                    try {
                        Log.e(TAG, "onResponse: " + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Log.i("tes2", "onFailure: " + t);
            }
        });

    }

}