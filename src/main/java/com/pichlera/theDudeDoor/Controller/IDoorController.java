package com.pichlera.theDudeDoor.Controller;

import com.pichlera.theDudeDoor.Models.Door;
import org.springframework.http.ResponseEntity;

public interface IDoorController {

    public Door getDoorById(Long id);
    public Door saveDoor(Door door);
    public void deleteDoor(Long id);
    public ResponseEntity<Iterable<Door>> findAllDoors();
}
