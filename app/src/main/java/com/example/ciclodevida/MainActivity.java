package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_CAT = MainActivity.class.getSimpleName();
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private int n = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String textoCreate;
        i++;
        Log.i(LOG_CAT, "On Create");
        TextView textView =findViewById(R.id.textView1);
        textoCreate = "OnCreate usado" + i + "vez";
        textView.setText(textoCreate);
    }
    @Override
    protected void onStart(){
        super.onStart();
        setContentView(R.layout.activity_main);

        String textoStart;
        j++;
        Log.i(LOG_CAT, "On Start");
        TextView textView2 = findViewById(R.id.textView2);
        textoStart = "On Start usado" + j + "veces";
        textView2.setText(textoStart);
    }
    @Override
    protected void onPause(){
        super.onPause();
        setContentView(R.layout.activity_main);

        String textoStart;
        k++;
        Log.i(LOG_CAT, "On Pause");
        TextView textView3 = findViewById(R.id.textView3);
        textoStart = "On Pause usado" + k + "veces";
        textView3.setText(textoStart);
    }
    @Override
    protected void onStop(){
        super.onStop();
        setContentView(R.layout.activity_main);

        String textoStart;
        l++;
        Log.i(LOG_CAT, "On Stop");
        TextView textView4 = findViewById(R.id.textView4);
        textoStart = "On Stop usado" + l + "veces";
        textView4.setText(textoStart);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        setContentView(R.layout.activity_main);

        String textoStart;
        m++;
        Log.i(LOG_CAT, "On Start");
        TextView textView5 = findViewById(R.id.textView5);
        textoStart = "On Start usado" + m + "veces";
        textView5.setText(textoStart);
    }
    @Override
    protected void onResume(){
        super.onResume();
        setContentView(R.layout.activity_main);

        String textoStart;
        n++;
        Log.i(LOG_CAT, "On Resume");
        TextView textView6 = findViewById(R.id.textView6);
        textoStart = "On Resume usado" + n + "veces";
        textView6.setText(textoStart);
    }

}