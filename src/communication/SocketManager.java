package communication;


import DTO.DeviceLocationDTO;

public class SocketManager {
    private TCPClient tcpClient;

    public SocketManager(String host, int port) {
        tcpClient = new TCPClient(host, port);
    }

    public void send(String deviceLocation) {
        // Enviando dados para o servidor
        try {
            tcpClient.connect();
            tcpClient.sendData(deviceLocation);
            tcpClient.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
