package test.hp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import test.hp.bean.User;

public interface UserMapper {
	/**
	 * @��½
	 * */
    User FindLogin(@Param("username")String username,@Param("password")String password);
   /**
    * @���µ�¼ʱ��
    * */
    Integer UpdateLastVisit(User u);
    /**
    * @ע��
    **/
    Integer AddUser(User user);
    List<User> findByQq(String qq);
}
