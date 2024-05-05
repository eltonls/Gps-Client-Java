package business;

import model.Device;
import model.Location;

public interface LocationSender {
    void sendLocationDevice(Location location, Device device);
}

