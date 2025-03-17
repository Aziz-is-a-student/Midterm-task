package part2;

public class LegacyDoorLock {
    private boolean locked;

    public LegacyDoorLock() {
        this.locked = true;
    }

    public void lockDoor() {
        this.locked = true;
        System.out.println("Дверь заблокирована.");
    }

    public void unlockDoor() {
        this.locked = false;
        System.out.println("Дверь разблокирована.");

    }

    public boolean isLocked() {
        return locked;
    }
}
