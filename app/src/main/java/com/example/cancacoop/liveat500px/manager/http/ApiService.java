package com.example.cancacoop.liveat500px.manager.http;

import dao.PhotoItemCollectionDao;
import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();
}
