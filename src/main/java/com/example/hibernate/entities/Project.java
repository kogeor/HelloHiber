package com.example.hibernate.entities;

import jakarta.persistence.*;

@Entity
public class Project {
    @Basic
    @Column(name = "Name", nullable = true, length = -1)
    private String name;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProjectId", nullable = false)
    private Integer projectId;
    @Basic
    @Column(name = "Employee", nullable = true)
    private Integer employee;
    @Basic
    @Column(name = "Customer", nullable = true)
    private Integer customer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getEmployee() {
        return employee;
    }

    public void setEmployee(Integer employee) {
        this.employee = employee;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (name != null ? !name.equals(project.name) : project.name != null) return false;
        if (projectId != null ? !projectId.equals(project.projectId) : project.projectId != null) return false;
        if (employee != null ? !employee.equals(project.employee) : project.employee != null) return false;
        if (customer != null ? !customer.equals(project.customer) : project.customer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (employee != null ? employee.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        return result;
    }
}
