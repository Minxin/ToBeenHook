package com.fancy.tobeenhook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String value;
    Button btn;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inits();

        edit.addTextChangedListener(new TextWatcher(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before,int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,int after) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                System.out.println("afterTextChanged:" + s);
                value = s.toString();
                if (value.equals("android")) {
                    btn.setEnabled(true);
                }else {
                    btn.setEnabled(false);
                }

            }
        });

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =new Intent(MainActivity.this,com.fancy.tobeenhook.SecondActivity.class);
                intent.putExtra("value",value);
                startActivity(intent);
            }

        });


    }

    public void inits(){
        edit=(EditText)findViewById(R.id.edt);
        btn=(Button)findViewById(R.id.btn);
    }
}