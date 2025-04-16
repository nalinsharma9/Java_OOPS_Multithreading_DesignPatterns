package Design_Patterns.LLDPractice.Elevator_System_LLD;

public enum Direction {
    IDLE("Idle"),
    UP("Up"),
    DOWN("Down");

    private final String description;

    Direction(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
