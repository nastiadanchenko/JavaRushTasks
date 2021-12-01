package com.javarush.games.game2048;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int x = 0; x < gameField.length; x++) {
            for (int y = 0; y < gameField.length; y++) {
                setCellColoredNumber(x, y, gameField[y][x]);
            }
        }
    }

    private void createNewNumber() {
        boolean isCreated = false;
        do {
            int x = getRandomNumber(SIDE);
            int y = getRandomNumber(SIDE);
            if (gameField[y][x] == 0) {
                gameField[y][x] = getRandomNumber(10) < 9 ? 2 : 4;
                isCreated = true;
            }
        }
        while (!isCreated);
    }

    private Color getColorByValue(int value) {
        switch (value) {
            case 0:
                return Color.WHEAT;
            case 2:
                return Color.BLUE;
            case 4:
                return Color.AQUA;
            case 8:
                return Color.GREEN;
            case 16:
                return Color.GRAY;
            case 32:
                return Color.BROWN;
            case 64:
                return Color.CORAL;
            case 128:
                return Color.DEEPPINK;
            case 256:
                return Color.FUCHSIA;
            case 512:
                return Color.HONEYDEW;
            case 1024:
                return Color.INDIGO;
            case 2048:
                return Color.LAVENDER;
            default:
                return Color.NONE;
        }
    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color color = getColorByValue(value);
        String str = value > 0 ? "" + value : "";
        setCellValueEx(x, y, color, str);
    }

    private boolean compressRow(int[] row) {
        boolean isCompress = false;
        int index = 0;
        for (int x = 0; x < SIDE; x++) {
            if (row[x] > 0) {
                if (x != index) {
                    row[index] = row[x];
                    row[x] = 0;
                    isCompress = true;
                }
                index++;
            }
        }
        return isCompress;
    }

    private boolean mergeRow(int[] row) {
        boolean result = false;
        int sum = 0;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] > 0) {
                if (row[i] == row[i + 1]) {
                    sum = row[i] + row[i + 1];
                    row[i] = sum;
                    row[i + 1] = 0;
                    result = true;
                }
            }
        }

        return result;
    }
}

