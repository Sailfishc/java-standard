package com.sailfish.service.impl;

import com.sailfish.common.DTOConvert;
import com.sailfish.dto.UserOutputDTO;
import com.sailfish.entity.User;

import org.springframework.beans.BeanUtils;

/**
 * @author sailfish
 * @create 2017-03-06-下午8:44
 */
public class UserOutDTOConvert implements DTOConvert<User, UserOutputDTO> {

    @Override
    public UserOutputDTO convert(User user) {
        UserOutputDTO userOutputDTO = new UserOutputDTO();
        BeanUtils.copyProperties(user, userOutputDTO);
        return userOutputDTO;
    }
}
