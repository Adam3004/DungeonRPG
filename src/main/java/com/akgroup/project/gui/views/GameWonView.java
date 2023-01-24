package com.akgroup.project.gui.views;

import com.akgroup.project.engine.IGameObserver;
import com.akgroup.project.graphics.Font;
import com.akgroup.project.graphics.FontManager;
import com.akgroup.project.graphics.FontSize;

import java.awt.*;

public class GameWonView extends InteractionView {

    private Font classic;

    public GameWonView(Graphics2D graphics2D, IGameObserver observer) {
        super(graphics2D, observer);
    }

    @Override
    public void render() {
        classic.drawStringOnCenter(FontSize.BIG_FONT, "YOU WON THE GAME", 0, 350, 800);
    }

    @Override
    public void onKeyClicked(Integer keyCode) {

    }

    @Override
    public void initView() {
        this.classic = FontManager.getManager().getClassic();
    }
}
