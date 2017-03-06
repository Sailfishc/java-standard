package com.sailfish.entity;

import com.sailfish.common.DTOConvert;
import com.sailfish.dto.UserOutputDTO;

import org.springframework.beans.BeanUtils;

/**
 * @author sailfish
 * @create 2017-03-06-下午8:24
 */
public class User {

    private String userName;
    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserOutputDTO convertToUserOutputDTO (){
        UserOutDTOConvert userOutDTOConvert = new UserOutDTOConvert();
        UserOutputDTO convert = userOutDTOConvert.convert(this);
        return convert;
    }

    private static class UserOutDTOConvert implements DTOConvert<User, UserOutputDTO> {

        @Override
        public UserOutputDTO convert(User user) {
            UserOutputDTO userOutputDTO = new UserOutputDTO();
            BeanUtils.copyProperties(user, userOutputDTO);
            return userOutputDTO;
        }
    }
}
