package command.ejemploCommand;

public class Truck implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Le acelera en truck");
    }

    @Override
    public void decelerate() {
        System.out.println("Le frena en truck");
    }

    @Override
    public void start() {
        System.out.println("Lo prende en truck");
    }

    @Override
    public void stop() {
        System.out.println("Lo apaga en truck");
    }
    
}
