package com.example.tuba.my;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Random salla=new Random();
        final Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            int hak=0;
            int randomsay=salla.nextInt(10);
            EditText Edittahmin=(EditText)findViewById(R.id.editText);
            @Override

            public void onClick(View v) {
                TextView Txtsonuc=(TextView)findViewById(R.id.textView3);
                hak=hak+1;
                if(hak<3){
                    int sayTahmin=Integer.parseInt(Edittahmin.getText().toString());
                    if(randomsay<sayTahmin){
                        Txtsonuc.setText(String.valueOf("You failed"+"---"+"DOWN"));
                        Txtsonuc.setBackgroundResource(android.R.color.holo_red_dark);
                    }
                    if(randomsay>sayTahmin){
                        Txtsonuc.setText(String.valueOf("You failed"+"---"+"UP"));
                        Txtsonuc.setBackgroundResource(android.R.color.holo_red_dark);
                    }
                   if(randomsay==sayTahmin) {
                        Txtsonuc.setText(String.valueOf("You won"+"---"+"EQUALS"));
                        Txtsonuc.setBackgroundResource(android.R.color.holo_green_light);
                    }
                }
                else{
                Txtsonuc.setText(String.valueOf( "You have the right to end" +"---"+ randomsay ));
                    Txtsonuc.setBackgroundResource(android.R.color.darker_gray);
                }
                Edittahmin.getText().clear();
                }
        });







    }
}
