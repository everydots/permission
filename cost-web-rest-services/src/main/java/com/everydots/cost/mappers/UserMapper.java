package com.everydots.cost.mappers;

import com.everydots.cost.common.SQLs;
import com.everydots.cost.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Insert(SQLs.INSERT_USER_SQL)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void insertUser(User user);

    @Select(SQLs.QUERY_USER)
    public User getUser(String userName);


}
