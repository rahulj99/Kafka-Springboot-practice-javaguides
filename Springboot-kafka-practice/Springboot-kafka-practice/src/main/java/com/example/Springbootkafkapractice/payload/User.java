package com.example.Springbootkafkapractice.payload;

public class User {
    private int id;
    private String firstaName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstaName() {
        return firstaName;
    }

    public void setFirstaName(String firstaName) {
        this.firstaName = firstaName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstaName='" + firstaName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
