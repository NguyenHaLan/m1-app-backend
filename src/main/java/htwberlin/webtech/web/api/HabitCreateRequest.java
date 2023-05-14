package htwberlin.webtech.web.api;

public class HabitCreateRequest {

    private String name;
    private int target;
    private boolean complete;

    public HabitCreateRequest(String name, int target, boolean complete) {
        this.name = name;
        this.target = target;
        this.complete = complete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
