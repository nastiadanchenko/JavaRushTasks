package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat dad = new Cat(reader.readLine());
        Cat ba = new Cat(reader.readLine());
        Cat fater = new Cat(reader.readLine(), null,dad);
        Cat mother = new Cat(reader.readLine(), ba, null);
        Cat son = new Cat(reader.readLine(), mother, fater);
        Cat doughter = new Cat(reader.readLine(), mother, fater);

    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
            System.out.println(toString());
        }

        Cat(String name, Cat mother ,Cat father ) {
            this.name = name;
            this.mother = mother;
            this.father = father;
            System.out.println(toString());
        }

        @Override
        public String toString() {
            String text = "";
            text += "The cat's name is " + this.name;

            if (this.father != null && this.mother==null) {
                text += ", no mother, father is " + this.father.name;
            }

            if (this.mother != null && this.father==null) {
                text += ", mother is " + this.mother.name+ ", no father";
            }
            if (this.mother != null && this.father!=null){
                text += ", mother is " + this.mother.name + ", father is " + this.father.name;
            }
            if (this.mother == null && this.father==null){
                text += ", no mother, no father";
            }

            return text;

        }
    }

}
