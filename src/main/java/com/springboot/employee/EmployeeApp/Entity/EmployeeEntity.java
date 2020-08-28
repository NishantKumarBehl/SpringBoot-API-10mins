package com.springboot.employee.EmployeeApp.Entity;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class EmployeeEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="email")
    private String email;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeEntity [id = " + id + ",FirstName = "+ firstName + ",LastName = " + lastName + ",Email = " + email +"]";
    }
}
