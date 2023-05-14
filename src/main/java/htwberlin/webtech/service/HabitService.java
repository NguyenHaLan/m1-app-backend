package htwberlin.webtech.service;

import htwberlin.webtech.persistence.HabitEntity;
import htwberlin.webtech.persistence.HabitRepository;
import htwberlin.webtech.web.api.Habit;
import htwberlin.webtech.web.api.HabitCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*@Service

public class HabitService {

    private final HabitRepository habitRepository;

    public HabitService (HabitRepository habitRepository) {
        this.habitRepository = habitRepository;
    }

    public List<Habit> findAll(){
        List<HabitEntity> habits = habitRepository.findAll();
        return habits.stream()
                .map(HabitEntity -> transformEntity(HabitEntity))
                .collect(Collectors.toList());
    }


    public Habit create(HabitCreateRequest request) {
        var habitEntity = new HabitEntity(request.getName(),
                request.getTarget(),
                request.isComplete());
        habitEntity = habitRepository.save(habitEntity);
        return transformEntity(habitEntity);
    }

    private Habit transformEntity(HabitEntity habitEntity){
        return new Habit(
                habitEntity.getId(),
                habitEntity.getName(),
                habitEntity.getTarget(),
                habitEntity.isComplete()
        );
    }
}*/

@Service
public class HabitService {

    @Autowired
    HabitRepository repo;

    public Habit save(Habit habit) {
        return repo.save(habit);
    }

    public Habit get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Habit> getAll() {
        Iterable<Habit> iterator = repo.findAll();
        List<Habit> habits = new ArrayList<Habit>();
        for (Habit habit : iterator)  habits.add(habit);
        return habits;
    }
}