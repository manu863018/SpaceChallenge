package rockets;

public class U2 extends Rocket {
    private static int rocketU2Counter;
    private static final int cost = 120000000;

    @Override
    public boolean launch() {
        return super.launch();
    }

    @Override
    public boolean land() {
        return super.land();
    }

    public static int getRocketU1Counter() {
        return rocketU2Counter;
    }

    public static long getTotalCost() {
        return (long) getRocketU1Counter() * cost;
    }
}
