package com.example.but;

import android.Manifest;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import android.app.Fragment;

import android.view.Menu;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton facebook;
    ImageButton twitter;
    ImageButton instagram;
    Intent follow;
    Uri flw;

    TextView welcom,clic_sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //         .setAction("Action", null).show();
                String to[]={"a.gniazdowska@pb.edu.pl","s.zuazo@pb.edu.pl"};



                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT, "To International Office");
                intent.putExtra(Intent.EXTRA_TEXT, "Hello International Relations Office;\n");
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent, "Choose an Email app :"));


            }
        });

        FloatingActionButton make_phone = findViewById(R.id.make_phone);
        make_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+48 (85)746 9047"));
                startActivity(intent);

            }
        });



        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.about_but) {
            Intent intent=new Intent(this,Home_LayoutBUT.class);
            startActivity(intent);

           // Fragment_homefragment homefragment=new Fragment_homefragment();
            //FragmentManager manager=getSupportFragmentManager();
            //manager.beginTransaction().replace(R.id.linearLayout,homefragment).commit();

        } else if (id == R.id.faculties) {
            Intent intent=new Intent(this,Faculties.class);
            startActivity(intent);

        } else if (id == R.id.emergency_number) {

            Intent intent=new Intent(this,Emergency_main.class);
            startActivity(intent);

          //  Fragment_emergency_number emergency_number=new Fragment_emergency_number();
           // FragmentManager manager=getSupportFragmentManager();
           //    manager.beginTransaction().replace(R.id.linearLayout,emergency_number).commit();

        } else if (id == R.id.contact_search) {

            Uri uri = Uri.parse("https://usosweb.pb.edu.pl/kontroler.php?_action=logowaniecas/index");
            Intent intent =new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);


        } else if (id == R.id.nav_share) {
            Intent myintent=new Intent(Intent.ACTION_SEND);
            myintent.setType("text/plain");
            String shareBody="For International students ";
            String shareSub="BUT APP";
            myintent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
            myintent.putExtra(Intent.EXTRA_TEXT,shareSub);
            startActivity(Intent.createChooser(myintent,"Share using"));

        } else if (id == R.id.nav_contactus) {
            ContactUsFragment contactUsFragment = new ContactUsFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.linearLayout, contactUsFragment).commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
