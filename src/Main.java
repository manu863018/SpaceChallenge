import items.Item;
import rockets.Rocket;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        Simulation simulation = new Simulation();
        ArrayList<Item> itemsPhase1 = simulation.loadItems("D:\\Minions\\Final Project\\SpaceChallenge\\src\\resources\\Phase-1.txt");
        ArrayList<Item> itemsPhase2 = simulation.loadItems("D:\\Minions\\Final Project\\SpaceChallenge\\src\\resources\\Phase-2.txt");
        ArrayList<Rocket> fleetPhase1 = simulation.loadU1(itemsPhase1);
        ArrayList<Rocket> fleetPhase2 = simulation.loadU1(itemsPhase2);
        System.out.println("Run Simulation U1 for phase 1: " + simulation.runSimulation(fleetPhase1));
        System.out.println("Run Simulation U1 for phase 2: " + simulation.runSimulation(fleetPhase2));
    }
}
