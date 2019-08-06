package com.example.but;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Facultieadapter extends ArrayAdapter<String> {

            Context c;
            String [] fname;
            String[] adres;
            int [] f_imgs;
    Facultieadapter(Context context,String[]numbers,String[]descp,int[] array_img) {
        super(context, R.layout.faculties_layout,numbers);
        this.c=context;
        this.fname=numbers;
        this.adres=descp;
        this.f_imgs=array_img;


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View emrgency_layt=inflater.inflate(R.layout.faculties_layout,parent,false);

        ImageView imageView= emrgency_layt.findViewById(R.id.faculties_img);
        TextView number=emrgency_layt.findViewById(R.id.faculties_name);
        TextView descpi=emrgency_layt.findViewById(R.id.faculties_adres);

        imageView.setImageResource(f_imgs[position]);
        number.setText(fname[position]);
        descpi.setText(adres[position]);
        return emrgency_layt;
    }
}
