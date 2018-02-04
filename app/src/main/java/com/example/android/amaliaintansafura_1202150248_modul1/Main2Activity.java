package com.example.android.amaliaintansafura_1202150248_modul1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Context context = getApplicationContext();

        TextView menuView = (TextView) findViewById(R.id.menuTerpilih);
        TextView lokasiView = (TextView) findViewById(R.id.lokasi);
        TextView hargaView = (TextView) findViewById(R.id.hargaTerpilih);
        TextView porsiView = (TextView) findViewById(R.id.porsi);

        Toast murah = Toast.makeText(context, "Waw, murah nih disini :D, disini aja", Toast.LENGTH_LONG);
        Toast mahal = Toast.makeText(context, "Mahal kalo makan disini :(", Toast.LENGTH_LONG);

        Intent intent = getIntent();

        String aLokasi = intent.getStringExtra("lokasi");

        String aMenu = intent.getStringExtra("menu");
        int aDuit = intent.getIntExtra("duit", 0);


        int aPorsi = intent.getIntExtra("porsi", 0);
        String porsi = Integer.toString(aPorsi);

        int aTotal = intent.getIntExtra("totalharga", 0);
        String total = Integer.toString(aTotal);



        menuView.setText(aMenu);
        hargaView.setText(total);
        porsiView.setText(porsi);

        if (aDuit >= aTotal) {
            murah.show();
            lokasiView.setText(aLokasi);
        } else {
            mahal.show();
            lokasiView.setText(aLokasi);


        }
    }
}
