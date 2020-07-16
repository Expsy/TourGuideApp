package com.example.android.tourguideapp;

import android.content.Context;
import android.location.Geocoder;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {



    private String tabTitles[] = new String[] {MainActivity.context.getResources().getString(R.string.restaurants_title),
            MainActivity.context.getResources().getString(R.string.shopping_malls_title),
            MainActivity.context.getResources().getString(R.string.hotels_title),
            MainActivity.context.getResources().getString(R.string.parks_title) };

    public CustomFragmentPagerAdapter (FragmentManager fm) {
        super(fm);

    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {


        return 4;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new RestaurantsFragment();
            case 1:
                return new MallsFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new ParksFragment();
                default:
                    return null;
        }
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return tabTitles[position];
    }
}
