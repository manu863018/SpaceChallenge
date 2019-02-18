package rockets;

import items.Item;

public class Rocket implements SpaceShip {
    private double currentWeight;
    private double maxCargo;
    private double weigth;
    private double cost;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public final boolean canCarry(Item itemToCarry) {
        if (maxCargo >= currentWeight + itemToCarry.getWeight())
            return true;
        else
            System.out.println("Can't carry item: " + itemToCarry.getName() + "\tWeigth: " + itemToCarry.getWeight());
        return false;
    }

    @Override
    public final void carry(Item itemToCarry) {
        System.out.println("Carry item: " + itemToCarry.getName() + "\tWeight: " + itemToCarry.getWeight());
        currentWeight += itemToCarry.getWeight();
    }

    public void setMaxCargo(double maxCargo) {
        this.maxCargo = maxCargo;
    }

    public double getMaxCargo() {
        return maxCargo;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weigth = weight;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public double getTotalWeight() {
        return getCurrentWeight() + getWeigth();
    }
}
