package com.yuhdeveloper.imagescaletrainer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder> {


    Context c;
    String[] images;
    LayoutInflater layoutInflater;

    public RecyclerViewAdapter(Context _c, String [] _images) {
        c = _c;
        images = _images;
        layoutInflater = LayoutInflater.from(_c);
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.custom_recycleritem,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.set(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    static class viewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        public viewHolder(@NonNull final View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), "Width = "+img.getWidth()+ " Height = "+img.getHeight(), Toast.LENGTH_SHORT).show();
                }
            });
        }

        public void set(String imgURL){
            Picasso.get().load(imgURL).into(img);
        }

    }
}
