package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(Helper.generateRandomString());

        HashMapStorageStrategy testStorage = new HashMapStorageStrategy();
        testStrategy(testStorage,10000 );
        OurHashMapStorageStrategy our = new OurHashMapStorageStrategy();
        testStrategy(our,10000);
        FileBucket fileBucket = new FileBucket();
        testStrategy((StorageStrategy) fileBucket,10000);
        OurHashBiMapStorageStrategy biMapStorageStrategy = new OurHashBiMapStorageStrategy();
        testStrategy(biMapStorageStrategy,10000);
        HashBiMapStorageStrategy hashBiMapStorageStrategy = new HashBiMapStorageStrategy();
        testStrategy(hashBiMapStorageStrategy,10000);
        DualHashBidiMapStorageStrategy dualHashBidiMapStorageStrategy = new DualHashBidiMapStorageStrategy();
        testStrategy(dualHashBidiMapStorageStrategy,10000);

    }
    public static Set<Long> getIds(Shortener shortener, Set<String> strings){
        Set<Long> Ids = new HashSet<>();
        for (String str:strings
             ) {
            Ids.add(shortener.getId(str));
        }
        return Ids;
    }
    public static Set<String> getStrings(Shortener shortener, Set<Long> keys){
        Set<String> strings = new HashSet<>();
        for (Long key:keys
             ) {
            strings.add(shortener.getString(key));
        }
        return strings;
    }
    public static void testStrategy(StorageStrategy strategy, long elementsNumber){
        Helper.printMessage(strategy.getClass().getSimpleName()); // не должно быть имени пакета
        Set<String> testStrings = new HashSet<>();
        for (int i = 0; i <elementsNumber ; i++) {
            testStrings.add(Helper.generateRandomString());
        }
        Shortener shortener = new Shortener(strategy);

        Date startGetIds = new Date();
        Set<Long> setIds = getIds(shortener, testStrings);
        Date finishGetIds = new Date();
        long time = finishGetIds.getTime() - startGetIds.getTime();
        Helper.printMessage("Время работы метода getIds() - "+time);

        Date startGetStrings = new Date();
        Set<String> setStrings = getStrings(shortener,setIds );
        Date finishGetStrings = new Date();
        time = finishGetStrings.getTime() - startGetStrings.getTime();
        Helper.printMessage("Время работы метода GetStrings() - "+time);

        if (testStrings.containsAll(setStrings)) Helper.printMessage("Тест пройден.");
        else Helper.printMessage("Тест не пройден.");

    }
}
