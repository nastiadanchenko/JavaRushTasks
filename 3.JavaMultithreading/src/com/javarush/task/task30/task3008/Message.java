package com.javarush.task.task30.task3008;

import java.io.Serializable;

/**
 * Created by User on 02.09.2020.
 */
public class Message implements Serializable{  // отвечающий за пересылаемые сообщения
    private final MessageType type;
    private final String data;

    public Message(MessageType type, String data) {
        this.type = type;
        this.data = data;
    }

    public Message(MessageType type) {
        this.type = type;
        data = null;
    }

    public MessageType getType() {
        return type;
    }

    public String getData() {
        return data;
    }
}
