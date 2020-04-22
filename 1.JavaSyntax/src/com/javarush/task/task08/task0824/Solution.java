package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        Human doter1 = new Human("doter", false, 20, new ArrayList<>());
        Human doter = new Human("doter", false, 20,new ArrayList<>());
        Human son = new Human("son", true, 26,new ArrayList<>());
        Human father = new Human("father", true, 45, new ArrayList<>(Arrays.asList(doter,doter1,son)));
        /*father.children.add(son);
        father.children.add(doter);
        father.children.add(doter1);*/
        Human mother = new Human("mather", false, 40, new ArrayList<>(Arrays.asList(doter,doter1,son)));
       /* mother.children.add(son);
        mother.children.add(doter);
        mother.children.add(doter1);*/
        Human ba = new Human("бабушка", false,65,new ArrayList<>(Arrays.asList(father)));
        Human dad = new Human("dad", true, 73,new ArrayList<>(Arrays.asList(father)));
        Human ba1 = new Human("бабушка", false,65,new ArrayList<>(Arrays.asList(mother)));
        Human dad1 = new Human("dad", true, 73,new ArrayList<>(Arrays.asList(mother)));
       /* System.out.println(ba.toString());
        System.out.println(dad.toString());
        System.out.println(dad1.toString());
        System.out.println(ba1.toString());
        System.out.println(mother.toString());
        System.out.println( father.toString());
        System.out.println(doter1.toString());
        System.out.println(doter.toString());
        System.out.println(son.toString());*/

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        public Human( String name, boolean sex,  int age,ArrayList<Human>children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>(children);

            System.out.println(toString());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
