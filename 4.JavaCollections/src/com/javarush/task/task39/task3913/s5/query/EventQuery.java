package com.javarush.task.task39.task3913.s5.query;

import com.javarush.task.task39.task3913.s5.Event;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public interface EventQuery {
    int getNumberOfAllEvents(Date after, Date before);

    Set<com.javarush.task.task39.task3913.s5.Event> getAllEvents(Date after, Date before);

    Set<com.javarush.task.task39.task3913.s5.Event> getEventsForIP(String ip, Date after, Date before);

    Set<com.javarush.task.task39.task3913.s5.Event> getEventsForUser(String user, Date after, Date before);

    Set<Event> getFailedEvents(Date after, Date before);

    Set<com.javarush.task.task39.task3913.s5.Event> getErrorEvents(Date after, Date before);

    int getNumberOfAttemptToSolveTask(int task, Date after, Date before);

    int getNumberOfSuccessfulAttemptToSolveTask(int task, Date after, Date before);

    Map<Integer, Integer> getAllSolvedTasksAndTheirNumber(Date after, Date before);

    Map<Integer, Integer> getAllDoneTasksAndTheirNumber(Date after, Date before);
}