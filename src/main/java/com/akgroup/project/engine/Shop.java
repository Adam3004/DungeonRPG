package com.akgroup.project.engine;

import com.akgroup.project.util.NumberGenerator;
import com.akgroup.project.world.inventory.IInventoryObject;
import com.akgroup.project.world.inventory.mixtures.Potion;
import com.akgroup.project.world.inventory.weapon.BasicWeapon;

public class Shop {
    private IInventoryObject[] itemsToBuy;
    private int[] prizes;

    public Shop() {
        this.prizes = new int[3];
        this.itemsToBuy = new IInventoryObject[3];
    }

    //    after creating new Shop you have to run shop.randItems(lvl)  !
    public void randItems(int lvl) {
        for (int i = 0; i < 3; i++) {
            if (NumberGenerator.generateNextInt(0, 100) <= 70) {
                itemsToBuy[i] = Potion.HEALTH;
                prizes[i] = lvl * 5 + 20;
            }
            if (NumberGenerator.generateNextInt(0, 6) <= 3) {
                itemsToBuy[i] = BasicWeapon.DAGGER;
                prizes[i] = lvl * 15 + 30;
            }
            if (NumberGenerator.generateNextInt(0, 6) <= 3) {
                itemsToBuy[i] = BasicWeapon.KNIFE;
                prizes[i] = lvl * 15 + 35;
            }
            itemsToBuy[i] = BasicWeapon.STICK;
            prizes[i] = lvl * 15 + 45;
        }
    }

    public IInventoryObject[] getItemsToBuy() {
        return itemsToBuy;
    }

    public int[] getPrizes() {
        return prizes;
    }

    public IInventoryObject getItemFromPosition(int position) {
        if (position < 0 || position > 2) {
            return null;
        }
        return itemsToBuy[position];
    }

    public int getValueOfiItemFromPosition(int position) {
        return prizes[position];
    }

    public void removeItemFromPosition(int position) {
        if (position < 0 || position > 2) {
            return;
        }
        itemsToBuy[position] = null;
    }
}
