package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_layout, container, false);


        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.restaurant1), getString(R.string.restaurant_address1)));
        locations.add(new Location(getString(R.string.restaurant2), getString(R.string.restaurant_address2)));
        locations.add(new Location(getString(R.string.restaurant3), getString(R.string.restaurant_address3)));

        ListView listView = rootView.findViewById(R.id.rootView);
        listView.setAdapter(new CustomListAdapter(getActivity(), locations));

        return rootView;
    }

}
