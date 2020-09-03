package com.javarush.task.task30.task3008;

import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Created by User on 02.09.2020.
 */
public class Connection implements Closeable {   //  соединения между клиентом и сервером
    private final Socket socket;
    private final ObjectOutputStream out;
    private final ObjectInputStream in;

    public Connection(Socket socket) throws IOException {
        this.socket = socket;
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
    }

    public  void send(Message message) throws IOException {
        synchronized (out){
            out.writeObject(message);
            out.flush();
        }
    }

    public  Message receive() throws IOException, ClassNotFoundException{
        synchronized(in) {
            Message message = (Message) in.readObject();
            return message;
        }
    }
    public SocketAddress getRemoteSocketAddress(){
        return socket.getRemoteSocketAddress();
    }
    @Override
    public void close() throws IOException {
        out.close();
        in.close();
        socket.close();
    }
}
