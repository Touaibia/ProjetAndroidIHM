package com.example.touaibia.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public NameViewHolder(@NonNull View itemview){
        super(itemview);
        textView = itemView.findViewById(R.id.main_activity_text_view);
    }

    public void setContent(String name){
        textView.setText(name);
    }
}
