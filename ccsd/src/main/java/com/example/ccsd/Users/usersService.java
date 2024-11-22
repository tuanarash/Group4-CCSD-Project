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
            Users.setFirstName(UsersDetails.getFirstName());
            Users.setLastname(UsersDetails.getLastname());
            Users.setPhone(UsersDetails.getPhone());
            Users.setEmail(UsersDetails.getEmail());
            Users.setAddress(UsersDetails.getAddress());
            Users.setPassword(UsersDetails.getPassword());
            Users.setShowPassword(UsersDetails.getShowPassword());
            Users.setImage(UsersDetails.getImage());
            Users.setuserName(UsersDetails.getuserName());
            Users.setDob(UsersDetails.getDob());
            Users.setRole(UsersDetails.getRole());
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