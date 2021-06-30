package com.example.scrollingshooter;

class PlayerSpawnComponent implements SpawnComponent {

    @Override
    public void spawn(Transform playerTransform, Transform t) {
        t.setLocation(t.getmScreenSize().x / 2, t.getmScreenSize().y / 2);
    }
}
