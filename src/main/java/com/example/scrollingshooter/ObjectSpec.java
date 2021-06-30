package com.example.scrollingshooter;

import android.graphics.PointF;

/*
    Parent class for all specification classes.
    Has all the getters required by the factory class
 */
abstract class ObjectSpec {
    private String mTag;
    private String mBitmapName;
    private float mSpeed;
    private PointF mSizeScale;
    private String[] mComponents;

    ObjectSpec(String tag, String bitmapName, float speed, PointF relativeScale, String[] components) {
        mTag = tag;
        mBitmapName = bitmapName;
        mSpeed = speed;
        mSizeScale = relativeScale;
        mComponents = components;
    }

    String getTag() {
        return mTag;
    }

    String getBitmapName() {
        return mBitmapName;
    }

    float getSpeed() {
        return mSpeed;
    }

    PointF getScale() {
        return mSizeScale;
    }

    String[] getComponents() {
        return mComponents;
    }
}