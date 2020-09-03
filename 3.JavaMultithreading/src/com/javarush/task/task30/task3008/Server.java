package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by User on 02.09.2020.
 */
public class Server { //основной класс сервера
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(ConsoleHelper.readInt())) {
            ConsoleHelper.writeMessage("Сервер запущен!");
            while (true) {
                Handler handler = new Handler(server.accept());
                handler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public static void sendBroadcastMessage(Message message){
    for (Map.Entry<String, Connection> pair:connectionMap.entrySet()
         ) {
        Connection conect = pair.getValue();
        try {
            conect.send(message);
        } catch (IOException e) {
           // e.printStackTrace();
            ConsoleHelper.writeMessage("Сообщение не отправлено");
        }
    }
}
    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }


    private String serverHandshake(Connection connection) throws IOException,
            ClassNotFoundException{
        boolean accepted = false;
        String name = null;
        while (!accepted) {
            connection.send(new Message(MessageType.NAME_REQUEST));
            Message message = connection.receive();
            if (message.getType() == MessageType.USER_NAME) {
                name = message.getData();
                if (!name.isEmpty() && connectionMap.get(name) == null) {
                    connectionMap.put(name, connection);
                    connection.send(new Message(MessageType.NAME_ACCEPTED));
                    accepted = true;
                }
            }
        }
        return name;

    }
    }
}
