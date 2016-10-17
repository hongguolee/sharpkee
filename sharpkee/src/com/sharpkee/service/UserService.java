package com.sharpkee.service;

import java.io.IOException;
import java.util.List;

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
	 * @throws IOException 
	 */
	public List<UserInfo> getUserInfo(int id) throws IOException {
		return new UserDao().getUserInfo(id);
	}
}
