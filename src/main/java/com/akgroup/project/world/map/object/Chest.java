package com.akgroup.project.world.map.object;

import com.akgroup.project.graphics.Sprite;

public class Chest implements IMapObject {
    @Override
    public void onInteraction() {

    }

    @Override
    public Sprite getSprite() {
        return Sprite.CHEST;
    }
}
