package com.in60minutes.task_project.service;

import com.in60minutes.task_project.dto.UserDto;
import com.in60minutes.task_project.entity.User;
import com.in60minutes.task_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto createUser(UserDto userDto) {
        User users = userDtoToEntity(userDto);
        User savedUser = userRepository.save(users);
        return entityToUserDto(savedUser);
    }

    private User userDtoToEntity(UserDto userDto){
        User user =new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        return user;
    }

    private UserDto entityToUserDto(User user1){
        UserDto userDto = new UserDto();
        userDto.setId(user1.getId());
        userDto.setName(user1.getName());
        userDto.setEmail(user1.getEmail());
        userDto.setPassword(user1.getPassword());
        return userDto;
    }
}
