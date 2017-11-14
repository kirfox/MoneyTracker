package com.example.kir.moneytracker.api;

import com.example.kir.moneytracker.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Kir on 09.11.2017.
 */

public interface Api {

    @GET("items")
    Call<List<Item>> items(@Query("type") String type);

}
