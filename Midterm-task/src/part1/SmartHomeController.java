package part1;

import java.util.ArrayList;
import java.util.List;

// Facade: Контроллер умного дома
public class SmartHomeController {
    public List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllLightsOn() {
        System.out.println("Включение всех светильников...");
        for (SmartDevice device : devices) {
            if (device instanceof Light) {
                device.turnOn();
            }
        }
    }

    public void setGlobalTemperature(int temperature) {
        System.out.println("Установка глобальной температуры: " + temperature + "°C (пример)");
    }

    public void getSystemStatusReport() {
        System.out.println("Статус системы умного дома:");
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }
}
