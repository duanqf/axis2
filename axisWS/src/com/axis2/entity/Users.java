package com.axis2.entity;
/**
 * Users��Ϣʵ����
 * @author Administrator
 *
 */
public class Users {

	private int id;//
	private String uid;//�û�id
	private String uname;//�û�����
	
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
