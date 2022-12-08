package com.wahyu.gisevakuasibencana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PoskoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posko);
    }

    public void TambahPosko(View view) {
        Intent intent = new Intent(PoskoActivity.this,TambahposkoActivity.class);
        startActivity(intent);
    }
}