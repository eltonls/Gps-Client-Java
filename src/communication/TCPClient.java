package communication;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {
    private String host;
    private int port;
    private Socket socket;

    public TCPClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connect() {
        try {
            socket = new Socket(host, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendData(String data) {
        try {
            socket.getOutputStream().write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
