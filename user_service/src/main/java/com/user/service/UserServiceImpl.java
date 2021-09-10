package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements com.user.service.UserService {

    List<User> list = List.of(
            new User(1L, "Yogesh Singh", "8954667361"),
            new User(2L, "Gaurav Singh", "89546623423"),
            new User(3L, "Akash Sharma", "89545454545"),
            new User(4L, "Vaibhav Dixit", "89546656562")
    );

    @Override
    public User getUser(Long userId) {
        return list.stream().filter(user ->
                        user.getUserId().equals(userId))
                .findAny().orElse(null);
    }
}
