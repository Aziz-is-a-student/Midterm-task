package part1;

import java.util.ArrayList;
import java.util.List;

class DeviceGroup implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public DeviceGroup(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Включение всех устройств в " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Выключение всех устройств в " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    @Override
    public String getStatus() {
        StringBuilder status = new StringBuilder(name + " содержит:\n");
        for (SmartDevice device : devices) {
            status.append("- ").append(device.getStatus()).append("\n");
        }
        return status.toString();
    }
}
