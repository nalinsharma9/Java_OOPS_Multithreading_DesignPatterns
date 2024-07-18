package Design_Patterns.StrategyPattern.WithStrategyPattern.Strategy;

public class SportsDrive implements DriveStrategy {

    @Override
    public void drive() {

        //Sports Drive
        System.out.println("Sports Drive capability");
    }
}
