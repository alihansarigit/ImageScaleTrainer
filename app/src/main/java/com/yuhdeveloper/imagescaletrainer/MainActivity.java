package com.yuhdeveloper.imagescaletrainer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        String[] images = new String[5];
        images[0] = "http://www.mangaship.com/Content/Upload/Urunler/Die,-Dai/013.B%C3%B6l%C3%BCm/001-Die%20Dai.jpg";
        images[1] = "http://www.mangaship.com/Content/Upload/Urunler/Die,-Dai/012.B%C3%B6l%C3%BCm/001-Die%20Dai.jpg";
        images[2] = "http://www.mangaship.com/Content/Upload/Urunler/e54255fd-6213-4f8b-a5f9-dae9f54eb165000.jpg";
        images[3] = "http://www.mangaship.com/Content/Upload/Urunler/96a75c95-d4d3-4fb3-9097-eaba2306d8ff003.jpg";
        images[4] = "http://www.mangaship.com/Content/Upload/Urunler/Soul-Cartel/150.B%C3%B6l%C3%BCm/002-Soul%20Carter.jpg";
        adapter = new RecyclerViewAdapter(this, images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
