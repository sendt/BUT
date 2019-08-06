package com.example.but;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EmergencyAdapter extends ArrayAdapter<String> {


    Context c;
    String[] numbers;
    String[] descp;
    int[] images;

     EmergencyAdapter(Context context,String[]numbers,String[]descp,int[] array_img) {
        super(context, R.layout.emergency_layout,numbers);
    this.c=context;
    this.numbers=numbers;
    this.descp=descp;
    this.images=array_img;


     }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View emrgency_layt=inflater.inflate(R.layout.emergency_layout,parent,false);

        ImageView imageView= emrgency_layt.findViewById(R.id.img);
        TextView number=emrgency_layt.findViewById(R.id.number);
        TextView descpi=emrgency_layt.findViewById(R.id.desc);

        imageView.setImageResource(images[position]);
        number.setText(numbers[position]);
        descpi.setText(descp[position]);
        return emrgency_layt;
    }
}
