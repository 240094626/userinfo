package com.llb.userinfo.model;

import java.util.Comparator;

/**
 * 用户信息比较器
 * @author linlb
 *
 */
public class UserInfoComparator implements Comparator<UserInfo> {
	/**id字段*/
	public static final String NAME_ID = "ID";
	/**登录名字段*/
	public static final String NAME_LOGINNAME = "LOGINNAME";
	/**升序*/
	public static final String TYPE_ASC ="0";
	/**降序*/
	public static final String TYPE_DESC ="1";
	
	private String name;
	
	private String type = "0";

	public UserInfoComparator(String name,String type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public int compare(UserInfo u1, UserInfo u2) {
		if(NAME_ID.equals(name) ){
			// 按ID排序，默认升序
			if(TYPE_ASC.equals(type)){
				return Long.valueOf(u1.getId()).compareTo(u2.getId());
			}else{
				return Long.valueOf(u2.getId()).compareTo(u1.getId());
			}
		}else if(NAME_LOGINNAME.equals(name)){
			// 按登录名排序，默认升序
			if(TYPE_ASC.equals(type)){
				return u1.getLoginname().compareTo(u2.getLoginname());
			}else{
				return u2.getLoginname().compareTo(u1.getLoginname());
			}
		}
		// 默认按ID排序，默认升序
		return Long.valueOf(u1.getId()).compareTo(u2.getId());
	}

}
