package com.example.demo.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.demo.web.dto.UserRegistraionDto;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Update with your React app's URL
@RequestMapping("api/v1/user")
public class UserRegistrationController {

    private final UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<Void> registerUserAccount(@RequestBody UserRegistraionDto registraionDto) {
        userService.save(registraionDto);
        return ResponseEntity.ok().build();
    }
}
