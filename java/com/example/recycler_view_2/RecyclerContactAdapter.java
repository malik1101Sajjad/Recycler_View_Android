package com.example.recycler_view_2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

     Context context;
     ArrayList<Contact_Row> arrayList;

     RecyclerContactAdapter(Context context, ArrayList<Contact_Row> arrayList){
         this.context=context;
         this.arrayList=arrayList;

     }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View v= LayoutInflater.from(context).inflate(R.layout.contax_row,parent,false);
         ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         holder.iv.setImageResource(arrayList.get(position).img);
         holder.tv.setText(arrayList.get(position).name);

         switch (position) {
             case 0:
                 holder.iv.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                        Intent intent= new Intent(view.getContext(),Activity_shows.class);
                        view.getContext().startActivity(intent);
                     }
                 });
                 break;

         }
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
         ImageView iv;
         TextView tv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
            tv=itemView.findViewById(R.id.tv);
        }
    }
}
