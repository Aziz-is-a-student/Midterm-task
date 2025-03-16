package part2;
import part1.*;
// Decorator Pattern: Абстрактный декоратор для умных устройств
public abstract class SmartDeviceDecorator {
    protected SmartDevice device;

    public SmartDeviceDecorator(SmartDevice device) {
        this.device = device;
    }



    public void turnOn() {
        device.turnOn();
    }


    public void turnOff() {
        device.turnOff();
    }


    public String getStatus() {
        return device.getStatus();
    }
}
