package com.sharpkee.model.data;

import java.util.Date;

/**
 * 用户实体
 * @author li-hg
 *
 */
public class UserInfo {
private int Id;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getLoginName() {
	return LoginName;
}
public void setLoginName(String loginName) {
	LoginName = loginName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public Date getRegDate() {
	return RegDate;
}
public void setRegDate(Date regDate) {
	RegDate = regDate;
}
/**
 * 无参构造函数
 */
public UserInfo(){}
/**
 * @param _id
 * @param _Name
 * @param _LoginName
 * @param _Password
 * @param _RegDate
 */
public UserInfo(int _id, String _Name,String _LoginName,String _Password,Date _RegDate){
	this.setId(_id);
	this.setLoginName(_LoginName);
	this.setName(_Name);
	this.setPassword(_Password);
	this.setRegDate(_RegDate);
	
}
private String Name;
private String LoginName;
private String Password;
private Date RegDate;
}
