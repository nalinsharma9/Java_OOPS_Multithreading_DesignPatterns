package Design_Patterns.StrategyPattern.WithStrategyPattern;
//Since there are only 2 strategies, we don't have to write the logic in every subclass.
//We just need to write logic once for every strategy

public class Main {
    public static void main(String[] args) {
        PassengerVehicle passengerVehicle = new PassengerVehicle();
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();

        passengerVehicle.drive();
        offRoadVehicle.drive();
    }
}
