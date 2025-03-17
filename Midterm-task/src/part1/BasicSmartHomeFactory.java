package part1;

public class BasicSmartHomeFactory implements SmartHomeFactory {
    @Override
    public Light createLight(String name) {
        return new Light(name);
    }

    @Override
    public Camera createCamera(String name) {
        return new Camera(name);
    }

    @Override
    public RobotVacuum createRobotVacuum(String name) {
        return new RobotVacuum(name);
    }
}
