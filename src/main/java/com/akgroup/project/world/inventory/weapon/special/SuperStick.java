package com.akgroup.project.world.inventory.weapon.special;

import com.akgroup.project.graphics.Sprite;
import com.akgroup.project.world.inventory.weapon.AbstractWeapon;

public class SuperStick extends AbstractWeapon {
    public SuperStick() {
        super(42, 60);
    }

    @Override
    public String getName() {
        return "Special stick";
    }

    @Override
    public Sprite getSprite() {
        return Sprite.STICK;
    }
}
