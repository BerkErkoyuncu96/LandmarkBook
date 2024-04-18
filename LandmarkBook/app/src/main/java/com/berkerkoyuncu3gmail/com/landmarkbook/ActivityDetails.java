package com.berkerkoyuncu3gmail.com.landmarkbook;



import static com.berkerkoyuncu3gmail.com.landmarkbook.MainActivity.chosenLandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.berkerkoyuncu3gmail.com.landmarkbook.databinding.ActivityDetailsBinding;

import java.util.ArrayList;

public class ActivityDetails extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Intent intent = getIntent();

        // Landmark selectedLandmark = (Landmark)  intent.getSerializableExtra("Landmark");


        Landmark selectedLandmark = chosenLandmark;

        binding.nameText.setText(selectedLandmark.name);
        binding.cityText.setText(selectedLandmark.city);
        binding.imageView.setImageResource(selectedLandmark.image);

    }







}