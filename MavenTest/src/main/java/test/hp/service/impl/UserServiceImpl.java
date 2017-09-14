package test.hp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.hp.bean.User;
import test.hp.mapper.UserMapper;
import test.hp.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserMapper usermapper;
	public void setUsermapper(UserMapper usermapper) {
		this.usermapper = usermapper;
	}
	@Override
	public User FindByUnameAndPwd(String uname,String pwd) {
		return usermapper.FindLogin(uname,pwd);
	}
	@Override
	public boolean UpdateUser(User u) {
		return usermapper.UpdateLastVisit(u)>0?true:false;
	}
	@Override
	public boolean AddUser(User user) {
       return usermapper.AddUser(user)>0?true:false;		
	}
	@Override
	public boolean FindByQq(String qq) {
		return usermapper.findByQq(qq).size()>0?true:false;
	}
	

}
