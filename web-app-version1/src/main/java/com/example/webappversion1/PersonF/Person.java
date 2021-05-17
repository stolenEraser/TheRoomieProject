package com.example.webappversion1.PersonF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table //mapped to database table
public class Person {
    private String firstname;
    private String lastname;
    @Id
    @SequenceGenerator(
        name= "person_sequence",
        sequenceName = "person_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "person_sequence"

    )
    private Long id;


    public Person(){

    }

    public Person(Long id, String firstname){
        this.id= id;
        this.firstname= firstname;
    }

    public Person(Long id,String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirst(){
        return firstname;
    }

    public String getLast(){
        return lastname;
    }

    public Long getId(){
        return id;
    }
    
}
