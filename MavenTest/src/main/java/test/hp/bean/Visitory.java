package test.hp.bean;

import java.util.Date;

public class Visitory {
	private Integer visitoryid;
	private Integer userid;
	private Integer visitid;
	private Integer count;
	private Date visitime;
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getVisitoryid() {
		return visitoryid;
	}
	public void setVisitoryid(Integer visitoryid) {
		this.visitoryid = visitoryid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getVisitid() {
		return visitid;
	}
	public void setVisitid(Integer visitid) {
		this.visitid = visitid;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Date getVisitime() {
		return visitime;
	}
	public void setVisitime(Date visitime) {
		this.visitime = visitime;
	}
	

}
