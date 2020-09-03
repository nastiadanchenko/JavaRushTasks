package com.javarush.task.task30.task3008;

/**
 * Created by User on 02.09.2020.
 */
public enum MessageType { // отвечает за тип сообщений пересылаемых между клиентом и сервером.
    NAME_REQUEST,
    USER_NAME,
    NAME_ACCEPTED,
    TEXT,
    USER_ADDED,
    USER_REMOVED;
}
