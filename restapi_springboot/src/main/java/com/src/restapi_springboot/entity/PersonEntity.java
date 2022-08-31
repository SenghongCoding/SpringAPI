package com.src.restapi_springboot.entity;

public class PersonEntity {
    private long id;
    private String firstname;
    private String lastname;
    private String major;
    private String gender;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PersonEntity() {

    }

    public PersonEntity(long id, String firstname, String lastname, String major, String gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id +
                ",firstname '" + firstname + '\'' +
                ",lastname '" + lastname + '\'' +
                ",maJor'" + major + '\'' +
                ",gender'" + gender + '\'' +
                '}';

    }
}
