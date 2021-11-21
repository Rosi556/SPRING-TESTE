package com.example.course.service;

import com.example.course.entities.User;
import com.example.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired //Pega a instancia e joga dentro da classe, dentro do repository,
    //Variavel para representar o Repository
    private UserRepository userRepository;

    //Adicionar Usuário
    public User add(Object object){
        return userRepository.save((User) object);
    }
    //Pesquisar um Usuário
    public User get(long id) {
        return userRepository.findById(id);
    }
    //Atualiza dados do Usuário
    public User update(Object object) {
        return userRepository.save((User) object);
    }
    //Contar quantos clientes foram inseridos no banco
    public long quantidaUser() {
        return userRepository.count();
    }
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
}