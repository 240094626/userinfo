package com.llb.userinfo.model;
/**
 * 用户信息类
 * @author linlb
 *
 */
public class UserInfo  {

	private Long id;




	private String loginname;




	private String password; // 加密




	private String name;

	public UserInfo(long id,String loginname,String password,String name){
		this.id = id;
		this.loginname = loginname;
		this.password = password;
		this.name = name;
	}


	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getLoginname() {
		return loginname;
	}




	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	
	
}
