package com.example.SpringBootEmployeManagementSystem.OneToOne;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Address")

public class Address {
    @Id
    @GeneratedValue
    @Column(name = "address_id")
    private int id;
    @Getter
    @Setter
    @Column(name = "city")
    private String city;

    @Column(name = "Street")
    private String street;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private String zipcode;


   public Address(){}

    public Address(int id, String street, String city, String state, String zipcode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
