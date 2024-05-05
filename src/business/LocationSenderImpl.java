package business;

import DTO.DeviceLocationDTO;
import communication.SocketManager;
import model.Device;
import model.Location;

import java.util.Calendar;

public class LocationSenderImpl implements LocationSender {
    private SocketManager socketManager;

    @Override
    public void sendLocationDevice(Location location, Device device) {
        DeviceLocationDTO deviceLocationDTO = new DeviceLocationDTO(device, location);

        String deviceLocation = formatLocationData(location, device);

        // Usa o socket manager para enviar a localização do dispositivo
        socketManager = new SocketManager("localhost", 8080);
        socketManager.send(deviceLocation);
    }

    public String formatLocationData(Location location, Device device) {
        // Formata a localização na seguinte forma:
        // “STT;12345678;20240501;12:30:45;+40.7128;-74.0060;”
        String deviceLocation = "STT;" +
                device.getImei() +
                ";" +
                location.getDate().get(Calendar.YEAR) +
                String.format("%02d", location.getDate().get(Calendar.MONTH) + 1) +
                String.format("%02d", location.getDate().get(Calendar.DAY_OF_MONTH)) +
                ";" +
                String.format("%02d", location.getDate().get(Calendar.HOUR_OF_DAY)) +
                ":" +
                String.format("%02d", location.getDate().get(Calendar.MINUTE)) +
                ":" +
                String.format("%02d", location.getDate().get(Calendar.SECOND)) +
                ";" +
                location.getLatitude() +
                ";" +
                location.getLongitude() +
                ";";

        return deviceLocation;
    }
}