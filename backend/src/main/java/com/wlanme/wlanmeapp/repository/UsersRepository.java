package com.wlanme.wlanmeapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wlanme.wlanmeapp.models.Users;

public interface UsersRepository extends MongoRepository<Users, String> {
    // la méthode pour récupérer un utilisateur avec un email
    Optional<Users> findByEmail(String email);

    // la méthode pour récupérer un utilisateur avec un Username
    Optional<Users> findByUsername(String username);
}
