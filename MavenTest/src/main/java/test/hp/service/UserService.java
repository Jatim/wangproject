package test.hp.service;

import test.hp.bean.User;

public interface UserService {
	/**
	  * @��½
	  * */
   public User FindByUnameAndPwd(String uname, String pwd);
   /**
    * @���µ�¼ʱ��
    * */
    public boolean UpdateUser(User u);
   /**
    * @ע��
    * */
   public boolean AddUser(User user);
   
   public boolean FindByQq(String qq);
}
