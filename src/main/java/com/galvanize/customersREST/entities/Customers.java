package com.galvanize.customersREST.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "service_requests")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "requestNumber")
    private String requestNumber;
    @Column(name = "requestDateTime")
    private Timestamp requestDateTime;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "customerAddress")
    private String customerAddress;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "description")
    private String description;
    @Column(name = "technician")
    private String technician;
    @Column(name = "appointmentDateTime")
    private Timestamp appointmentDateTime;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;
    // Notes ?
//    @Column(name = "notes")
//    private List<String> notes;

    public Customers() { }

    // Initial Service Request
    public Customers(Timestamp requestDateTime, String customerName, String customerAddress, String phoneNumber, String description) {
        this.requestDateTime = requestDateTime;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.technician = "UNASSIGNED";
        this.status = Status.UNASSIGNED;
    }
    // Retrieve Existing Service Request
    public Customers(String requestNumber, Timestamp requestDateTime, String customerName, String customerAddress, String phoneNumber, String description, String technician, String status) {
        this.requestNumber = requestNumber;
        this.requestDateTime = requestDateTime;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.technician = technician;
        this.status = Status.PENDING;
    }
    // Set Appointment Time on Service Request
    public Customers(String requestNumber, Timestamp requestDateTime, String customerName, String customerAddress, String phoneNumber, String description, String technician, Timestamp appointmentDateTime, String status) {
        this.requestNumber = requestNumber;
        this.requestDateTime = requestDateTime;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.technician = technician;
        this.appointmentDateTime = appointmentDateTime;
        this.status = Status.ASSIGNED;
    } // Need to add getters and setters
}
