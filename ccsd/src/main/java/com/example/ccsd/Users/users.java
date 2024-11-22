package com.example.ccsd.Users;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// changes here again
@Document(collection = "users")
public class users {
    
    @Id
    private String id;
    private String FirstName;
    private String Lastname;
    private String Phone;
    private String Email;
    private String Address;
    private String Password;
    private String ShowPassword;
    private String Image;
    private String userName;
    private Date Dob;
    private String Role;

    public users() {}

    public users(String FirstName, String Lastname, String Phone, String Email, String Address, String Password, String ShowPassword, String Image, String userName, Date Dob,
    String Role) {
        this.FirstName = FirstName;
        this.Lastname = Lastname;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.Password = Password;
        this.ShowPassword = ShowPassword;
        this.Image = Image;
        this.userName = userName;
        this.Dob = Dob;
        this.Role = Role;


    }
        
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getShowPassword() {
        return ShowPassword;
    }

    public void setShowPassword(String ShowPassword) {
        this.ShowPassword = ShowPassword;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getuserName() {
        return userName;
    }
    public void setuserName(String userName) {
        this.userName = userName;
    }

    public Date getDob() {
        return Dob;
    }
    public void setDob(Date Dob) {
        this.Dob = Dob;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

}
