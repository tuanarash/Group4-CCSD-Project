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
    private String showPassword;
    private byte[] image;
    private String userName;
    private String dob;
    private String role;
    

    public users() {}

    public users(String firstName, String lastName, String phone, String email, String address, String password, String showPassword, byte[] image, String userName, String dob,
    String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.password = password;
        this.showPassword = showPassword;
        this.image = image;
        this.userName = userName;
        this.dob = dob;
        this.role = role;
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

    public String getshowPassword() {
        return showPassword;
    }

    public void setshowPassword(String showPassword) {
        this.showPassword = showPassword;
    }


    public byte[] getimage() {
        return image;
    }

    public void setimage(byte[] image) {
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
