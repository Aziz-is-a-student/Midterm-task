package part2;

import part1.BasicSmartHomeFactory;


public class AdvancedSmartHomeFactory extends BasicSmartHomeFactory {
    public AdvancedSmartHomeFactory() {
        super();
    }
    public AI_Thermostat createAIThermostat(String name) {
        return new AI_Thermostat(name);
    }

    // Новый метод для создания MotionSensor
    public MotionSensor createMotionSensor(String name) {
        return new MotionSensor(name);

    }
}
