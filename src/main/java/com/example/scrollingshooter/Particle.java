package com.example.scrollingshooter;

import android.graphics.PointF;

class Particle {
    PointF mVelocity;
    PointF mPosition;

    Particle(PointF direction) {
        mVelocity = new PointF();
        mPosition = new PointF();
        // Determine the direction
        mVelocity.x = direction.x;
        mVelocity.y = direction.y;
    }

    void update() {
        // Move the particle
        mPosition.x += mVelocity.x;
        mPosition.y += mVelocity.y;
    }

    PointF getPosition() {
        return mPosition;
    }

    void setPosition(PointF position) {
        mPosition.x = position.x;
        mPosition.y = position.y;
    }
}