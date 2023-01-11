package com.maybank.smartweb.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 4, max = 20)
    @Column(name = "first_name")
    private String firstName;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 4, max = 20)
    @Column(name = "last_name")
    private String lastName;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 4, max = 20)
    private String contact;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 4, max = 20)
    private String address;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
