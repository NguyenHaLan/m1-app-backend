package htwberlin.webtech.web;

import htwberlin.webtech.persistence.HabitEntity;
import htwberlin.webtech.persistence.HabitRepository;
import htwberlin.webtech.service.HabitService;
import htwberlin.webtech.web.api.Habit;
import htwberlin.webtech.web.api.HabitCreateRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/*@RestController
public class HabitRestController {

    private final HabitService habitService;

    public HabitRestController(HabitService habitService) {
        this.habitService = habitService;
    }

    @GetMapping(path= "/api/v1/habits")
    public ResponseEntity<List<Habit>> fetchHabits() {
        return ResponseEntity.ok(habitService.findAll());
    }

    @PostMapping(path = "/api/v1/habits")
    public ResponseEntity<Void> createHabit(@RequestBody HabitCreateRequest request)
    throws URISyntaxException {
        var habit = habitService.create(request);
        URI uri = new URI("/api/v1/habits/" + habit.getId());
        return ResponseEntity.created(uri).build();
    }
}*/

@RestController
public class HabitRestController {
    @Autowired
    HabitService service;

    Logger logger = LoggerFactory.getLogger(HabitRestController.class);

    @PostMapping("/habits")
    public Habit createHabit(@RequestBody Habit habit){
        return service.save(habit);
    }

    @GetMapping("/habits/{id}")
    public Habit getHabit(@PathVariable String id) {
        logger.info("GET request on route habits with {}",id);
        Long habitId = Long.parseLong(id);
        return service.get(habitId);
    }

    @GetMapping("/habits")
    public List<Habit> getAllHabits(){
        return service.getAll();
    }
}