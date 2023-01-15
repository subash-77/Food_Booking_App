package com.example.foodbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Book(View view) {
        Intent intent=new Intent(this,Booking.class);
        startActivity(intent);
    }

    public void click(View view) {
        Toast.makeText(this, "Enjoy Your Food!", Toast.LENGTH_SHORT).show();
    }
}