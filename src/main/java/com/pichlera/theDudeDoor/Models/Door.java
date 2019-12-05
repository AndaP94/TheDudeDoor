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
public class Door {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isOpen")
    private boolean isOpen;

    @OneToMany(mappedBy = "door", cascade = CascadeType.ALL)
    private Set<DoorPersonSet> doorPersonSets;

}
