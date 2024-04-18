package com.berkerkoyuncu3gmail.com.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.berkerkoyuncu3gmail.com.landmarkbook.databinding.ActivityDetailsBinding;
import com.berkerkoyuncu3gmail.com.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    static Landmark chosenLandmark;
    ArrayList<Landmark> landmarkArrayList ;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Landmark aksazlar=new Landmark("Aksazlar","Muğla",R.drawable.aksazlar);
        Landmark alanya = new Landmark("Alanya" , "Antalya",R.drawable.alanya);
        Landmark bodrum = new Landmark("Bodrum" , "Muğla",R.drawable.bodrum);
        Landmark kusadasi = new Landmark("Kuşadası" , "Aydın",R.drawable.kusadasi);


        landmarkArrayList =new ArrayList<>();

        landmarkArrayList.add(aksazlar);
        landmarkArrayList.add(alanya);
        landmarkArrayList.add(bodrum);
        landmarkArrayList.add(kusadasi);


        binding.rcyView1.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter LanmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.rcyView1.setAdapter(LanmarkAdapter);
    }
}