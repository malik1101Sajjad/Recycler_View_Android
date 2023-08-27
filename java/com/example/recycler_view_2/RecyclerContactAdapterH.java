package com.example.recycler_view_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapterH extends RecyclerView.Adapter<RecyclerContactAdapterH.ViewHolder> {
    Context context;
    ArrayList<ShowsContactH> arrayList;
    RecyclerContactAdapterH (Context context,ArrayList<ShowsContactH> arrayList) {
        this.arrayList=arrayList;
        this.context=context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activityshows,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(arrayList.get(position).imgShows);
        holder.imageView1.setImageResource(arrayList.get(position).Star);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        ImageView imageView1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.shows);
            imageView1= itemView.findViewById(R.id.star);


        }
    }
}
