package com.everydots.cost.mappers;

import com.everydots.cost.common.MybatisSQLs;
import com.everydots.cost.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Insert(MybatisSQLs.INSERT_USER_SQL)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public String insertUser(User user);

    @Select(MybatisSQLs.QUERY_USER)
    public User getUser(String userName);


}
