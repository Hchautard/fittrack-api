package com.fittrack_api.muscle;

import com.fittrack_api.muscle.Muscle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MuscleService {

    private final MuscleRepository muscleRepository;

    public MuscleService(MuscleRepository muscleRepository) {
        this.muscleRepository = muscleRepository;
    }

    public Muscle createMuscle(Muscle muscle) {
        return muscleRepository.save(muscle);
    }

    public List<Muscle> getAllMuscles() {
        return muscleRepository.findAll();
    }

    public Optional<Muscle> getMuscleById(Integer id) {
        return muscleRepository.findById(id);
    }

    public Muscle updateMuscle(Integer id, Muscle updatedMuscle) {
        return muscleRepository.findById(id)
                .map(muscle -> {
                    muscle.setName(updatedMuscle.getName());
                    muscle.setGroup(updatedMuscle.getGroup());
                    muscle.setType(updatedMuscle.getType());
                    return muscleRepository.save(muscle);
                })
                .orElseThrow(() -> new RuntimeException("Muscle not found"));
    }

    public void deleteMuscle(Integer id) {
        muscleRepository.deleteById(id);
    }

}