package com.pichlera.theDudeDoor.Repositories;

import com.pichlera.theDudeDoor.Models.Door;
import com.pichlera.theDudeDoor.Models.DoorPersonSet;
import org.springframework.data.repository.CrudRepository;

public interface IDoorPersonSetRepository extends CrudRepository<DoorPersonSet, Long> {

    public DoorPersonSet getDoorPersonSetByDoor(Door door);
    public DoorPersonSet getDoorPersonSetById(Long id);
}
