package com.pichlera.theDudeDoor.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private Set<DoorPersonSet> doorPersonSets;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private Set<Event> events;

}
