package com.fittrack_api.workout;

import com.fittrack_api.exercise.Exercise;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public Workout createWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    public Optional<Workout> getWorkoutById(Integer id) {
        return workoutRepository.findById(id);
    }

    public Workout updateWorkout(Integer id, Workout updatedWorkout) {
        return workoutRepository.findById(id)
                .map(workout -> {
                    workout.setName(updatedWorkout.getName());
                    workout.setDescription(updatedWorkout.getDescription());
                    workout.setLocation(updatedWorkout.getLocation());
                    workout.setDate(updatedWorkout.getDate());
                    workout.setTime(updatedWorkout.getTime());
                    workout.setPumpScore(updatedWorkout.getPumpScore());
                    workout.setNerveScore(updatedWorkout.getNerveScore());
                    workout.setStressScore(updatedWorkout.getStressScore());
                    workout.setExercises(updatedWorkout.getExercises());
                    return workoutRepository.save(workout);
                })
                .orElseThrow(() -> new RuntimeException("Workout not found"));
    }

    public void deleteWorkout(Integer id) {
        workoutRepository.deleteById(id);
    }

    public Workout addExerciseToWorkout(Integer workoutId, Exercise exercise) {
        Workout workout = workoutRepository.findById(workoutId)
                .orElseThrow(() -> new RuntimeException("Workout not found"));

        if (workout.getExercises() == null) {
            workout.setExercises(new ArrayList<>());
        }

        workout.getExercises().add(exercise);
        return workoutRepository.save(workout);
    }

    public Workout removeExerciseFromWorkout(Integer workoutId, Integer exerciseId) {
        Workout workout = workoutRepository.findById(workoutId)
                .orElseThrow(() -> new RuntimeException("Workout not found"));

        if (workout.getExercises() != null) {
            workout.setExercises(
                    workout.getExercises().stream()
                            .filter(e -> !exerciseId.equals(e.getId()))
                            .toList()
            );
        }

        return workoutRepository.save(workout);
    }
}