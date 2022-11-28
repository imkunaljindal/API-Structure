package com.example.RestApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers()
    {
        return userRepository.getAllUsersFromDB();
    }

    public void addUserToDB(User user)
    {
        userRepository.addUserInDB(user);
    }
}
