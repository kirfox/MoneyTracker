package com.example.kir.moneytracker;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = findViewById(R.id.pages);
        ViewPager tabs = findViewById(R.id.tabs);

        pager.setAdapter(new MainPagerAdapter(getSupportFragmentManager(), getResources()));
    }

}