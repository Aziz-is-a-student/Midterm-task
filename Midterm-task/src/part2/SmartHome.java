package part2;

import java.util.Scanner;

import part1.*;

public class SmartHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHomeController controller = new SmartHomeController();
        SmartHomeFactory factory = new BasicSmartHomeFactory();
        AdvancedSmartHomeFactory advancedFactory = new AdvancedSmartHomeFactory();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить устройство");
            System.out.println("2. Включить/выключить устройство");
            System.out.println("3. Включить все светильники");
            System.out.println("4. Установить глобальную температуру");
            System.out.println("5. Показать статус системы");
            System.out.println("6. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {

                    System.out.println("Выберите тип устройства для добавления:");
                    System.out.println("1. Светильник");
                    System.out.println("2. Камера");
                    System.out.println("3. Пылесос");
                    System.out.println("4. AI Термостат");
                    System.out.println("5. Датчик движения");
                    int deviceChoice = scanner.nextInt();

                    System.out.println("Введите имя устройства:");
                    String deviceName = scanner.next();

                    switch (deviceChoice) {
                        case 1:
                            controller.addDevice(factory.createLight(deviceName));
                            System.out.println("Светильник " + deviceName + " добавлен.");
                            break;
                        case 2:
                            controller.addDevice(factory.createCamera(deviceName));
                            System.out.println("Камера " + deviceName + " добавлена.");
                            break;
                        case 3:
                            controller.addDevice(factory.createRobotVacuum(deviceName));
                            System.out.println("Пылесос " + deviceName + " добавлен.");
                            break;
                        case 4:
                            AI_Thermostat aiThermostat = advancedFactory.createAIThermostat(deviceName);
                            controller.addDevice(aiThermostat);
                            System.out.println("AI Термостат " + deviceName + " добавлен.");
                            break;
                        case 5:
                            MotionSensor motionSensor = advancedFactory.createMotionSensor(deviceName);
                            controller.addDevice(motionSensor);
                            System.out.println("Датчик движения " + deviceName + " добавлен.");
                            break;
                        default:
                            System.out.println("Неверный выбор устройства.");
                            break;
                    }
                    break;
                }
                case 2: {
                    // Включить/выключить устройство
                    System.out.println("Введите имя устройства:");
                    String deviceName = scanner.next();
                    SmartDevice device = findDeviceByName(controller, deviceName);
                    if (device != null) {
                        System.out.println("1. Включить устройство");
                        System.out.println("2. Выключить устройство");
                        int actionChoice = scanner.nextInt();
                        if (actionChoice == 1) {
                            device.turnOn();
                        } else if (actionChoice == 2) {
                            device.turnOff();
                        } else {
                            System.out.println("Неверный выбор действия.");
                        }
                    } else {
                        System.out.println("Устройство не найдено.");
                    }
                    break;
                }
                case 3: {
                    // Включить все светильники
                    controller.turnAllLightsOn();
                    break;
                }
                case 4: {
                    // Установить глобальную температуру
                    System.out.println("Введите температуру:");
                    int temperature = scanner.nextInt();
                    controller.setGlobalTemperature(temperature);
                    break;
                }
                case 5: {
                    // Показать статус системы
                    controller.getSystemStatusReport();
                    break;
                }
                case 6: {
                    // Выход из программы
                    System.out.println("Выход из программы.");
                    return;
                }
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите действие снова.");
            }
        }
    }

    // Метод для поиска устройства по имени
    private static SmartDevice findDeviceByName(SmartHomeController controller, String deviceName) {
        for (SmartDevice device : controller.devices) {
            if (device.getStatus().contains(deviceName)) {
                return device;
            }
        }
        return null;
    }
}