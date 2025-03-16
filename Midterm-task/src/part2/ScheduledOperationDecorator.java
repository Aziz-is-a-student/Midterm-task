package part2;

import part1.*;

import java.time.LocalTime;

// Decorator Pattern: Декоратор для расписания
public class ScheduledOperationDecorator extends SmartDeviceDecorator {
    private LocalTime startTime;
    private LocalTime endTime;

    public ScheduledOperationDecorator(SmartDevice device, LocalTime startTime, LocalTime endTime) {
        super(device);
        this.startTime = startTime;  // Время начала работы устройства
        this.endTime = endTime;  // Время окончания работы устройства
    }

    @Override
    public void turnOn() {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(startTime) && currentTime.isBefore(endTime)) {//Если нынешнее время больше стартового и меньше конечного
            System.out.println("Включение устройства в разрешенное время.");
            device.turnOn();
        } else {
            System.out.println("Устройство можно включить только в пределах расписания. это с " + startTime + "до " + endTime);
        }
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }
}
