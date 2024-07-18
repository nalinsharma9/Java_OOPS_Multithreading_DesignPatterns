package Design_Patterns.StrategyPattern.WithStrategyPattern;

import Design_Patterns.StrategyPattern.WithStrategyPattern.Strategy.SportsDrive;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDrive());
    }

}
