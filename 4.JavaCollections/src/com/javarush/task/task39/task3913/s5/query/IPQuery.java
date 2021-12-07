package com.javarush.task.task39.task3913.s5.query;

import java.util.Date;
import java.util.Set;

public interface IPQuery {
    int getNumberOfUniqueIPs(Date after, Date before);

    Set<String> getUniqueIPs(Date after, Date before);

    Set<String> getIPsForUser(String user, Date after, Date before);

    Set<String> getIPsForEvent(com.javarush.task.task39.task3913.s5.Event event, Date after, Date before);

    Set<String> getIPsForStatus(com.javarush.task.task39.task3913.s5.Status status, Date after, Date before);

    Set<Date> getDatesForUserAndEvent(String user, com.javarush.task.task39.task3913.s5.Event event, Date after, Date before);
}