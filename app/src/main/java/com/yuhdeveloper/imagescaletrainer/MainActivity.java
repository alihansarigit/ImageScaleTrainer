package com.yuhdeveloper.imagescaletrainer;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        Drawable[] images = new Drawable[4];
        images[0] = ContextCompat.getDrawable(this, R.drawable.resim1);
        images[1] = ContextCompat.getDrawable(this, R.drawable.resim2);
        images[2] = ContextCompat.getDrawable(this, R.drawable.resim3);
        images[3] = ContextCompat.getDrawable(this, R.drawable.resim4);
        adapter = new RecyclerViewAdapter(this, images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
