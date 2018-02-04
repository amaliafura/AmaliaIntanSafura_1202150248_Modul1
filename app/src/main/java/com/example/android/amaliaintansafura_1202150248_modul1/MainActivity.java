package com.example.android.amaliaintansafura_1202150248_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    private EditText mMenu;
    private EditText mPorsi;
    private Button mEatbuss;
    private Button mAbnormal;
    private int totalHarga;
    private int duit = 65500;
    private int nasiudukAbnormal = 30000;
    private int nasiudukEatbuss = 50000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mMenu = (EditText) findViewById(R.id.menu);
        mPorsi = (EditText) findViewById(R.id.porsi);
        mEatbuss = (Button) findViewById(R.id.button_main);
        mAbnormal = (Button) findViewById(R.id.button_main2);


    }

    public void pilihEatbus(View view) {
        Log.d(LOG_TAG, "Button clicked!");




        String menu = mMenu.getText().toString();
        int porsi = Integer.parseInt(mPorsi.getText().toString());
        totalHarga = porsi * nasiudukEatbuss;
        Intent intent = new Intent(this, Main2Activity.class);

        intent.putExtra("menu", menu);

        intent.putExtra("duit", duit);

        intent.putExtra("totalharga", totalHarga);

        intent.putExtra("lokasi", "Eatbuss");

        intent.putExtra("porsi", porsi);

        startActivity(intent);

    }

    public void pilihAbnormal(View view) {

        Log.d(LOG_TAG, "Button clicked!");

        int porsi = Integer.parseInt(mPorsi.getText().toString());
        String menu = mMenu.getText().toString();

        totalHarga = porsi * nasiudukAbnormal;
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("menu", menu);

        intent.putExtra("duit", duit);

        intent.putExtra("totalharga", totalHarga);

        intent.putExtra("lokasi", "Abnormal");

        intent.putExtra("porsi", porsi);


        startActivity(intent);
    }
}
