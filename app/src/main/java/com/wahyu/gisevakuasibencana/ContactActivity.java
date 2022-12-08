package com.wahyu.gisevakuasibencana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void CUEdit(View view) {
        Intent intent = new Intent(ContactActivity.this,EditcontactActivity.class);
        startActivity(intent);
    }
}