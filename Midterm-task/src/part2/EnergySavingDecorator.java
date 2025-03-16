        package part2;
        import part1.*;
        import java.time.LocalTime;

        public class EnergySavingDecorator extends  SmartDeviceDecorator {
            private LocalTime startTime = LocalTime.of(00,00);
            private LocalTime endTime = LocalTime.of(07,00);
            private  LocalTime currentTime = LocalTime.now();
            public EnergySavingDecorator(SmartDevice device) {
                super(device);
            }

            @Override
            public void turnOn() {
                if(currentTime.isAfter(startTime) && currentTime.isBefore(endTime)) {
                    device.turnOn();
                    System.out.println("Устройство включено в режиме энергосбережения.");
                }
            }

            @Override
            public void turnOff() {
                if(!(currentTime.isAfter(startTime) && currentTime.isBefore(endTime))) {
                    device.turnOff();
                    System.out.println("Устройство выключено, активирован режим энергосбережения.");
                }
            }
        }
