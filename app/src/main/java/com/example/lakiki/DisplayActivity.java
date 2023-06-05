package com.example.lakiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {


    private TextView tvStory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_display);

        tvStory = findViewById(R.id.tv_story);

        Intent intent = getIntent();
        String story = intent.getStringExtra("story");

        tvStory.setText(story);
    }
}