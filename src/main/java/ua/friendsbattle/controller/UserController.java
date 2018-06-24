package ua.friendsbattle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.friendsbattle.entity.User;
import ua.friendsbattle.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/{id}")
    public User getUser(@PathVariable("userId") String id) {
        return userRepository.findOne(id);
    }

    @PostMapping
    public User saveUser(@RequestParam(name = "userId") String id) {
        return userRepository.save(new User(id));
    }

}
