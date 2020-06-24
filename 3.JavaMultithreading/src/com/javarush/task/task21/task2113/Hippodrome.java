package com.javarush.task.task21.task2113;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 17.06.2020.
 */
public class Hippodrome {
    private List<Horse> horses; //= new ArrayList<>();
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run(){
        for (int i = 1; i <=100 ; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void print(){
        for (Horse hPrint :horses
             ) {
            hPrint.print();
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println();
        }
    }
    public void move(){
        for (Horse hMove:horses
             ) {
            hMove.move();
        }

    }
    public Horse getWinner(){
        double maxDistans = 0;
        Horse horseWinener = null;
        for (Horse horse:horses
             ) {
            if (horse.getDistance()>maxDistans){
                maxDistans = horse.getDistance();
                horseWinener = horse;
            }
        }
        return horseWinener;
    }
    public void printWinner(){
        System.out.println(String.format("Winner is %s!", getWinner().getName()));
    }
    public static void main(String[] args) {
        Horse horse1 = new Horse("Horse1", 3, 0);
        Horse horse2 = new Horse("Horse2", 3, 0);
        Horse horse3 = new Horse("Horse3", 3, 0);
        
        game = new Hippodrome(Arrays.asList(horse1,horse2,horse3));
        System.out.println(game.getHorses());

        game.run();
        game.printWinner();
    }
}
