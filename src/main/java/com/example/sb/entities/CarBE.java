package com.example.sb.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "car")
public class CarBE {

    @Id
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "car_employee",
            joinColumns = { @JoinColumn(name = "car_id", referencedColumnName="id") },
            inverseJoinColumns = { @JoinColumn(name = "employee_id", referencedColumnName = "id") })
    private Collection<EmployeeBE> employees;

}
