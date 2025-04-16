package Design_Patterns.LLDPractice.Elevator_System_LLD;

import java.util.*;

public class Elevator {
    private int currentFloor;
    private Direction direction;
    private TreeSet<Integer> upRequests;
    private TreeSet<Integer> downRequests;

    public Elevator() {
        this.currentFloor = 1; // Start at 1st floor
        this.direction = Direction.IDLE;
        this.upRequests = new TreeSet<>();
        this.downRequests = new TreeSet<>(Collections.reverseOrder());
    }

    public void requestFloor(int floor) {
        if (floor < 1 || floor > 5) {
            System.out.println("Invalid floor request: " + floor);
            return;
        }

        // Avoid adding duplicate request
        if ((direction == Direction.UP || direction == Direction.IDLE) && floor > currentFloor && !upRequests.contains(floor)) {
            upRequests.add(floor);
        } else if ((direction == Direction.DOWN || direction == Direction.IDLE) && floor < currentFloor && !downRequests.contains(floor)) {
            downRequests.add(floor);
        } else if (floor == currentFloor) {
            System.out.println("Elevator is already at requested floor " + floor);
        }

        move();
    }

    private void move() {
        while (!upRequests.isEmpty() || !downRequests.isEmpty()) {
            if (direction == Direction.IDLE) {
                // Decide initial direction based on nearest request
                if (!upRequests.isEmpty() && (downRequests.isEmpty() || upRequests.first() - currentFloor < currentFloor - downRequests.first())) {
                    direction = Direction.UP;
                } else {
                    direction = Direction.DOWN;
                }
            }

            if (direction == Direction.UP && !upRequests.isEmpty()) {
                processRequests(upRequests, Direction.UP);
                // After UP requests, check DOWN
                direction = downRequests.isEmpty() ? Direction.IDLE : Direction.DOWN;
            } else if (direction == Direction.DOWN && !downRequests.isEmpty()) {
                processRequests(downRequests, Direction.DOWN);
                direction = upRequests.isEmpty() ? Direction.IDLE : Direction.UP;
            }
        }

        direction = Direction.IDLE;
        System.out.println("Elevator is now idle at floor " + currentFloor);
    }

    private void processRequests(TreeSet<Integer> requests, Direction dir) {
        while (!requests.isEmpty()) {
            int target = requests.pollFirst();
            System.out.println("Moving " + dir + " from floor " + currentFloor + " to floor " + target);
            currentFloor = target;
            System.out.println("Elevator arrived at floor " + currentFloor);
        }
    }
}