package com.example.but;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactUsFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap map;
    static final  LatLng iro=new LatLng(53.1155353, 23.1472966);
    static  final LatLng faculty_of_computer_science=new LatLng(53.1167051,23.1439263);
    static  final LatLng faculty_of_architecture=new LatLng(53.1289409,23.1440811);
    static  final LatLng faculty_of_civil_and_enviromental_engineering=new LatLng(53.1167328,23.1286054);
    static  final LatLng faculty_of_electrical_engineering=new LatLng(53.1174861,23.1474152);
    static  final LatLng faculty_of_mechanical_engineering=new LatLng(53.1170368,23.1456751);
    static  final LatLng faculty_of_engineering_management=new LatLng(53.0981514,23.1234826);
    static  final LatLng faculty_of_forestry_inhajnowka=new LatLng(52.7361272,23.5893153);


    public ContactUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_contact_us, container, false);


        return  v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment=(SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        map=googleMap;
        if(map != null){
            map.addMarker(new MarkerOptions().position(iro)
            .title("BUT Erasmus Office")
            .snippet("if you hava any problems :)")
            .icon(BitmapDescriptorFactory.fromResource(R.mipmap.logo)));                            //var


            map.addMarker(new MarkerOptions().position(faculty_of_computer_science)
                    .title("Computer Science")                                                      //var
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.computer)));

            map.addMarker(new MarkerOptions().position(faculty_of_architecture)
                    .title("Faculty of Architecture")                                               //
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.architecture)));

            map.addMarker(new MarkerOptions().position(faculty_of_civil_and_enviromental_engineering)
                    .title("Faculty of Civil And Enviromental Engineering")                         //var
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.civil)));

            map.addMarker(new MarkerOptions().position(faculty_of_electrical_engineering)
                    .title("Faculty of Electrical Engineering")                                     //var
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.elect)));

            map.addMarker(new MarkerOptions().position(faculty_of_mechanical_engineering)
                    .title("Faculty of Mechanical Engineering")                                     //var
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.mechanical)));

            map.addMarker(new MarkerOptions().position(faculty_of_engineering_management)
                    .title("Faculty of Engineering Management")                                     //var
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.manegment)));

            map.addMarker(new MarkerOptions().position(faculty_of_forestry_inhajnowka)
                    .title("Faculty of Foresty Inhajnowka")                                         //var
                    .icon(BitmapDescriptorFactory.fromResource(R.mipmap.foresty)));


            UiSettings uis=googleMap.getUiSettings();
            uis.setCompassEnabled(true);
            uis.setZoomControlsEnabled(true);
            uis.setMyLocationButtonEnabled(true);

        }

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(iro,16));

}


}
