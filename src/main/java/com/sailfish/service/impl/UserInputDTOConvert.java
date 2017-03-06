package com.sailfish.service.impl;

import com.sailfish.common.DTOConvert;
import com.sailfish.dto.UserInputDTO;
import com.sailfish.entity.User;

import org.springframework.beans.BeanUtils;

/**
 * @author sailfish
 * @create 2017-03-06-下午8:35
 */
public  class UserInputDTOConvert implements DTOConvert<UserInputDTO, User> {

    @Override
    public User convert(UserInputDTO userInputDTO) {
        User user = new User();
        BeanUtils.copyProperties(userInputDTO, user);
        return user;
    }


}
