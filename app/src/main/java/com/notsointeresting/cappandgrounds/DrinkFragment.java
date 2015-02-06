package com.notsointeresting.cappandgrounds;



import android.content.Intent;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.notsointeresting.cappandgrounds.drinkpages.*;

import java.util.ArrayList;
import java.util.List;


/*created using Android Studio (Beta) 0.8.14
www.101apps.co.za*/

public class DrinkFragment extends Fragment {


    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;

    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;
    private GridView gridView;

    private Adapter adapter;

    ListView list;
    String[] web = {
            "Cappuccino",
            "Caffè macchiato",
            "Doppio",
            "Mocha",
            "Cafe BonBon",
            "Steamer",
            "Latte",
            "Americano"
    } ;
    Integer[] imageId = {
            R.drawable.cappuccino,
            R.drawable.m,
            R.drawable.doppio,
            R.drawable.mocha,
            R.drawable.bonbon,
            R.drawable.milk,
            R.drawable.latte,
            R.drawable.ameicano
    };
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = (View) inflater.inflate(R.layout.fragment_drinks, container, false);



        CustomList adapter = new
                CustomList(getActivity(), web, imageId);
        ListView list = (ListView) rootView.findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();


                switch( position ) {

                    case 0:

                        Intent capp = new Intent(getActivity(),Capp.class);
                        startActivity(capp);



                        break;


                    case 1:

                        Intent caffe = new Intent(getActivity(),Caffe.class);
                        startActivity(caffe);



                        break;

                    case 2:

                        Intent doppio = new Intent(getActivity(),Doppio.class);
                        startActivity(doppio);



                        break;

                    case 3:

                        Intent mocha = new Intent(getActivity(),Mocha.class);
                        startActivity(mocha);



                        break;

                    case 4:

                        Intent bon = new Intent(getActivity(),Bon.class);
                        startActivity(bon);



                        break;

                    case 5:

                        Intent steam = new Intent(getActivity(),Steam.class);
                        startActivity(steam);



                        break;

                    case 6:

                        Intent latte = new Intent(getActivity(),Latte.class);
                        startActivity(latte);



                        break;

                    case 7:

                        Intent americano = new Intent(getActivity(),Americano.class);
                        startActivity(americano);



                        break;













                }





            }});


        return rootView;
    }



}
