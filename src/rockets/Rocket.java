package rockets;

import items.Item;

public class Rocket implements SpaceShip {
    public boolean launch() {
        return true;
    }
    public boolean land() {
        return true;
    }
    public final boolean canCarry(Item itemToCarry) {
        // TODO implement this method
        return true;
    }
    public final void carry(Item itemToCarry) {
        // TODO implement this method

    }
}
