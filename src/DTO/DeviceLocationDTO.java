package DTO;

import model.Device;
import model.Location;

/**
 * @param device
 * @param location
 */
public class DeviceLocationDTO {
    private Device device;
    private Location location;

    public DeviceLocationDTO(Device device, Location location) {
        this.device = device;
        this.location = location;
    }

    public Device getDevice() {
        return device;
    }

    public Location getLocation() {
        return location;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
