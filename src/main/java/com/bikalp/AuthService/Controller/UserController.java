package com.bikalp.AuthService.Controller;

import com.bikalp.AuthService.Entity.User;
import com.bikalp.AuthService.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user){
        return ResponseEntity.ok().body(userService.save(user));
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id){
        return ResponseEntity.ok().body(userService.getById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok().body(userService.getAll());
    }

}
