package com.example.calculateactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        setTitle("Second 액티비티");

        Intent inIntent = getIntent();
        final int hapValue = inIntent.getIntExtra("Num1", 0)+ inIntent.getIntExtra("Num2", 0);

        Button btnReturn = findViewById(R. id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outIntent = new Intent(getApplicationContext(),MainActivity.class);
                outIntent.putExtra("Hap", hapValue);
                setResult(RESULT_OK,outIntent);
                finish();
            }
        });
    }
}