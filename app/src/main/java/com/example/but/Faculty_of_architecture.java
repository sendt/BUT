package com.example.but;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Faculty_of_architecture extends AppCompatActivity {
        TextView phone1,email1,phone2,email2,website;
        Intent intent;

        Faculty_of_architecture(){
            super();
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_of_architecture);
        intent = new Intent(Intent.ACTION_DIAL);

        phone1=findViewById(R.id.architecture_phone1);
        phone1.setPaintFlags(phone1.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setData(Uri.parse("tel:+48857469914"));
                startActivity(intent);
            }
        });

        phone2=findViewById(R.id.architecture_deans_phone1);
        phone2.setPaintFlags(phone2.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        phone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setData(Uri.parse("tel:+48857469911"));
                startActivity(intent);
            }
        });

        email1=findViewById(R.id.architecture_email1);
        email1.setPaintFlags(email1.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        email1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to="sekretariat.wa@pb.edu.pl";
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT, "To Faculty of Architecture");
                intent.putExtra(Intent.EXTRA_TEXT, "Hello Dear Coordinator;\n");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent, "Choose an Email app :"));
            }
        });

        email2=findViewById(R.id.architecture_dean_email1);
        email2.setPaintFlags(email2.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        email2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to="dziekan.wa@pb.edu.pl";
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT, "To Faculty of Architecture");
                intent.putExtra(Intent.EXTRA_TEXT, "Hello Dear Coordinator;\n");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent, "Choose an Email app :"));
            }
        });

        website=findViewById(R.id.architecture_web_site);
        website.setPaintFlags(website.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://wa.pb.edu.pl/en/");
                Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

    }
}
