package OOPS.AbstractDemo;

public class Car implements Engine, Brake, Media{
    //Class does not care which interface's method its overriding
    @Override
    public void start(){
        System.out.println("Engine Started");
    }

    @Override
    public void stop(){
        System.out.println("Engine stopped");
    }

    public void acc(){
        System.out.println("Engine is accelerating");
    }

    public void brake(){
        System.out.println("Braking");
    }
}
