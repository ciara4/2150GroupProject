package com.example.scrollingshooter;

import android.graphics.PointF;

/*
    This is all the unique specifications for a player
 */
class PlayerSpec extends ObjectSpec {

    private static final String tag = "Player";
    private static final String bitmapName = "player_ship";
    private static final float speed = 1f;
    private static final PointF relativeScale = new PointF(15f, 15f);
    private static final String[] components = new String[]{"PlayerInputComponent", "StdGraphicsComponent", "PlayerMovementComponent", "PlayerSpawnComponent"};

    PlayerSpec() {
        super(tag, bitmapName, speed, relativeScale, components);
    }
}