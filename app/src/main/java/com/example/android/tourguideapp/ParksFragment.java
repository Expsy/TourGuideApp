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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_layout, container, false);


        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.park1), getString(R.string.park_address1), R.drawable.park_fenerbahce));
        locations.add(new Location(getString(R.string.park2), getString(R.string.park_address2), R.drawable.park_haydar_aliyev));
        locations.add(new Location(getString(R.string.park3), getString(R.string.park_address3), R.drawable.park_yildiz));

        ListView listView = rootView.findViewById(R.id.rootView);
        listView.setAdapter(new CustomListAdapter(getActivity(), locations));

        return rootView;
    }

}
