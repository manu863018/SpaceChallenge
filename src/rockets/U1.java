package rockets;

import java.util.Random;

public class U1 extends Rocket {
    private static int rocketU1Counter;
    private final int maxCargo = 18000;
    private static final int cost = 100000000;
    private final int weight = 10000;
    private double chanceLaunched;
    private double chanceLanded;

    public U1() {
        this(0);
    }

    public U1(int lastWeight) {
        setCost(cost);
        setWeight(weight);
        setMaxCargo(maxCargo);
        setCurrentWeight(lastWeight);

        rocketU1Counter++;
        System.out.println("------------------------------------");
    }

    public static void setRocketU1Counter(int rocketU1Counter) {
        U1.rocketU1Counter = rocketU1Counter;
    }

    public static int getRocketU1Counter() {
        return rocketU1Counter;
    }

    @Override
    public boolean launch() {
        System.out.println("\nLAUNCHING ROCKET");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLaunched = 0.05 * (getTotalWeight() / getMaxCargo());

        System.out.println("Cargo: " + getCurrentWeight());
        if (chanceLaunched >= rand) {
            System.out.println("Rocker U1 EXPLODED!");
            System.out.println("Sending another rocket because it exploded.");
            return false;
        } else {
            System.out.println("U1 launched successfully!");
            return true;
        }
    }

    @Override
    public boolean land() {
        System.out.println("\nLANDING...");
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLanded = 0.01 * (getTotalWeight() / getMaxCargo());

        if (chanceLanded >= rand) {
            System.out.println("ROCKET U1 CRASHED!!!");
            System.out.println("Sending another rocket because it crashed.");
            return false;
        } else {
            System.out.println("Rocket U1 landed successfully!");
            return true;
        }
    }

    public static long getTotalCost() {
        return (long) getRocketU1Counter() * cost;
    }
}
