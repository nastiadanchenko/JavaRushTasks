package com.javarush.task.task35.task3513;

/**
 * Created by User on 20.10.2020.
 */
public class MoveEfficiency implements Move {
    private int numberOfEmptyTiles;
    private int score;
    private Move move;

    public MoveEfficiency(int numberOfEmptyTiles, int score, Move move) {
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
        this.move = move;
    }

    public Move getMove() {
        return move;
    }

    @Override
    public void move() {

    }
}
