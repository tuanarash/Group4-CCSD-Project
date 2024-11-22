package com.example.ccsd.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// changes here
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/Users")
public class UsersController {
    

    @Autowired
    private UsersService UsersService;

    @GetMapping
    public List<Users> getAlluser() {
        return UsersService.getAlluser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> getusersById(@PathVariable String id) {
        return UsersService.getusersById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Users addusers(@RequestBody Users Users) {
        return UsersService.addusers(Users);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Users> updateusers(@PathVariable String id, @RequestBody Users UsersDetails) {
        Users updatedusers = UsersService.updateusers(id, UsersDetails);
        if (updatedusers != null) {
            return ResponseEntity.ok(updatedusers);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteusers(@PathVariable String id) {
        UsersService.deleteusers(id);
        return ResponseEntity.noContent().build();
    }
}
