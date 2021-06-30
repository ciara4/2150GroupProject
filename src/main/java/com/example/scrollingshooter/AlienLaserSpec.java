package com.example.scrollingshooter;

import android.graphics.PointF;

/*
    Specifies the laser fired by the aliens
 */
class AlienLaserSpec extends ObjectSpec {

    // This is all the unique specifications for an alien laser
    private static final String tag = "Alien Laser";
    private static final String bitmapName = "alien_laser";
    private static final float speed = .75f;
    private static final PointF relativeScale = new PointF(14f, 160f);
    private static final String[] components = new String[]{"StdGraphicsComponent", "LaserMovementComponent", "LaserSpawnComponent"};

    AlienLaserSpec() {
        super(tag, bitmapName, speed, relativeScale, components);
    }
}