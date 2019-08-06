package com.example.but;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Emergency_main extends AppCompatActivity {

        ListView list;
    Intent intent;
    String numbers[];
    String descp[];
    int [] imag={R.drawable.pan_europan,R.drawable.emergency,R.drawable.fire,R.drawable.police};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_main);
        intent = new Intent(Intent.ACTION_DIAL);

        Resources   veri_kaynagi=getResources();
        numbers=veri_kaynagi.getStringArray(R.array.emergency_number);
        descp=veri_kaynagi.getStringArray(R.array.emergency_describe);
        list=(ListView) findViewById(R.id.emergency_listview);

        EmergencyAdapter adapter=new EmergencyAdapter(this,numbers,descp,imag);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){

                    intent.setData(Uri.parse("tel:112"));
                    startActivity(intent);
                }
                if(i==1){
                    intent.setData(Uri.parse("tel:999"));
                    startActivity(intent);
                }if(i==2){
                    intent.setData(Uri.parse("tel:998"));
                    startActivity(intent);
                }if(i==3){
                    intent.setData(Uri.parse("tel:997"));
                    startActivity(intent);
                }

            }
        });



    }


}

