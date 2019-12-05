package com.pichlera.theDudeDoor.Controller;

import com.pichlera.theDudeDoor.Models.Door;
import com.pichlera.theDudeDoor.Services.DoorService;
import com.pichlera.theDudeDoor.Services.IDoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://localhost:4200")
public class DoorController implements IDoorController {

    private IDoorService doorService;
    private static long doorId = 0;

    @Autowired
    public DoorController(DoorService doorService){
        this.doorService = doorService;
    }

    @GetMapping("doors/{id}")
    @Override
    public Door getDoorById(@PathVariable Long id) {
        return this.doorService.findDoorById(id);
    }

    @PostMapping
    @Override
    public Door saveDoor(Door door) {
        return this.doorService.saveDoor(door);
    }

    @DeleteMapping("/doors/{id}")
    @Override
    public void deleteDoor(@PathVariable Long doorId) {
        this.doorService.deleteDoorById(doorId);
    }

    @GetMapping("doors")
    @Override
    public ResponseEntity<Iterable<Door>> findAllDoors() {
        return ResponseEntity.ok(this.doorService.findAllDoors());
    }
}
