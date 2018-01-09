package com.fancy.tobeenhook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv=(TextView)findViewById(R.id.tv1);
        Intent intent=super.getIntent();
        String value=intent.getStringExtra("value");
        if(value.equals("BeenHook")){
            tv.setText("Successful!");
        }
    }
}
