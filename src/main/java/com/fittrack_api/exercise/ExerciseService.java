package com.fittrack_api.exercise;

import com.fittrack_api.exercise.Exercise;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }

    public Optional<Exercise> getExerciseById(Integer id) {
        return exerciseRepository.findById(id);
    }

    public Exercise updateExercise(Integer id, Exercise updatedExercise) {
        return exerciseRepository.findById(id)
                .map(exercise -> {
                    exercise.setName(updatedExercise.getName());
                    exercise.setDescription(updatedExercise.getDescription());
                    exercise.setMuscle(updatedExercise.getMuscle());
                    return exerciseRepository.save(exercise);
                })
                .orElseThrow(() -> new RuntimeException("Exercise not found"));
    }

    public void deleteExercise(Integer id) {
        exerciseRepository.deleteById(id);
    }

}