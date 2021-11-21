package com.example.course.repository;

import com.example.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //Tipo NomeDoMetodo (Tipo Variavel)

    User findById(long id);
}
