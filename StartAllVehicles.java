package command.ejemploCommand;

import java.util.ArrayList;
import java.util.List;

public class StartAllVehicles implements Command {

    private List<Vehicle> vehicles = new ArrayList<>();

    public StartAllVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public void execute() {
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }

    @Override
    public void revert() {
        for (Vehicle vehicle : vehicles) {
            vehicle.stop();
        }
    }

}
