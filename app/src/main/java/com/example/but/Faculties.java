package com.example.but;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Faculties extends AppCompatActivity {

    ListView liste;
    String [] faculties_name;
    String [] faculties_adress;
    int [] faculties_img={R.mipmap.architecture,R.mipmap.civil,
            R.mipmap.elect,R.mipmap.mechanical,R.mipmap.computer,R.mipmap.manegment,R.mipmap.foresty};



    //Typeface custom_ubuntu2= Typeface.createFromAsset(getAssets(),"ubuntu.ttf");
    //        clic_sub.setTypeface(custom_ubuntu2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculties);
        Resources verikaynagi=getResources();
        faculties_name=verikaynagi.getStringArray(R.array.faculties_name);
        faculties_adress=verikaynagi.getStringArray(R.array.faculties_adress);

        liste=(ListView) findViewById(R.id.faculties_listview);

        Facultieadapter facultieadapter=new Facultieadapter(this,faculties_name,faculties_adress,faculties_img);
        liste.setAdapter(facultieadapter);
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){

                    Intent intent = new Intent(Faculties.this,Faculty_of_architecture.class);
                    startActivity(intent);

                }
                if(i==1){
                    Intent intent = new Intent(Faculties.this,Faculty_of_civil.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent = new Intent(Faculties.this,Faculty_of_electric.class);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent = new Intent(Faculties.this,Faculty_of_mechanical.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent = new Intent(Faculties.this,Faculty_of_computer.class);
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent = new Intent(Faculties.this,Faculty_of_management.class);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent = new Intent(Faculties.this,Faculty_of_foresty.class);
                    startActivity(intent);

                }


            }
        });




    }
}
