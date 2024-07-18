package Design_Patterns.StrategyPattern.WithStrategyPattern.Strategy;

public class NormalDrive implements DriveStrategy {

    @Override
    public void drive() {

        //Normal Drive
        System.out.println("Normal Drive capability");
    }
}
