package com.berkerkoyuncu3gmail.com.landmarkbook;


import static com.berkerkoyuncu3gmail.com.landmarkbook.MainActivity.chosenLandmark;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.berkerkoyuncu3gmail.com.landmarkbook.databinding.ActivityRecyclerViewBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {

    ArrayList<Landmark> LandmarkArrayList;

    public LandmarkAdapter(ArrayList<Landmark> landmarkArrayList) {
        LandmarkArrayList = landmarkArrayList;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ActivityRecyclerViewBinding activityRecyclerViewBinding = ActivityRecyclerViewBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(activityRecyclerViewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.recyclerViewText.setText(LandmarkArrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), ActivityDetails.class);
               // intent.putExtra("Landmark",LandmarkArrayList.get(position));
                chosenLandmark = LandmarkArrayList.get(position);
                holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return LandmarkArrayList.size();
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder{
       private ActivityRecyclerViewBinding binding ;
        public LandmarkHolder(ActivityRecyclerViewBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}
