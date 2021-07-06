package com.example.scrollingshooter;

import android.graphics.PointF;

/*
    Specifies the laser fired by the player
 */
class PlayerLaserSpec extends ObjectSpec {

    // This is all the unique specifications for a player laser
    private static final String tag = "Player Laser";
    private static final String bitmapName = "player_laser";
    private static final float speed = .65f;
    private static final PointF relativeScale = new PointF(10f, 10f);
    private static final String[] components = new String[]{"StdGraphicsComponent", "LaserMovementComponent", "LaserSpawnComponent"};

    PlayerLaserSpec() {
        super(tag, bitmapName, speed, relativeScale, components);
    }
}