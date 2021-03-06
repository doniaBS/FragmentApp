package com.donia.fragmentproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ActivityStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

       FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StartFragment startFragment = new StartFragment();
        fragmentTransaction.add(R.id.container, startFragment);
        fragmentTransaction.commit();

        findViewById(R.id.btn_start).setOnClickListener(v -> {
            FragmentManager fragmentManager1 = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction1.add(R.id.container, secondFragment).addToBackStack("");
            fragmentTransaction1.commit();

        });
        findViewById(R.id.btn_second).setOnClickListener(v -> {
            FragmentManager fragmentManager1 = getSupportFragmentManager();
           fragmentManager1.popBackStack();

        });
    }
}