package com.example.foodbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Booking extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4;
    Button order;
    TextView Bill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        cb1=findViewById(R.id.biriyani);
        cb2=findViewById(R.id.curdrice);
        cb3=findViewById(R.id.lemonrice);
        cb4=findViewById(R.id.sambarrice);

        order=findViewById(R.id.Book);

        Bill=findViewById(R.id.bill);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total=0;
                if(cb1.isChecked())
                {
                    total=total+90;
                }
                if(cb2.isChecked())
                {
                    total+=40;
                }
                if(cb3.isChecked())
                {
                    total=total+45;
                }
                if(cb4.isChecked())
                {
                    total+=50;
                }
                Bill.setText("Your Bill Is Rs:"+String.valueOf(total));
                Toast.makeText(Booking.this, "BOOKING CONFIRMED", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void br(View view) {
        Toast.makeText(this, "RS:90", Toast.LENGTH_SHORT).show();
    }

    public void lm(View view) {
        Toast.makeText(this, "RS:45", Toast.LENGTH_SHORT).show();
    }

    public void sm(View view) {
        Toast.makeText(this, "RS:50", Toast.LENGTH_SHORT).show();
    }

    public void cd(View view) {
        Toast.makeText(this, "RS:40", Toast.LENGTH_SHORT).show();
    }
}