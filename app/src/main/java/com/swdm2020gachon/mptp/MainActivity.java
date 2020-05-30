package com.swdm2020gachon.mptp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button place1 = (Button) findViewById(R.id.place1);
        Button place2 = (Button) findViewById(R.id.place2);
        Button place3 = (Button) findViewById(R.id.place3);
        Button place4 = (Button) findViewById(R.id.place4);

        ScrollView scrollView = findViewById(R.id.scroll);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        TextView textView = (TextView) findViewById(R.id.title1);

        final Intent intent = new Intent(getApplicationContext(),walking.class);


        place1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("distance",1000);
            }
        });

        place2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("distance",1500);

            }
        });

        place3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("distance",1500);
            }
        });

        place4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("distance",3000);
            }
        });



    }
}
