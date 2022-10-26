package org.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Laptop {
    @Id
    private int lid;
    private String lname;
    private int price;

}
