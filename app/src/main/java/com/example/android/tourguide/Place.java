package com.example.android.tourguide;

public class Place {

    private String mPlaceName;

    private String mPlaceDescription;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String placeName, String placeDescription) {
        this.mPlaceName = placeName;
        this.mPlaceDescription = placeDescription;
    }

    public Place(String placeName, String placeDescription, int imageResourceId) {
        this.mPlaceName = placeName;
        this.mPlaceDescription = placeDescription;
        mImageResourceId = imageResourceId;

    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
