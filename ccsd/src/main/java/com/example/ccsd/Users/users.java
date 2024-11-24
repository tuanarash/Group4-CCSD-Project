package com.example.ccsd.Users;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// changes here again
@Document(collection = "users")
public class users {
    
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private String password;
    private String role;
    private String userName;
    private String dob;
    private String image;
    

    public users() {}

    //Constructor
    public users(String email, String password, String firstName, String lastName, String phone, String address, String role, String userName, String dob,
    String image) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.userName = userName;
        this.dob = dob;
        this.image = image;
        
    }
        
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getimage() {
        return image;
    }

    public void setimage(String image) {
        this.image = image;
    }

    public String getuserName() {
        return userName;
    }
    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getdob() {
        return dob;
    }
    public void setdob(String dob) {
        this.dob = dob;
    }

    public String getrole() {
        return role;
    }

    public void setrole(String role) {
        this.role = role;
    }

}
