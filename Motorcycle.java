package command.ejemploCommand;

public class Motorcycle implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("acelera en moto");
    }

    @Override
    public void decelerate() {
        System.out.println("desacelera en moto");
    }

    @Override
    public void start() {
        System.out.println("lo prende en moto");
    }

    @Override
    public void stop() {
        System.out.println("lo apaga en moto");
    }
    
}
