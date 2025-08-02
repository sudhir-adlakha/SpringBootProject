package com.example.demo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Generated;

import java.util.UUID;

@Entity
@Table(name = "employee", schema = "myschema")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Generated
    private UUID universalId;

    private String employeeName;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public UUID getUniversalId() {
        return universalId;
    }

    public void setUniversalId(UUID universalId) {
        this.universalId = universalId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}