package com.example.springdemoproject;

import com.example.springdemoproject.user.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    UserRepository repository;

    @GetMapping("/welcome") 
    public String welcome() {
        return "Welcome to my Site";
    }

    @PostMapping("/add")
    public int addit(@RequestBody add a) {
        return a.getA() + a.getB();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        repository.deleteById(id);
        return "Deleted Succesfully";
    }

    @PostMapping("/insert")
    public String insert(@RequestBody users user) {
        repository.insert(user);
        return "Inserted Successfully";
    }

    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable("a") int a, @PathVariable("b") int b) {
        return (a + b)+"";
    }
}
