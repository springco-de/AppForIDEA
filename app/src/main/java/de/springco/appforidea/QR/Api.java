package de.springco.appforidea.QR;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("5decc7703300002b002b8fea/")
    Call<List<Model>> galleryContent();
}

/*[
        {
        "id": "1",
        "name": "Alay",
        "audio": "https://firebasestorage.googleapis.com/v0/b/foramericancornerproject.appspot.com/o/aktan-isabaev-esimde.mp3?alt=media&token=33b8bc9f-e3fd-4ae4-a9de-578715e71ee0",
        "photo01": "https://firebasestorage.googleapis.com/v0/b/foramericancornerproject.appspot.com/o/ALAY_1.jpg?alt=media&token=864a9e65-fa4b-4b72-9d20-2b642b320833",
        "photo02": "https://firebasestorage.googleapis.com/v0/b/foramericancornerproject.appspot.com/o/ALAY_2.jpg?alt=media&token=26a806ee-6d8b-4295-8ad6-e28fe1f60b5b",
        "description": "Alay is a raion (district) of Osh Region in south-western Kyrgyzstan. The capital lies at Gul'cha The Alay District borders with China in the east, Tajikistan in the south, Chong-Alay District in the west, Nookat District in the north-west, Kara-Suu District and Uzgen District in the north, and Kara-Kulja District in the north-east. Its area is 6,821 square kilometres (2,634 sq mi), and its resident population was 72,170 in 2009.",
        "video": "https://firebasestorage.googleapis.com/v0/b/foramericancornerproject.appspot.com/o/ALAY.mp4?alt=media&token=410a4b0d-a961-4933-bbbe-e3ef39507679"
        },
        {
        "id": "2",
        "name": "Osh",
        "audio": "https://firebasestorage.googleapis.com/v0/b/foramericancornerproject.appspot.com/o/mirbek-atabekov-muras.mp3?alt=media&token=3a656545-4b58-4b31-987a-c3bc3ea9125c",
        "photo01": "https://firebasestorage.googleapis.com/v0/b/foramericancornerproject.appspot.com/o/OSH_1.jpg?alt=media&token=7fd354de-e8db-4ff2-badf-52e8ab302060",
        "photo02": "https://firebasestorage.googleapis.com/v0/b/foramericancornerproject.appspot.com/o/OSH_2.jpg?alt=media&token=2bdfe735-f32e-4c0c-8b59-5c02edf442b2",
        "description": "Osh is the second largest city in Kyrgyzstan, located in the Fergana Valley in the south of the country and often referred to as the capital of the south. It is the oldest city in the country (estimated to be more than 3000 years old), and has served as the administrative center of Osh Region since 1939. The city has an ethnically mixed population of about 281,900 in 2017,[2] comprising Uzbeks, Kyrgyz, Russians, Tajiks, and other smaller ethnic groups. It is about 5 km from the Uzbekistan border.",
        "video": "https://firebasestorage.googleapis.com/v0/b/foramericancornerproject.appspot.com/o/OSH.mp4?alt=media&token=78946683-123d-4cb3-b0d8-f666d6c1c3af"
        }
        ]*/
