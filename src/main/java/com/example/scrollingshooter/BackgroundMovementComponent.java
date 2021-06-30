package com.example.scrollingshooter;

/*
    Moves the two images on the screen to give the illusion of scrolling
 */
class BackgroundMovementComponent implements MovementComponent {

    @Override
    public boolean move(long fps, Transform t, Transform playerTransform) {

        int currentXClip = t.getXClip();

        if (playerTransform.getFacingRight()) {
            currentXClip -= t.getSpeed() / fps;
            t.setXClip(currentXClip);
        } else {
            currentXClip += t.getSpeed() / fps;
            t.setXClip(currentXClip);
        }
        if (currentXClip >= t.getSize().x) {
            t.setXClip(0);
            t.flipReversedFirst();
        } else if (currentXClip <= 0) {
            t.setXClip((int) t.getSize().x);
            t.flipReversedFirst();
        }
        return true;
    }
}