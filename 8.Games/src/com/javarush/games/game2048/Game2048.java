package com.javarush.games.game2048;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Key;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;
    private int score;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        gameField = new int[SIDE][SIDE];
        score = 0;
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
        if (getMaxTileValue() >= 2048) {
            win();
            return;
        }
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

    private void win() {
        showMessageDialog(Color.GREEN, "You win", Color.BLACK, 75);
        isGameStopped = true;
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
                    setScore(score += sum);
                }
            }
        }
        return result;
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.SPACE) {
                isGameStopped = false;
                createGame();
                setScore(score);
                drawScene();
            } else return;
        }
        if (!canUserMove()) {
            gameOver();
            return;
        }
        if (key == Key.LEFT) {
            moveLeft();
        } else if (key == Key.RIGHT) {
            moveRight();
        } else if (key == Key.UP) {
            moveUp();
        } else if (key == Key.DOWN) {
            moveDown();
        } else return;

        drawScene();
    }

    private void moveUp() {
        for (int i = 0; i < 4; i++) {
            if (i == 3) moveLeft();
            rotateClockwise();

        }
    }

    private void moveDown() {
        for (int i = 0; i < 4; i++) {
            if (i == 1) moveLeft();
            rotateClockwise();

        }
    }

    private void moveRight() {
        for (int i = 0; i < 4; i++) {
            if (i == 2) moveLeft();
            rotateClockwise();

        }

    }

    private void moveLeft() {
        boolean isNewNumberNeeded = false;
        for (int[] row : gameField) {
            boolean wasCompressed = compressRow(row);
            boolean wasMerged = mergeRow(row);
            if (wasMerged) {
                compressRow(row);
            }
            if (wasCompressed || wasMerged) {
                isNewNumberNeeded = true;
            }
        }
        if (isNewNumberNeeded) {
            createNewNumber();
        }
    }

    private void rotateClockwise() {
        int[][] result = new int[SIDE][SIDE];
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                result[j][SIDE - 1 - i] = gameField[i][j];
            }
        }
        gameField = result;
    }

    private int getMaxTileValue() {
        int max = gameField[0][0];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (gameField[i][j] > max) max = gameField[i][j];
            }
        }
        return max;
    }

    private boolean canUserMove() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                if (gameField[y][x] == 0) {
                    return true;
                } else if (y < SIDE - 1 && gameField[y][x] == gameField[y + 1][x]) {
                    return true;
                } else if ((x < SIDE - 1) && gameField[y][x] == gameField[y][x + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private void gameOver() {
        showMessageDialog(Color.RED, "You over!", Color.BLACK, 75);
        isGameStopped = true;
    }
}

