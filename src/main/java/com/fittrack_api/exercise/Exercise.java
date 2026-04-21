package com.fittrack_api.exercise;

import com.fittrack_api.muscle.Muscle;

public class Exercise {
    String name;
    String description;
    Muscle muscle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Muscle getMuscle() {
        return muscle;
    }

    public void setMuscle(Muscle muscle) {
        this.muscle = muscle;
    }
}
