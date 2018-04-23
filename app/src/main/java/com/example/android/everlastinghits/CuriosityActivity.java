package com.example.android.everlastinghits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CuriosityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curiosity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}