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
    Integer tensionScore;
}
