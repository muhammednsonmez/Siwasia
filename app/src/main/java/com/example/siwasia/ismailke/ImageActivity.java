package com.example.siwasia.ismailke;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.siwasia.R;
import com.example.siwasia.fragments.CollageFragment;
import com.example.siwasia.fragments.EditFragment;
import com.example.siwasia.fragments.FilterFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);


        BottomNavigationView navigationView = findViewById(R.id.bottom_menu);
        navigationView.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if (item.getItemId() == R.id.edit_menu) fragment = new EditFragment();
            if (item.getItemId() == R.id.filter_menu) fragment = new FilterFragment();
            if (item.getItemId() == R.id.collage_menu) fragment = new CollageFragment();

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_holder, Objects.requireNonNull(fragment)).commit();

            return true;
        });
    }
}