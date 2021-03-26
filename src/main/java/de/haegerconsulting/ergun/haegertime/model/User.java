package de.haegerconsulting.ergun.haegertime.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user")
public class User {
    public User(String username, String password, String lastName, String firstName, String address, String role) {
        this.username = username;
        this.password = password;
        this.lastName = lastName;
        this.FirstName = firstName;
        this.address = address;
        this.role = role;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="username", nullable = false, length = 50)
    private String username;

    @Column(name="password", nullable = false, length = 50)
    private String password;

    @Column(name="lastName", nullable = false, length = 50)
    private String lastName;

    @Column(name="firstName", nullable = false, length = 50)
     private String FirstName;

    @Column(name="address", nullable = false, length = 50)
    private String address;

    @Column(name="role", nullable = false, length = 50)
    private String role;


}
