package controller;

import com.example.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.Optional;

@RestController
@RequestMapping( "api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUser(@RequestBody User pessoa){
        return userService.add(pessoa);
    }


    @GetMapping("/user/{id}")
    public User getCliente(@PathVariable(value = "id") long id){
        return userService.get(id);
    }

    @PutMapping("/user/{id}")
    public User updateUser(@RequestBody User pessoa, @PathVariable(value = "id") long id){
        Optional<User> user = userService.findById(id);
        if(user.isPresent()) {
            pessoa.setId(user.get().getId());
            return userService.update(pessoa);
        }
        return null;

    }

    @GetMapping("/quantidadeuser")
    public long qtdeUser(){
        return userService.quantidaUser();}
    }




