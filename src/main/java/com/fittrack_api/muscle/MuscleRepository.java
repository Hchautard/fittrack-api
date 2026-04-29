package com.fittrack_api.muscle;

import com.fittrack_api.muscle.Muscle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuscleRepository extends JpaRepository<Muscle, Integer> {
}