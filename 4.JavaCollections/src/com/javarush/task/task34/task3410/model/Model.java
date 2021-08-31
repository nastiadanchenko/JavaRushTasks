package com.javarush.task.task34.task3410.model;

import com.javarush.task.task34.task3410.controller.EventListener;

import java.net.URISyntaxException;
import java.nio.file.Paths;

public class Model {
    public final static int FIELD_CELL_SIZE = 20;
    private EventListener eventListener;

    private GameObjects gameObjects;
    private int currentLevel = 1;
    LevelLoader levelLoader;

    public Model() {
        try {
            levelLoader = new LevelLoader(Paths.get(getClass().getResource("../res/levels.txt").toURI()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
    public void restartLevel(int level){
        gameObjects = levelLoader.getLevel(level);
    }
    public void restart(){
        restartLevel(currentLevel);
    }
    public void startNextLevel(){
        currentLevel++;
        restartLevel(currentLevel);
    }
    public GameObjects getGameObjects(){
        return gameObjects;
    }

    public void move(Direction direction) {
    }
}
