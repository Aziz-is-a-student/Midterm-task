package part2;

import part1.SmartDevice;

public class MotionSensor implements SmartDevice{
    private String sensorName;
    private boolean on  = false;

    public MotionSensor(String sensorName) {
        this.sensorName = sensorName;
    }

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Датчик движения " + sensorName + " был включен");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Датчик движения " + sensorName + " был выключен");


    }

    @Override
    public String getStatus() {
        if(on){
            return "Датчик движения активен";
        }
        return "Датчик движения не активен";
    }

    public boolean isMotionDetected() {

        System.out.println(sensorName + ": было обнаружено движение");
        return true;
    }
}
