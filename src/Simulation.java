import rockets.Rocket;
import rockets.U1;
import rockets.U2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import items.Item;

public class Simulation  {
    public ArrayList<Item> loadItems(String fileName) {
        Scanner data = Utils.readFile(fileName);
        ArrayList<Item> items = new ArrayList<>();
        String []dataArray;
        while (data.hasNextLine()) {
            dataArray = data.nextLine().split("=");
            items.add(new Item(dataArray[0], Integer.parseInt(dataArray[1])));
        }

        return items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> itemsToLoad) {
        ArrayList<Rocket> rocketsU1 = new ArrayList<>();
        Rocket rocketU1;
        for (Item item : itemsToLoad) {
            rocketU1 = new U1();
            if (rocketU1.canCarry(item)) {
                rocketU1.carry(item);
                rocketsU1.add(rocketU1);
            }
        }

        return rocketsU1;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> itemsToLoad) {
        ArrayList<Rocket> rocketsU2 = new ArrayList<>();
        Rocket rocketU2;
        for (Item item : itemsToLoad) {
            rocketU2 = new U1();
            if (rocketU2.canCarry(item)) {
                rocketU2.carry(item);
                rocketsU2.add(rocketU2);
            }
        }

        return rocketsU2;
    }

    public double runSimulation(ArrayList<Rocket> rockets) {
        double totalCost = 0.0;
        for (Rocket rocket : rockets) {
            while (!rocket.launch()) {
                rocket.launch();
            }
            while (!rocket.land()) {
                rocket.land();
            }

            if (rocket instanceof U1)
                totalCost += ((U1)rocket).getTotalCost();
            else
                totalCost += ((U2)rocket).getTotalCost();
        }
        return totalCost;
    }
}
