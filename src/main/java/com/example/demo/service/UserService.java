package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.web.dto.UserRegistraionDto;

public interface UserService {
  User save(UserRegistraionDto registraionDto);
}
