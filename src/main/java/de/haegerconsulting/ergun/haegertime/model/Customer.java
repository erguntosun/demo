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
    @Column(name="eMail", nullable = false, length = 50)
    private String eMail;

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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }



    public Customer(String company, String prename, String surname, String eMail) {
        this.company = company;
        this.prename = prename;
        this.surname = surname;
        this.eMail = eMail;
    }




}
