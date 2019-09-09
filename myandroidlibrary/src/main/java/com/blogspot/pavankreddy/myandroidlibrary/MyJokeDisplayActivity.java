package com.blogspot.pavankreddy.myandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyJokeDisplayActivity extends AppCompatActivity {

    TextView joke_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_joke_display);
        joke_view = findViewById(R.id.joke_view);
        String joke = getIntent().getStringExtra("JOKE");
        joke_view.setText(joke);
    }
}
