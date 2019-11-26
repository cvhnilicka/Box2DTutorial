package com.cormickhnilicka.box2dtutorial.Views;

import com.badlogic.gdx.Screen;
import com.cormickhnilicka.box2dtutorial.Box2DTutorial;

public class LoadingScreen implements Screen {
    private Box2DTutorial parent;

    public LoadingScreen(Box2DTutorial parent) {
        this.parent = parent;
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        // its done loading, lets change the screen
        parent.changeScreen(Box2DTutorial.MENU);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
