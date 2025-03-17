package part1;

// Abstract Factory: Фабрика для создания устройств
public interface SmartHomeFactory {
    Light createLight(String name);
    Camera createCamera(String name);
    RobotVacuum createRobotVacuum(String name);
}


