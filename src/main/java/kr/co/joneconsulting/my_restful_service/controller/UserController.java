package kr.co.joneconsulting.my_restful_service.controller;

import kr.co.joneconsulting.my_restful_service.bean.User;
import kr.co.joneconsulting.my_restful_service.dao.UserDAOService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserDAOService service;

    public UserController(UserDAOService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveAllUser(@PathVariable int id) {
        return service.findOne(id);
    }
}
