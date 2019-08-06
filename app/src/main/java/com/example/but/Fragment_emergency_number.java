package com.example.but;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_emergency_number extends Fragment {

    //ListView liste;
    //String emergency_number[];
    //String emergency_describe[];
    //int imags[]={R.drawable.pan_europan,R.drawable.emergency,R.drawable.fire,R.drawable.police};



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= (View) inflater.inflate(R.layout.layout_emergency_number_fragment,container,false);

        return v;
    }

}
