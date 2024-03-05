package command.ejemploCommand;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        Truck truck = new Truck();

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(motorcycle);
        vehicles.add(truck);

        Command startAllVehicles = new StartAllVehicles(vehicles);
        startAllVehicles.execute();
        startAllVehicles.revert();
    }
}
