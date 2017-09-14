package test.hp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import test.hp.bean.User;

public interface UserMapper {
	/**
	 * @登陆
	 * */
    User FindLogin(@Param("username")String username,@Param("password")String password);
   /**
    * @更新登录时间
    * */
    Integer UpdateLastVisit(User u);
    /**
    * @注册
    **/
    Integer AddUser(User user);
    List<User> findByQq(String qq);
}
