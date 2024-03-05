package command.ejemploCommand;

public class StartMotorcycle implements Command {

    private Vehicle vehicle;

    public StartMotorcycle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }

    @Override
    public void revert() {
        vehicle.stop();
    }

}
