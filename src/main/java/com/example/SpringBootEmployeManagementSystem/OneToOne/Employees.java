package com.example.SpringBootEmployeManagementSystem.OneToOne;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employees {
    private int id;
    @Getter
    @Setter

    @Column(name = "firstname", nullable = false)
    private String firstName;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }



    private String lastName;

    public void setAddress(String address) {
        this.address = address;
    }

    private int salary;
    @OneToOne
    private String address;

    public Employees(){

    }

    public Employees(int id, String firstName, String lastName, int salary, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.address = address;
    }
}
