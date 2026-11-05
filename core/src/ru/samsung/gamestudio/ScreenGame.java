package ru.samsung.gamestudio;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class ScreenGame implements Screen {

    int birdX = 0;
    int birdY = 0;
    int birdSpeed = 5;
    Texture birdTexture;


    MyGdxGame myGdxGame;
    ScreenGame(MyGdxGame myGdxGame) {
        this.myGdxGame = myGdxGame;
        birdTexture = new Texture("bird/bird0.png");
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        birdX += birdSpeed;
        birdY += birdSpeed;

        ScreenUtils.clear(1, 0, 0, 1);
        myGdxGame.batch.begin();
        myGdxGame.batch.draw(birdTexture, 0, 0);
        myGdxGame.camera.update();
        myGdxGame.batch.setProjectionMatrix(myGdxGame.camera.combined);
        myGdxGame.batch.end();

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
        birdTexture.dispose();
    }
}
