package com.example.RestApiController;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Component
public class UserRepository {

    Map<Integer,User> users = new HashMap<>();

    public void addUserInDB(User user)
    {
        users.put(user.getId(),user);
    }

    public List<User> getAllUsersFromDB()
    {
        List<User> listOfUsers = new ArrayList<>();
        for(User user: users.values())
            listOfUsers.add(user);

        return listOfUsers;
    }
}
