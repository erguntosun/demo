package de.haegerconsulting.ergun.haegertime.model;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="company", nullable = false, length = 50)
    private String company;

    @Column(name="prename", nullable = false, length = 50)
    private String prename;

    @Column(name="surname", nullable = false, length = 50)
    private String surname;

    @Column(name="mail", nullable = false, length = 50)
    private String mail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String Mail) {
        this.mail = mail;
    }


    public Customer() {
    }

    public Customer(String company, String prename, String surname, String mail) {
        this.company = company;
        this.prename = prename;
        this.surname = surname;
        this.mail = mail;
    }




}
