package Design_Patterns.StrategyPattern.WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle {

    @Override
    public void drive(){

        //different drive logic
        System.out.println("Sport Drive capability");
    }
}
