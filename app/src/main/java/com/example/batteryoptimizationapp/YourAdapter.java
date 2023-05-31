package com.example.batteryoptimizationapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class YourAdapter extends RecyclerView.Adapter<YourAdapter.ViewHolder> {
    private final List<YourDataModel> dataList;

    public YourAdapter() {
        this.dataList = new ArrayList<>();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate your_item_layout and create a ViewHolder
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.your_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Bind the data to the views in the ViewHolder
        YourDataModel data = dataList.get(position);
        holder.bindData(data);
    }

    @Override
    public int getItemCount() {
        // Return the size of the data list
        return dataList.size();
    }

    // ViewHolder class
    public static class ViewHolder extends RecyclerView.ViewHolder {

        // Declare your views for the item layout
        private final TextView titleTextView;
        private final TextView descriptionTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            // Initialize your views from the item layout
            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }

        public void bindData(YourDataModel data) {
            // Bind the data to the views
            titleTextView.setText(data.getTitle());
            descriptionTextView.setText(data.getDescription());
        }
    }
}
