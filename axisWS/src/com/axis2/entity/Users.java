package com.axis2.entity;
/**
 * Users信息实体类
 * @author Administrator
 *
 */
public class Users {

	private int id;//
	private String uid;//用户id
	private String uname;//用户姓名
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Users() {
	}
	public Users(int id, String uid, String uname) {
		this.id = id;
		this.uid = uid;
		this.uname = uname;
	}
	public String toString() {
		return "Users [id=" + id + ", uid=" + uid + ", uname=" + uname + "]";
	}
	
	
}
