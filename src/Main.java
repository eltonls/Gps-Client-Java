import business.LocationSender;
import business.LocationSenderImpl;
import model.Device;
import model.Location;

import java.util.Calendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocationSender lc = new LocationSenderImpl();
        Location location = new Location(40.7128 , -74.0060 , Calendar.getInstance());
        Device device = new Device("12345678", "iPhone", "Smartphone");
        lc.sendLocationDevice(location, device);
    }
}