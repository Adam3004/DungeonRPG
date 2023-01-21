package com.akgroup.project.engine;

import com.akgroup.project.world.characters.enemies.AbstractEnemyClass;

public interface IGameObserver {
    void onCharacterChoose(int classID);

    void onInteractionExit();

    void enterRoom(int roomID, AbstractEnemyClass enemy);
}
