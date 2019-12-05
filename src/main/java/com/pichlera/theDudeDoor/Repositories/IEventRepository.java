package com.pichlera.theDudeDoor.Repositories;

import com.pichlera.theDudeDoor.Models.Event;
import org.springframework.data.repository.CrudRepository;

public interface IEventRepository extends CrudRepository<Event, Long> {
}
