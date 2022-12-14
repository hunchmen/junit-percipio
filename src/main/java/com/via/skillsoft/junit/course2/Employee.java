package com.via.skillsoft.junit.course2;

import java.util.ArrayList;
import java.util.List;
import javax.naming.InvalidNameException;

public class Employee {

    String firstName;
    String lastName;
    Integer id;
    Character gender;
    String role;
    Double salary;
    String type;
    ArrayList<String> projects = new ArrayList<>();

    public Employee(String firstName, String lastName, int id, char gender,
            String role, double salary, String type) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gender = gender;
        this.role = role;
        this.salary = salary;
        this.type = type;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void adjustSalary(double adjAmount) throws InterruptedException {

        salary = salary + adjAmount;
        // Thread.sleep(6000);

    }

    public void validateLastName() throws InvalidNameException {

        if (!this.lastName.matches("^[a-zA-Z]*$")) {
            throw new InvalidNameException(
                    "The last name can only contain alphabets");
        }

    }

    /**
     * 
     * @param projectName
     */
    public void addProject(String projectName) {

        projects.add(projectName);
    }

    /**
     * 
     * @return projects
     */
    public List<String> getProjects() {
        return projects;
    }

}
