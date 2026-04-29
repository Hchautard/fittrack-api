package com.fittrack_api.exercise;

import com.fittrack_api.exercise.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
}