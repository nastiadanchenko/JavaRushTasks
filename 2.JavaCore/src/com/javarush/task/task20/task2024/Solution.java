package com.javarush.task.task20.task2024;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/
public class Solution implements Serializable{
    int node;
    List<Solution> edges = new LinkedList<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution solution = new Solution();
        solution.node = 1;
        for (int i = 1; i <10; i++) {
            Solution tmp = new Solution();
            tmp.node = i + 1;
            solution.edges.add(tmp);
        }
        System.out.println("Solution # "+ solution.node);
        for (Solution sol:solution.edges
             ) {
            System.out.println("Solution # "+ sol.node);
        }
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FileTest"));
        out.writeObject(solution);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("FileTest"));
        Solution solution1 = (Solution) in.readObject();
        in.close();
        System.out.println("==============");
        System.out.println("Solution # "+ solution.node);
        for (Solution sol:solution.edges
                ) {
            System.out.println("Solution # "+ sol.node);
        }

    }
}
