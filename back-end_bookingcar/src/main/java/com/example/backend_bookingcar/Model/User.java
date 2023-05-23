package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private int uid;

    @Column(name = "fullname")
    private String fullname;
    @Column(name = "phonenumber")
    private String phonenumber;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "address")
    private String address;
    @Column(name = "role")
    private String role;

    public User() {
    }

    public User(int uid, String fullname, String phonenumber, String email, String password, String address, String role) {
        this.uid = uid;
        this.fullname = fullname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.password = password;
        this.address = address;
        this.role = role;
    }

    public User(String fullname, String phonenumber, String email, String password, String address, String role) {
        this.fullname = fullname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.password = password;
        this.address = address;
        this.role = role;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}


