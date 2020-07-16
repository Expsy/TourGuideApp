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
public class MallsFragment extends Fragment {

    public MallsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_layout, container, false);


        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.mall1), getString(R.string.mall_address1)));
        locations.add(new Location(getString(R.string.mall2), getString(R.string.mall_address2)));
        locations.add(new Location(getString(R.string.mall3), getString(R.string.mall_address3)));

        ListView listView = rootView.findViewById(R.id.rootView);
        listView.setAdapter(new CustomListAdapter(getActivity(), locations));

        return rootView;
    }

}
