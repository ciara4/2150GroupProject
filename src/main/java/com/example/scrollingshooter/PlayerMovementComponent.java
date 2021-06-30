package com.example.scrollingshooter;

import android.graphics.PointF;

/*
    Handles how the player moves within the screen boundaries
 */
class PlayerMovementComponent implements MovementComponent {

    @Override
    public boolean move(long fps, Transform t, Transform playerTransform) {

        // How high is the screen?
        float screenHeight = t.getmScreenSize().y;

        // Where is the player?
        PointF location = t.getLocation();

        // How fast is it going
        float speed = t.getSpeed();

        // How tall is the ship
        float height = t.getObjectHeight();

        // Move the ship up or down if needed
        if (t.headingDown()) {
            location.y += speed / fps;
        } else if (t.headingUp()) {
            location.y -= speed / fps;
        }

        // Make sure the ship can't go off the screen
        if (location.y > screenHeight - height) {
            location.y = screenHeight - height;
        } else if (location.y < 0) {
            location.y = 0;
        }

        // Update the collider
        t.updateCollider();
        return true;
    }
}