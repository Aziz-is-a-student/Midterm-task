package part2;

import part1.SmartDevice;

// Адаптер для старой системы замка двери
public class LegacyDoorLockAdapter implements SmartDevice {
    private LegacyDoorLock legacyDoorLock;

    public LegacyDoorLockAdapter(LegacyDoorLock legacyDoorLock) {
        this.legacyDoorLock = legacyDoorLock;
    }

    @Override
    public void turnOn() {
        legacyDoorLock.unlockDoor();
        System.out.println("Замок двери разблокирован.");
    }

    @Override
    public void turnOff() {
        legacyDoorLock.lockDoor();
        System.out.println("Замок двери заблокирован.");
    }

    @Override
    public String getStatus() {

        return "Замок двери: " + (legacyDoorLock.isLocked() ? "Заблокирован" : "Разблокирован");
    }
}
