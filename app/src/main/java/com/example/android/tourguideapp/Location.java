package com.example.android.tourguideapp;

public class Location {
    private String mName;
    private String mAddress;
    public static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceID = -1;

    public Location(String name, String address) {
        mName = name;
        mAddress = address;
    }

    public Location(String name, String address, int imageResourceID) {
        mName = name;
        mAddress = address;
        mImageResourceID = imageResourceID;
    }

    public String getName() {
        return mName;
    }

    public String getAdress() {
        return mAddress;
    }

    public boolean hasImage() {
        return (mImageResourceID != NO_IMAGE_PROVIDED);
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }
}
