package rockets;

import items.Item;

public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry(Item itemToCarry);
    void carry(Item itemToCarry);
}
