package test.hp.bean;

import java.util.Date;

public class Friendmap {
   private Integer friendmapid;
   private Integer userid;
   private Integer friendid;
   private Integer state;
   private Date addtime;
   private User user;
   
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Integer getFriendmapid() {
	return friendmapid;
}
public void setFriendmapid(Integer friendmapid) {
	this.friendmapid = friendmapid;
}
public Integer getUserid() {
	return userid;
}
public void setUserid(Integer userid) {
	this.userid = userid;
}
public Integer getFriendid() {
	return friendid;
}
public void setFriendid(Integer friendid) {
	this.friendid = friendid;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
public Date getAddtime() {
	return addtime;
}
public void setAddtime(Date addtime) {
	this.addtime = addtime;
}
   
}
