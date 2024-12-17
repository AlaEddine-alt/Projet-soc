package com.soc.soc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class JobOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;

    @ManyToOne
    private Company company;





    // Getters et setters
}
