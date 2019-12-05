package com.pichlera.theDudeDoor.Services;

import com.pichlera.theDudeDoor.Models.Door;
import com.pichlera.theDudeDoor.Models.DoorPersonSet;

public interface IDoorPersonSetService {

    public void deleteDoorPersonSetById(Long id);
    public DoorPersonSet saveDoorPersonSet(DoorPersonSet doorPersonSet);
    public Iterable<DoorPersonSet> getAllDoorPersonSets();
    public DoorPersonSet getDoorPersonSetByDoorId(Long doorId);
}
