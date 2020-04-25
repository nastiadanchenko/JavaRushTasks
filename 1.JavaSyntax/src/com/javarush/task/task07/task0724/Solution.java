package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ba = new Human("бабушка", false, 65);
        Human dad = new Human("dad", true, 73);
        Human ba1 = new Human("бабушка", false, 65);
        Human dad1 = new Human("dad", true, 73);
        Human father = new Human("father", true, 45,dad ,ba );
        Human mother = new Human("mather", false, 40,dad1 ,ba1);
        Human doter1 = new Human("doter", false, 20,father,mother);
        Human doter = new Human("doter", false, 21,father,mother);
        Human son = new Human("son", true, 26,father,mother);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human( String name, boolean sex,  int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println(toString());
        }


        public Human( String name, boolean sex,  int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

            System.out.println(toString());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}