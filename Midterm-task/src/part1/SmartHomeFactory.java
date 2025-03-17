package part1;// Composite: Группа устройств (например, комната, этаж)

// Abstract Factory: Фабрика для создания устройств
public interface SmartHomeFactory {
    Light createLight(String name);
    Camera createCamera(String name);
    RobotVacuum createRobotVacuum(String name);
}


