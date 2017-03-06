package com.sailfish.web;

import com.sailfish.dto.UserInputDTO;
import com.sailfish.dto.UserOutputDTO;
import com.sailfish.entity.User;
import com.sailfish.service.UserService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sailfish
 * @create 2017-03-06-下午8:22
 */
@RequestMapping("/v1/api/user")
@RestController
public class UserApi {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserOutputDTO addUser(UserInputDTO userInputDTO) {
        User user = userInputDTO.convertToUser();
        User convertUser = userService.addUser(user);

        UserOutputDTO userOutputDTO = convertUser.convertToUserOutputDTO();
        return userOutputDTO;
    }

    private User convertFor(UserInputDTO userInputDTO) {
        User user = new User();
        BeanUtils.copyProperties(userInputDTO, user);
        return user;
    }

}
