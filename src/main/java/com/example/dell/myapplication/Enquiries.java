package com.example.dell.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Enquiries extends Activity {

    Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enquiries);

        button = (Button)findViewById(R.id.submitform);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Enquiries.this, "Thank you for sending us \nWe will respond you soon", Toast.LENGTH_LONG).show();
                Intent myIntent = new Intent(Enquiries.this, MainActivity.class);
                startActivity(myIntent);
            }
        });


    }


}
