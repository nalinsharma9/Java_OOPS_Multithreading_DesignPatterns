package Design_Patterns.StrategyPattern.WithStrategyPattern;

import Design_Patterns.StrategyPattern.WithStrategyPattern.Strategy.NormalDrive;
import Design_Patterns.StrategyPattern.WithStrategyPattern.Strategy.SportsDrive;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
