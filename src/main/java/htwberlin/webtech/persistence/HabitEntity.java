package htwberlin.webtech.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "habits")
public class HabitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "target", nullable = true)
    private int target;
    @Column(name = "complete",nullable = false)
    private boolean complete;

    public HabitEntity(String name, int target, boolean complete) {
        this.name = name;
        this.target = target;
        this.complete = complete;
    }

    public HabitEntity() {
    }

    public Long getId() {
        return id;
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
