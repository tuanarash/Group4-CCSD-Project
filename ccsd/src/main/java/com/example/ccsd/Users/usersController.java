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
@RequestMapping("/api/users")
public class usersController {
    

    @Autowired
    private usersService usersService;

    @GetMapping
    public List<users> getAlluser() {
        return usersService.getAlluser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<users> getusersById(@PathVariable String id) {
        return usersService.getusersById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public users addusers(@RequestBody users Users) {
        return usersService.addusers(Users);
    }

    @PutMapping("/{id}")
    public ResponseEntity<users> updateusers(@PathVariable String id, @RequestBody users UsersDetails) {
        users updatedusers = usersService.updateusers(id, UsersDetails);
        if (updatedusers != null) {
            return ResponseEntity.ok(updatedusers);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteusers(@PathVariable String id) {
        usersService.deleteusers(id);
        return ResponseEntity.noContent().build();
    }
}
