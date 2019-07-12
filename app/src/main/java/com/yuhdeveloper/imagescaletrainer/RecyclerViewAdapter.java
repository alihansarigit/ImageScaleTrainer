package com.yuhdeveloper.imagescaletrainer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewViewHolder> {

    private Context context;
    private Drawable[] imagesArray;

    RecyclerViewAdapter(Context context, Drawable[] imagesArray) {
        this.context = context;
        this.imagesArray = imagesArray;
    }

    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RecyclerViewViewHolder(LayoutInflater.from(context).inflate(R.layout.custom_recycleritem, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        holder.bind(imagesArray[position]);
    }

    @Override
    public int getItemCount() {
        return imagesArray.length;
    }
}
