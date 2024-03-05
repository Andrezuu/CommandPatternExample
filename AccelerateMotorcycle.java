package command.ejemploCommand;

public class AccelerateMotorcycle implements Command {

    private Vehicle vehicle;

    public AccelerateMotorcycle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }

    @Override
    public void revert() {
        vehicle.decelerate();
    }

}
