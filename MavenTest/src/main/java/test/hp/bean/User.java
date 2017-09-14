package test.hp.bean;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User {
     private Integer userid;
     @NotEmpty
	 private String qq;
     private String username;
     @NotEmpty
     private String password;
     private String headpic;
     private Integer sex;
     private Date birthday;
     private String nowaddress;
     private String hometown;
     private Integer ismarry;
     private Integer state;
     private Date lastvisit;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHeadpic() {
		return headpic;
	}
	public void setHeadpic(String headpic) {
		this.headpic = headpic;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getNowaddress() {
		return nowaddress;
	}
	public void setNowaddress(String nowaddress) {
		this.nowaddress = nowaddress;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public Integer getIsmarry() {
		return ismarry;
	}
	public void setIsmarry(Integer ismarry) {
		this.ismarry = ismarry;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Date getLastvisit() {
		return lastvisit;
	}
	public void setLastvisit(Date lastvisit) {
		this.lastvisit = lastvisit;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", qq=" + qq + ", username=" + username + ", password=" + password
				+ ", headpic=" + headpic + ", sex=" + sex + ", birthday=" + birthday + ", nowaddress=" + nowaddress
				+ ", hometown=" + hometown + ", ismarry=" + ismarry + ", state=" + state + ", lastvisit=" + lastvisit
				+ "]";
	}
	
     
}
