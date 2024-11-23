package com.example.ccsd.Users;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usersService {

    @Autowired
    private usersRepository usersRepository;

    // Getting all users
    public List<users> getAlluser() {
        return usersRepository.findAll();
    }

    // Getting single users
    public Optional<users> getusersById(String id) {
        return usersRepository.findById(id);
    }

    // Creating new data in repository

    public users addusers(users Users) {
        return usersRepository.save(Users);
    }

    // Updating the users

    public users updateusers(String id, users UsersDetails) {
        Optional<users> UsersOpt = usersRepository.findById(id);
        if (UsersOpt.isPresent()) {

            // Get from database

            users Users = UsersOpt.get();
            Users.setfirstName(UsersDetails.getfirstName());
            Users.setlastName(UsersDetails.getlastName());
            Users.setphone(UsersDetails.getphone());
            Users.setemail(UsersDetails.getemail());
            Users.setaddress(UsersDetails.getaddress());
            Users.setpassword(UsersDetails.getpassword());
            Users.setShowPassword(UsersDetails.getShowPassword());
            Users.setimage(UsersDetails.getimage());
            Users.setuserName(UsersDetails.getuserName());
            Users.setdob(UsersDetails.getdob());
            Users.setrole(UsersDetails.getrole());
            return usersRepository.save(Users);
        }
        return null;
    }

    // Deleting
    
    public void deleteusers(String id) {
        usersRepository.deleteById(id);
    } 
}

// changes here