package com.bikalp.AuthService.Service.Implementation;

import com.bikalp.AuthService.Entity.User;
import com.bikalp.AuthService.Repository.UserRepo;
import com.bikalp.AuthService.Service.UserService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User save(User user) {
        user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt()));
        return userRepo.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }
}
