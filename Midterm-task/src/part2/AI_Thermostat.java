package part2;

import part1.SmartDevice;

public class AI_Thermostat implements SmartDevice {
    private String name;
    private int temperature;

    public AI_Thermostat(String name) {
        this.name = name;
        this.temperature = 25;
    }

    @Override
    public void turnOn() {
        System.out.println("Вы включили  " + name + ".");

    }

    @Override
    public void turnOff() {
        System.out.println("Вы выключили  " + name + ".");

    }

    @Override
    public String getStatus() {
        return "Температура на " + name +" установлена " + temperature + "C";
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Вы установили температуру "+ temperature + "C");

    }
}
