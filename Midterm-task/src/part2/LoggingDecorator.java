package part2;
import part1.*;

public class LoggingDecorator extends SmartDeviceDecorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Logging: Включение устройства " + device.getStatus());
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Logging: Выключение устройства " + device.getStatus());
        device.turnOff();
    }
}