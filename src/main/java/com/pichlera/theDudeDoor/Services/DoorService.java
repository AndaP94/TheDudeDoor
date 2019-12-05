package com.pichlera.theDudeDoor.Services;

import com.pichlera.theDudeDoor.Models.Door;
import com.pichlera.theDudeDoor.Repositories.IDoorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoorService implements IDoorService {

    private IDoorRepository doorRepository;

    @Autowired
    public DoorService(IDoorRepository doorRepository){
        this.doorRepository = doorRepository;
    }

    @Override
    public void deleteDoorById(Long id) {
        Door door = findDoorById(id);
        this.doorRepository.delete(door);
    }

    @Override
    public Door saveDoor(Door door) {
        return doorRepository.save(door);
    }

    @Override
    public Iterable<Door> findAllDoors() {
        return doorRepository.findAll();
    }

    @Override
    public Door findDoorById(Long id) {
        return this.doorRepository.findDoorById(id);
    }
}
