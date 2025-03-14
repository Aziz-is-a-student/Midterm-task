package part1;

class Camera implements SmartDevice {
    private String name;

    public Camera(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " активирована.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " деактивирована.");
    }

    @Override
    public String getStatus() {
        return name + ": Активна";
    }
}
