package com.sharpkee.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Account")
public class AccountController {
	@RequestMapping("/Index")
	public String index() {
		throw new RuntimeException("���������˺����ұ�����");
		//return "Account/index";
	}
}
