package test.hp.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Feel {
   private Integer feelid;
   private Integer userid;
   private Date    feeltime;
   private String feelcontent;
   private String pic;
   private User user;
public Integer getFeelid() {
	return feelid;
}
public void setFeelid(Integer feelid) {
	this.feelid = feelid;
}
public Integer getUserid() {
	return userid;
}
public void setUserid(Integer userid) {
	this.userid = userid;
}
public Date getFeeltime() {
	return feeltime;
}
public void setFeeltime(Date feeltime) {
	this.feeltime = feeltime;
}
public String getFeelcontent() {
	return feelcontent;
}
public void setFeelcontent(String feelcontent) {
	this.feelcontent = feelcontent;
}
public String getPic() {
	return pic;
}
public void setPic(String pic) {
	this.pic = pic;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
@Override
public String toString() {
	return "Feel [feelid=" + feelid + ", userid=" + userid + ", feeltime=" + feeltime + ", feelcontent=" + feelcontent
			+ ", pic=" + pic + ", user=" + user + "]";
}
   
}
