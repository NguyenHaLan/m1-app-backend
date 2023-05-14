package htwberlin.webtech.web.api;

public class Habit {

    private long id;
    private String name;
    private int target;
    private boolean complete;

    public Habit(long id, String name, int target, boolean complete) {
        this.id = id;
        this.name = name;
        this.target = target;
        this.complete = complete;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
