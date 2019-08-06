package com.example.but;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Home_LayoutBUT extends AppCompatActivity {
    ViewFlipper v_flipper;
    ImageButton facebook;
    ImageButton twitter;
    ImageButton instagram;
    Intent follow;
    Uri flw;

    TextView welcom,clic_sub, seconde_desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__layout_but);

        welcom=findViewById(R.id.welcom);
        clic_sub=findViewById(R.id.click_sub);
        Typeface custom_ubuntu= Typeface.createFromAsset(getAssets(),"ubuntu_bold.ttf");
        clic_sub.setTypeface(custom_ubuntu);
        seconde_desc=findViewById(R.id.second_desc);
        Typeface custom_ubuntu2= Typeface.createFromAsset(getAssets(),"ubuntu.ttf");
        clic_sub.setTypeface(custom_ubuntu2);

        facebook=findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flw=Uri.parse("fb://facewebmodal/f?href=" +"https://www.facebook.com/BialystokUniversityOfTechnologyIRO");
                follow=new Intent(Intent.ACTION_VIEW,flw);
                startActivity(follow);
            }
        });
        twitter=findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        instagram=findViewById(R.id.instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flw=Uri.parse("https://www.instagram.com/iro_but/");
                follow=new Intent(Intent.ACTION_VIEW,flw);
                follow.setPackage("com.instagram.android");
                startActivity(follow);
            }
        });



        int slide_show_img[]={R.drawable.res1,R.drawable.res2,R.drawable.res3};
        v_flipper=findViewById(R.id.v_flipper);
        for(int temp:slide_show_img){
            flipperImages(temp);
        }

    }
    public  void flipperImages(int images){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(images);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000);//4 second
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_in_left);
    }
}
