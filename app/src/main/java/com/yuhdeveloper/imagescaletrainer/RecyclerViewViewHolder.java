package com.yuhdeveloper.imagescaletrainer;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private ImageView imageView;

    RecyclerViewViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.itemRecyclerImageView);
    }

    void bind(Drawable drawable) {
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(itemView.getContext(), "Text", Toast.LENGTH_SHORT).show();
    }
}
