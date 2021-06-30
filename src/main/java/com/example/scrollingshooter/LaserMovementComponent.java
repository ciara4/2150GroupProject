package com.example.scrollingshooter;

import android.graphics.PointF;

/*
    Handles movement of the laser object
 */
class LaserMovementComponent implements MovementComponent {

    @Override
    public boolean move(long fps, Transform t, Transform playerTransform) {
        float range = t.getmScreenSize().x * 2;

        // Where is the laser
        PointF location = t.getLocation();

        // How fast is it going
        float speed = t.getSpeed();
        if (t.headingRight()) {
            location.x += speed / fps;
        } else if (t.headingLeft()) {
            location.x -= speed / fps;
        }

        // Has the laser gone out of range
        if (location.x < -range || location.x > range) {

            // disable the laser
            return false;
        }
        t.updateCollider();

        return true;
    }
}