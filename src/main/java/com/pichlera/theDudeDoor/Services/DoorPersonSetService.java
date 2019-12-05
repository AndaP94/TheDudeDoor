package com.pichlera.theDudeDoor.Services;

import com.pichlera.theDudeDoor.Models.Door;
import com.pichlera.theDudeDoor.Models.DoorPersonSet;
import com.pichlera.theDudeDoor.Repositories.IDoorPersonSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoorPersonSetService implements IDoorPersonSetService {

    private IDoorPersonSetRepository doorPersonSetRepository;

    @Autowired
    public DoorPersonSetService(IDoorPersonSetRepository doorPersonSetRepository){
        this.doorPersonSetRepository = doorPersonSetRepository;
    }

    @Override
    public void deleteDoorPersonSetById(Long doorId) {
        DoorPersonSet doorPersonSet = this.doorPersonSetRepository.getDoorPersonSetById(doorId);
        this.doorPersonSetRepository.delete(doorPersonSet);
    }

    @Override
    public DoorPersonSet saveDoorPersonSet(DoorPersonSet doorPersonSet) {
        return this.doorPersonSetRepository.save(doorPersonSet);
    }

    @Override
    public Iterable<DoorPersonSet> getAllDoorPersonSets() {
        return this.doorPersonSetRepository.findAll();
    }

    @Override
    public DoorPersonSet getDoorPersonSetByDoorId(Long doorId) {
        return this.doorPersonSetRepository.getDoorPersonSetById(doorId);
    }
}
