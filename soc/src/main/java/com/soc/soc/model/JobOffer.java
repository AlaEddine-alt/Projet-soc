package com.soc.soc.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class JobOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String source;
    private String title;
    private int nb_posts;
    private String post_date;
    private String contact;




    private String contact_info;




    @ManyToOne
    public Company company;





    // Getters et setters
}
