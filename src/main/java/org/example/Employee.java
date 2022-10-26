package org.example;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private int salary;

}
