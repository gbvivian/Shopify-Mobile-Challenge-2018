package com.shopifychallenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;
import com.shopifychallenge.json.Products;
import com.shopifychallenge.json.ShopifyAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {
    private static List<Products>  productList = new ArrayList<>();
    private RecyclerView recyclerView;
    private static ProductsAdapter pAdapter;
    private static OkHttpClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        client = new OkHttpClient();
        getProductData("title");

        recyclerView = findViewById(R.id.recycler_view);

        pAdapter = new ProductsAdapter(productList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pAdapter);
    }

    public void getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try (ResponseBody body = response.body()) {
                    if (!response.isSuccessful()) {
                        throw new IOException("Unexpected code " + response);
                    }
                    final String jsonString = body.string();

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Gson gson = new Gson();
                            ShopifyAPI shopifyAPI = gson.fromJson(jsonString, ShopifyAPI.class);
                            for (Products p : shopifyAPI.getProducts()) {
                                productList.add(p);
                            }
                            pAdapter.notifyDataSetChanged();
                        }
                    });
                }
            }
        });
    }

    public void getProductData(String product) {
        try {
            getJSON("https://shopicruit.myshopify.com/admin/products.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
