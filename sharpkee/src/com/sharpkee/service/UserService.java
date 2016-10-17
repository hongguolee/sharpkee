package com.sharpkee.service;

import com.sharpkee.dao.UserDao;
import com.sharpkee.model.data.UserInfo;

/**
 * 
 * @author li-hg
 *
 */
public class UserService {
	/**
	 * 
	 * @param id
	 * @return
	 */
	public UserInfo getUserInfo(int id) {
		return new UserDao().getUserInfo(id);
	}
}
