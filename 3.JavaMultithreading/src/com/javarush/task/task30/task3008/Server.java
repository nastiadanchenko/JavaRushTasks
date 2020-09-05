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

    public static void sendBroadcastMessage(Message message) {
        for (Map.Entry<String, Connection> pair : connectionMap.entrySet()
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
                ClassNotFoundException {
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

        private void notifyUsers(Connection connection, String userName) throws IOException {
            String nameUser = null;
            for (Map.Entry<String, Connection> pair : connectionMap.entrySet()
                    ) {
                nameUser = pair.getKey();
                if (!nameUser.equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, nameUser));

                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException,
                ClassNotFoundException {
            while (true) {
                Message userMessage = connection.receive();
                if (userMessage.getType() == MessageType.TEXT) {
                    String newMessage = userName + ": " + userMessage.getData();
                    Server.sendBroadcastMessage(new Message(MessageType.TEXT, newMessage));
                } else {
                    ConsoleHelper.writeMessage("Неверный тип сообщения");
                }
            }
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage("Было установленно соеденение с удаленным адрессом: " + socket.getRemoteSocketAddress());
            try (Connection connection = new Connection(socket);) {
                String userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName)); //
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);
                if (userName != null) {
                    for (Map.Entry<String, Connection> pair : connectionMap.entrySet()
                            ) {
                        Message message = connection.receive();
                        connectionMap.remove(userName);
                    }
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED,userName));
                }
            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Произошла ошибка при обмене данными с удаленным адресом");
            }
        }
    }
}
