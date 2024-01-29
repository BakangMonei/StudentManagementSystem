package Model;

import java.util.Objects;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Saturday 11 November 2023
 * @Time: 9:09 PM
 */
public class Student {
    // Attributes
    int id;
    String firstName, lastName, physicalAddress;
    char gender;

    // Empty Constructor
    public Student(){
        super();
    }

    // Getters & Setters

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

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // equals() & hashCodes()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && gender == student.gender && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(physicalAddress, student.physicalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, physicalAddress, gender);
    }
}
