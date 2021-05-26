package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn_tap = findViewById(R.id.btn_Tap);
        EditText crush_name = findViewById(R.id.crush_name);
        EditText your_name = findViewById(R.id.your_name);

        LottieAnimationView skate = findViewById(R.id.skate);

        btn_tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String a =  crush_name.getText().toString();
               String b = your_name.getText().toString();
               int min = a.length();
               if(min > b.length()){
                   min = b.length();

               }
               int count = 0;
               char aa [] = a.toCharArray();
               char bb [] = b.toCharArray();
               for(int i = 0; i < min; i++){
                   for(int j = 0; j < min; j++){
                       if(aa[i] == bb[j]){
                           count += 1;
                       }
                   }
               }

                float chances = (float) count / b.length();
                TextView tap_score = findViewById(R.id.Tap_to_get_score);

               if(count == 0){
                   tap_score.setText("Chances are " + 90 +"%");

               }
               else{
                   tap_score.setText("Chances are " + chances * 100 +"%");
               }

            }
        });


    }
}