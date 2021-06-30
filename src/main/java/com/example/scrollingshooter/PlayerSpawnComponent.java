package com.example.scrollingshooter;

/*
    Specifies where the player is spawned on screen
 */
class PlayerSpawnComponent implements SpawnComponent {

    @Override
    public void spawn(Transform playerTransform, Transform t) {
        t.setLocation(t.getmScreenSize().x / 2, t.getmScreenSize().y / 2);
    }
}