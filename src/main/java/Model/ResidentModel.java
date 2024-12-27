/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author karuna
 */
public class ResidentModel {
    public class Resident {
    private String residentId;
    private String name;
    private int age;
    private String roomNumber;

    // Constructor
    public Resident(String residentId, String name, int age, String roomNumber) {
        this.residentId = residentId;
        this.name = name;
        this.age = age;
        this.roomNumber = roomNumber;
    }

    // Getters
    public String getResidentId() {
        return residentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    // toString method for printing
    @Override
    public String toString() {
        return "ID: " + residentId + ", Name: " + name + ", Age: " + age + ", Room: " + roomNumber;
    }
}

}
       
