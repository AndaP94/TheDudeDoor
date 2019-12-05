package com.pichlera.theDudeDoor.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DoorPersonSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isActivate")
    private boolean isActivate;

    @ManyToOne()
    @JoinColumn(name = "door_id")
    private Door door;

    @ManyToOne()
    @JoinColumn(name = "person_id")
    private Person person;

}
