package com.example.peter.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = ((EditText)findViewById(R.id.et)).getText().toString();
                Toast.makeText(MainActivity.this, "Hi!!! " + text, Toast.LENGTH_SHORT).show();
            }
        });
        Button bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = ((EditText) findViewById(R.id.et)).getText().toString();
                Toast.makeText(MainActivity.this,"halo~ " + text,Toast.LENGTH_SHORT).show();
            }
        });

    }


}
