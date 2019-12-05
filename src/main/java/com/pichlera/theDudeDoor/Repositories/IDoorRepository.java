package com.pichlera.theDudeDoor.Repositories;

import com.pichlera.theDudeDoor.Models.Door;
import org.springframework.data.repository.CrudRepository;


public interface IDoorRepository extends CrudRepository<Door, Long> {
        public Door findDoorById(Long id);
}
