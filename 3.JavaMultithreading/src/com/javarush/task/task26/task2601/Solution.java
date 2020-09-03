package com.javarush.task.task26.task2601;

import java.util.*;

/* 
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        int mediana;
        class Medianator implements Comparable<Medianator>{
            int offset;          //  расстояние от медианы до данного значения в массиве.
            int value;          //  само значение в массиве.

            public Medianator(int offset, int value){
                this.offset = offset;
                this.value = value;
            }

            public int getOffset() {
                return offset;
            }

            public void setOffset(int offset) {
                this.offset = offset;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            @Override
            public int compareTo(Medianator o) {
                if(offset > o.offset) return 1;
                else if(offset < o.offset) return -1;
                else if(value > o.value) return 1;
                else if(value < o.value) return -1;
                return 0;
            }
        }
        //проверка массива на нечетность количества элементов в нем.
        //если нечетный:
        if(array.length % 2 != 0){
            Integer[] testArray = array;
            Arrays.sort(testArray);          //отсортировать массив по возрастани.
            mediana = testArray[testArray.length/2];          //по определению медианы - медиана — это такое число, что половина из элементов выборки больше него, а другая половина меньше.
        }
        //если четный:
        else{
            Integer[] testArray = array;
            Arrays.sort(testArray);
            int mediana1 = testArray[testArray.length/2];
            int mediana2 = testArray[testArray.length/2 - 1];
            mediana = (mediana1 + mediana2)/2;
        }
        List<Medianator> listOfMedianators = new ArrayList<>();
        // итерируясь по массиву добавил в этот список создаваемые объекты медианаторы: для каждого элемента массива - один объект.
        for(int i = 0; i < array.length; i++){
            int keyOffset = mediana - array[i];
            if (keyOffset < 0)
                keyOffset *= -1; //получение расстояния до медианы по модулю.
            int value = array[i];
            Medianator medianator = new Medianator(keyOffset, value);
            listOfMedianators.add(medianator);
        }
        //отсортировал список медианаторов: (если бы не был реализован интерфейс Comparable - отсортировать бы не получилось.
        Collections.sort(listOfMedianators);
        //создать пустой новый массив для возвращения:
        Integer[] newArray = array;
        for(int i = 0; i < listOfMedianators.size(); i++){
            int value = listOfMedianators.get(i).getValue();
            newArray[i] = value;
        }
            return newArray;
    }

    public static double FindMedian(int[] entities)
    {
        if (entities == null || entities.length == 0)
        {
            return 0;
        }

        int[] copyEntities = entities.clone();
        Arrays.sort(copyEntities);

        if (copyEntities.length % 2 == 0)
        {
            return ((copyEntities[copyEntities.length / 2] + copyEntities[copyEntities.length / 2 - 1]) / 2f);
        }

        return copyEntities[copyEntities.length / 2];
    }
}
