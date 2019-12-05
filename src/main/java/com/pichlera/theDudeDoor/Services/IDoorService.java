package com.pichlera.theDudeDoor.Services;

import com.pichlera.theDudeDoor.Models.Door;

public interface IDoorService {

    public void deleteDoorById(Long id);
    public Door saveDoor(Door door);
    public Iterable<Door> findAllDoors();
    public Door findDoorById(Long id);
}
