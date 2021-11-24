package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";

    private List<GameObject> snakeParts = new ArrayList<>();
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;

    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void draw(Game game) {
        Color color = isAlive ? Color.BLACK : Color.RED;

        for (int i = 0; i < snakeParts.size(); i++) {
            GameObject part = snakeParts.get(i);
            String sign = (i != 0) ? BODY_SIGN : HEAD_SIGN;
            game.setCellValueEx(part.x, part.y, Color.NONE, sign, color, 75);
        }
    }

    public void move(Apple apple) {

        GameObject go = createNewHead();
        if (go.x >= SnakeGame.WIDTH
                || go.x < 0
                || go.y >= SnakeGame.HEIGHT
                || go.y < 0)
                {
            this.isAlive = false;
            return;
        }
        if( checkCollision(go)){
            this.isAlive = false;
            return;
        }
                snakeParts.add(0, go);
                if (go.x == apple.x && go.y == apple.y) {
                    apple.isAlive = false;
                } else {
                    removeTail();
                }
        }

    public GameObject createNewHead() {
        GameObject oldHead = snakeParts.get(0);
        GameObject newHead;
        switch (direction) {
            case LEFT:
                newHead = new GameObject(oldHead.x - 1, oldHead.y);
                break;
            case RIGHT:
                newHead = new GameObject(oldHead.x + 1, oldHead.y);
                break;
            case UP:
                newHead = new GameObject(oldHead.x, oldHead.y - 1);
                break;
            default:
                DOWN:
                newHead = new GameObject(oldHead.x, oldHead.y + 1);
        }
        return newHead;
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public void setDirection(Direction direction) {
        if ((this.direction == Direction.LEFT || this.direction == Direction.RIGHT) && snakeParts.get(0).x == snakeParts.get(1).x) {
            return;
        }
        if ((this.direction == Direction.UP || this.direction == Direction.DOWN) && snakeParts.get(0).y == snakeParts.get(1).y) {
            return;
        }

        if (direction == Direction.UP && this.direction == Direction.DOWN) {
            return;
        } else if (direction == Direction.LEFT && this.direction == Direction.RIGHT) {
            return;
        } else if (direction == Direction.RIGHT && this.direction == Direction.LEFT) {
            return;
        } else if (direction == Direction.DOWN && this.direction == Direction.UP) {
            return;
        }

        this.direction = direction;
    }

    public boolean checkCollision(GameObject gameObject) {
        for (GameObject go:snakeParts
             ) {
            if (go.x == gameObject.x && go.y == gameObject.y) {
                return true;
            }
        }

        return false;
    }
 public int getLength() {
     return snakeParts.size();
 }
}


