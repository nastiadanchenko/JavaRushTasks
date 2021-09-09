package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Helper;
import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.HashBiMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SpeedTest {


    public long getTimeToGetIds(Shortener shortener, Set<String> strings, Set<Long> ids) {
        Date startTime = new Date();
        for (String str : strings
        ) {
            ids.add(shortener.getId(str));
        }
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    public long getTimeToGetStrings(Shortener shortener, Set<Long> ids, Set<String> strings){
        Date startTime = new Date();
        for (Long id : ids
        ) {
            strings.add(shortener.getString(id));
        }
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }
    @Test 
    public void testHashMapStorage() {
        Shortener shortener1 = new Shortener(new HashMapStorageStrategy());
        Shortener shortener2 = new Shortener(new HashBiMapStorageStrategy());

        Set<String> origStrings = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            origStrings.add(Helper.generateRandomString());
        }

        Set<Long> idsString1 = new HashSet<>();
        Set<String> stringsId1 = new HashSet<>();
        long timeToGetIds1 = getTimeToGetIds(shortener1, origStrings, idsString1);
        long timeStringsToId1 = getTimeToGetStrings(shortener1, idsString1, stringsId1);

        Set<Long> idsString2 = new HashSet<>();
        Set<String> stringsId2 = new HashSet<>();
        long timeToGetIds2 = getTimeToGetIds(shortener2, origStrings, idsString2);
        long timeStringsToId2 = getTimeToGetStrings(shortener2, idsString2, stringsId2);

        Assert.assertTrue(timeToGetIds1>timeToGetIds2);
        Assert.assertEquals(timeStringsToId1,timeStringsToId2, 30);
    }
}
