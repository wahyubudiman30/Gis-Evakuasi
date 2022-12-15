package com.wahyu.gisevakuasibencana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_admin);
    }

    public void Posko(View view) {
        Intent intent = new Intent(DashboardAdminActivity.this,PoskoActivity.class);
        startActivity(intent);
    }

    public void Maps(View view) {
        Intent intent = new Intent(DashboardAdminActivity.this,MapsadminActivity.class);
        startActivity(intent);
    }

    public void Kontak(View view) {
        Intent intent = new Intent(DashboardAdminActivity.this,ContactActivity.class);
        startActivity(intent);
    }

    public void Profil(View view) {
        Intent intent = new Intent(DashboardAdminActivity.this,ProfilActivity.class);
        startActivity(intent);
    }

    public void Berita(View view) {
    }

    public void About(View view) {
        Intent intent = new Intent(DashboardAdminActivity.this,TentangActivity.class);
        startActivity(intent);
    }
}