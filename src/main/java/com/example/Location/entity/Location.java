package com.example.Location.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;


@Entity
@AllArgsConstructor
@Data
@Getter
@NoArgsConstructor
public class Location {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String city;
    String country;
    String region;


}
