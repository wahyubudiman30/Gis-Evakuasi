package com.wahyu.gisevakuasibencana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    public void EditProfil(View view) {
        Intent intent = new Intent(ProfilActivity.this,UbahprofilActivity.class);
        startActivity(intent);
    }

    public void Tambahadmin(View view) {
        Intent intent = new Intent(ProfilActivity.this,TambahakunActivity.class);
        startActivity(intent);
    }
}