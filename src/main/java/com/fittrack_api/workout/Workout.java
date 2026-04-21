package com.fittrack_api.workout;

import com.fittrack_api.exercise.Exercise;

import java.util.List;

public class Workout {
    String name;
    String description;
    String location;
    String date;
    String time;
    List<Exercise> exercises;
    Integer pumpScore;
    Integer nerveScore;
    Integer stressScore;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public Integer getPumpScore() {
        return pumpScore;
    }

    public void setPumpScore(Integer pumpScore) {
        this.pumpScore = pumpScore;
    }

    public Integer getNerveScore() {
        return nerveScore;
    }

    public void setNerveScore(Integer nerveScore) {
        this.nerveScore = nerveScore;
    }

    public Integer getStressScore() {
        return stressScore;
    }

    public void setStressScore(Integer stressScore) {
        this.stressScore = stressScore;
    }
}
