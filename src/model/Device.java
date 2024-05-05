package model;

public class Device {

    private String imei;
    private String name;
    private String type;

    public Device(String imei, String name, String type) {
        this.imei = imei;
        this.name = name;
        this.type = type;
    }

    public String getImei() {
        return imei;
    }
}
