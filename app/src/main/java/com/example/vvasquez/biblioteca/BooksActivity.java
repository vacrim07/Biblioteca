package com.example.vvasquez.biblioteca;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.vvasquez.biblioteca.models.Book;
import com.example.vvasquez.biblioteca.models.Books;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BooksActivity extends AppCompatActivity {

    private Gson gson;
    private List<Book> booksList;
    List<Book> list;
    private BooksAdapter booksAdapter;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String queryParam;
        if(extras != null){
            queryParam = extras.getString("Query");
        }else{
            queryParam = "";
        }
        doQuery(queryParam);

        mRecyclerView = (RecyclerView) findViewById(R.id.booksRV);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        booksList = new ArrayList<>();
        booksAdapter = new BooksAdapter(booksList);
        mRecyclerView.setAdapter(booksAdapter);
    }

    public void doQuery(String queryParam){
        String URL = "http://it-ebooks-api.info/v1/" + queryParam;
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest objectRequest = new JsonObjectRequest(
                Request.Method.GET, URL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject jsonObject) {
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        gson = gsonBuilder.create();
                        try {
                            JSONArray jsonArray = jsonObject.getJSONArray("Books");
                            if (jsonArray.length() > 0) {
                                list = new ArrayList<>();
                                list = Arrays.asList(gson.fromJson(jsonArray.toString(), Book[].class));
                                for(Book book: list){
                                    booksList.add(book);
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Response",error.toString());
                    }
                }
        );
        requestQueue.add(objectRequest);
    }

}
