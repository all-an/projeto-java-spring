package com.projetospring.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
