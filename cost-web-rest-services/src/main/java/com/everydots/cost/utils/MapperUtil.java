package com.everydots.cost.utils;

import com.everydots.cost.beans.User;
import com.everydots.cost.models.UserModel;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 *数据转换类
 */
public class MapperUtil {

    public static User mapAsUser(String content){
        ObjectMapper mapper =new ObjectMapper();
        User user= null;
        try {
            user = mapper.readValue(content, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user;

    }
    public static UserModel mapAsUserModel(String content){
        ObjectMapper mapper =new ObjectMapper();
        UserModel user= null;
        try {
            user = mapper.readValue(content, UserModel.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user;
    }


}
