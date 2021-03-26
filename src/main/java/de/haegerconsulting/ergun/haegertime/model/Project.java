package de.haegerconsulting.ergun.haegertime.model;

import javax.persistence.*;

@Entity
@Table(name="project")
public class Project {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="customer", nullable = false, length = 50)
//    @ManyToOne
//    @JoinColumn(name="PrId")
    private String customer;

    @Column(name="titel", nullable = true, length = 50)
    private String titel;

    @Column(name="startdate", nullable = false, length = 50)
    private String startdate;

    @Column(name="enddate", nullable = false, length = 50)
    private String enddate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public Project() {
    }

    public Project(String customer, String titel, String startdate, String enddate) {
        this.customer = customer;
        this.titel = titel;
        this.startdate = startdate;
        this.enddate = enddate;
    }
}
