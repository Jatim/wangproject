package test.hp.service;

import test.hp.bean.User;

public interface UserService {
	/**
	  * @登陆
	  * */
   public User FindByUnameAndPwd(String uname, String pwd);
   /**
    * @更新登录时间
    * */
    public boolean UpdateUser(User u);
   /**
    * @注册
    * */
   public boolean AddUser(User user);
   
   public boolean FindByQq(String qq);
}
