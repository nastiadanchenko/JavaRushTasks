package com.javarush.task.task38.task3812;

/* 
Обработка аннотаций
*/

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static boolean printFullyQualifiedNames(Class c) {

        try {
            PrepareMyTest prepareMyTest = ( PrepareMyTest) c.getAnnotation(PrepareMyTest.class);
            for (String fullQN: prepareMyTest.fullyQualifiedNames()
                 ) {
                System.out.println(fullQN);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean printValues(Class c) {

        try {
            PrepareMyTest prepareMyTest = ( PrepareMyTest) c.getAnnotation(PrepareMyTest.class);
            for (Class value : prepareMyTest.value()){
                System.out.println(value.getSimpleName());
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
