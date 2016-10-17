package com.sharpkee.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sharpkee.model.data.UserInfo;
import com.sharpkee.service.UserService;
import com.sharpkee.web.helper.JsonController;
import java.util.List; 

@Controller
@RequestMapping("Account")
public class AccountController  extends JsonController{
	@RequestMapping("/Index")
	public String index() {
		throw new RuntimeException("���������˺����ұ�����");
		//return "Account/index";
	}
	
	@RequestMapping(value="/AddUser",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String addUser() throws Exception
	{
		return JsonSuccess("�ҷ�����", ""); 
	}
	@RequestMapping(value="/GetUser",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getUserInfo() throws Exception
	{
		System.out.println("����");
		List<UserInfo> userInfo = new UserService().getUserInfo(1); 
		return JsonSuccess(userInfo,null) ;
	}
}
