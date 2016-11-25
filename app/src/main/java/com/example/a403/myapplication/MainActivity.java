package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2;
    RadioButton r1,r2,r3;
    Button btn1, btn2;
    ImageView img1;
    RadioGroup rg;
    Switch sw1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.textView1);
        tv2 = (TextView)findViewById(R.id.textView2);
        sw1 = (Switch)findViewById(R.id.switch1);
        rg = (RadioGroup)findViewById(R.id.radioGroup4);
        r1 = (RadioButton)findViewById(R.id.radioButton1);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        img1 = (ImageView)findViewById(R.id.imageView);

        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tv2.setVisibility(View.VISIBLE);
                    r1.setVisibility(View.VISIBLE);
                    r2.setVisibility(View.VISIBLE);
                    r3.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    img1.setVisibility(View.VISIBLE);
                }
                else{
                    tv2.setVisibility(View.INVISIBLE);
                    r1.setVisibility(View.INVISIBLE);
                    r2.setVisibility(View.INVISIBLE);
                    r3.setVisibility(View.INVISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    img1.setVisibility(View.INVISIBLE);
                }
            }
        });
        r1.setChecked(true);

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(r1.isChecked()){
                    img1.setImageResource(R.drawable.a);
                }
            }
        });
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(r2.isChecked()){
                    img1.setImageResource(R.drawable.b);
                }
            }
        });
        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(r3.isChecked()){
                    img1.setImageResource(R.drawable.c);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw1.setChecked(false);
                r1.setChecked(true);
            }
        });
    }
}
