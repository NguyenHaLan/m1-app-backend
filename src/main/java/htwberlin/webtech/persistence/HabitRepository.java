package htwberlin.webtech.persistence;

import htwberlin.webtech.web.api.Habit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//import java.util.List;

/*@Repository
public interface HabitRepository extends JpaRepository<HabitEntity, Long> {

        List<HabitEntity> findAllByName(String name);
}*/

@Repository
public interface HabitRepository extends CrudRepository<Habit, Long> { }
