package com.pichlera.theDudeDoor.Controller;

import com.pichlera.theDudeDoor.Models.Door;
import com.pichlera.theDudeDoor.Services.DoorService;
import com.pichlera.theDudeDoor.Services.IDoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoorController implements IDoorController {

    private IDoorService doorService;
    private static long doorId = 0;

    @Autowired
    public DoorController(DoorService doorService){
        this.doorService = doorService;
    }

    @GetMapping("/doors/{id}")
    @Override
    public Door getDoorById(@PathVariable Long id) {
        return this.doorService.findDoorById(id);
    }

    @PostMapping("/doors")
    @Override
    public Door saveDoor(@RequestBody Door door) {
        return this.doorService.saveDoor(door);
    }

    @DeleteMapping(value = "/doors/{id}")
    @Override
    public void deleteDoor(@PathVariable Long id) {
        this.doorService.deleteDoorById(id);
    }

    @GetMapping("/doors")
    @Override
    public ResponseEntity<Iterable<Door>> findAllDoors() {
        return ResponseEntity.ok(this.doorService.findAllDoors());
    }
}
