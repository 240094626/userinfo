package com.llb.userinfo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.llb.userinfo.model.UserInfo;
import com.llb.userinfo.model.UserInfoComparator;
/**
 * web控制器
 * @author linlb
 *
 */
@Controller
public class IndexController {
	/**
	 * 用户信息初始化
	 */
	private List<UserInfo> users = new ArrayList<UserInfo>(){{
		add(new UserInfo(1,"andy","","Andy"));
		add(new UserInfo(2,"carl","","Carl"));
		add(new UserInfo(3,"bruce","","Bruce"));
		add(new UserInfo(4,"dolly","","Dolly"));
	}};
	
	/**
	 * 首页
	 * @return
	 */
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	/**
	 * 查询请求处理
	 * @param searchname
	 * @param order
	 * @return
	 */
	@RequestMapping("/search")
	@ResponseBody
	List search(String searchname,String order){
		List<UserInfo> results = null;
		if(StringUtils.isEmpty(searchname)){
			return  results;
		}
		if(StringUtils.isEmpty(order)){
			order = "id:0";
		}
		UserInfoComparator comparator 
			= new UserInfoComparator(order.split(":")[0], order.split(":")[1]);
		results= users.stream()
			.filter(p->(p.getLoginname().contains(searchname) 
					|| String.valueOf(p.getId()).equals(searchname) ))
			.sorted(comparator)
			.collect(Collectors.toList());
		return results;
	}
}
