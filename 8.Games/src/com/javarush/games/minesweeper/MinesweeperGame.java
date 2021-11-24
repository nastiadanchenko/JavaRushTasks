package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;

    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";

    private GameObject[][] gameField = new GameObject[SIDE][SIDE];

    private int countMinesOnField;
    private int countFlags;
    private int score;
    private int countClosedTiles = SIDE * SIDE;

    private boolean isGameStopped;


    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            restart();
            return;
        }
        openTile(x,y);
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
                setCellValue(x,y,"");
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;

    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors() {
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField.length; x++) {
                GameObject gameObject = gameField[y][x];
                if (!gameObject.isMine) {
                    for (GameObject no : getNeighbors(gameObject)
                    ) {
                        if (no.isMine) {
                            gameObject.countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }

    private void openTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        if (gameObject.isOpen || gameObject.isFlag || isGameStopped) return;
      
        gameObject.isOpen = true;
        countClosedTiles--;
        setCellColor(x,y,Color.GREEN);
        if (gameObject.isMine) {
            setCellValueEx(gameObject.x, gameObject.y, Color.RED, MINE);
            gameOver();
            return;
        } else if (gameObject.countMineNeighbors==0){
            setCellValue(gameObject.x, gameObject.y, "");
            List<GameObject> gameObjectList = getNeighbors(gameObject);
            for (GameObject object: gameObjectList
                 ) {
                if(!object.isOpen)
                openTile(object.x,object.y);
            }
        } else{
            setCellNumber(x,y,gameObject.countMineNeighbors);
        }
        score += 5;
        setScore(score);
        if (countClosedTiles==countMinesOnField) win();

    }

    private void markTile(int x, int y) {
        GameObject gameObjects = gameField[y][x];
        if (gameObjects.isOpen || countFlags==0 && !gameObjects.isFlag || isGameStopped) return;
        if (!gameObjects.isFlag) {
            gameObjects.isFlag = true;
            countFlags--;
            setCellValue(gameObjects.x, gameObjects.y, FLAG);
            setCellColor(gameObjects.x, gameObjects.y, Color.YELLOW);
        } else {
            gameObjects.isFlag = false;
            countFlags++;
            setCellValue(gameObjects.x, gameObjects.y, "");
            setCellColor(gameObjects.x, gameObjects.y, Color.ORANGE);
        }
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED,"You've lost!", Color.BLACK, 14);
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.YELLOW,"You've won!", Color.BLACK, 14);
    }

    private void restart() {
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        score = 0;
        setScore(score);
        countMinesOnField = 0;
        createGame();
    }
}