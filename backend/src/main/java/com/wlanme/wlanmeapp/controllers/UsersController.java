package com.wlanme.wlanmeapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wlanme.wlanmeapp.models.Users;
import com.wlanme.wlanmeapp.repository.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/user")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/all")
    public List<Users> listUtilisateur() {
        return usersRepository.findAll();
    }

    @GetMapping("/{id}")
    public Users getUserById(@RequestParam String param) {
        return usersRepository.findById(param).get();
    }

    @SuppressWarnings("null")
    @PostMapping
    public ResponseEntity<Users> postMethodName(@RequestBody Users users) {
        try {
            Optional<Users> existingUserEmail = usersRepository.findByEmail(users.getEmail());
            Optional<Users> existingUserUsername = usersRepository.findByUsername(users.getUsername());

            if (existingUserEmail.isPresent() || existingUserUsername.isPresent()) {
                if (existingUserEmail.isPresent() && !existingUserUsername.isPresent()) {
                    System.out.println("L'email existe déjà !");
                } else if (existingUserUsername.isPresent() && !existingUserEmail.isPresent()) {
                    System.out.println("Le username existe déjà !");
                } else {
                    System.out.println("L'email et le username existe déjà !");
                }
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            } else {
                Users userSave = usersRepository.save(users);
                return new ResponseEntity<>(userSave, HttpStatus.CREATED);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
