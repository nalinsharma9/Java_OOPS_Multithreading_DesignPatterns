package Design_Patterns.StrategyPattern.WithoutStrategyPattern;

//Both SportVehicle and OffRoadVehicle are using same drive strategy hence the implementation is duplicated in the subclass

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new OffRoadVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new SportVehicle();
        vehicle2.drive();


    }
}
