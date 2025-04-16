package Design_Patterns.LLDPractice.Elevator_System_LLD;

/*
Simple elevator system design where we have only 1 elevator with 5 floors.
 */

import java.util.TreeSet;

public class ElevatorSystem {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        elevator.requestFloor(3);
        elevator.requestFloor(5);
        elevator.requestFloor(2);
        elevator.requestFloor(5); // duplicate, will be ignored
        elevator.requestFloor(1); // new down request
    }
}
