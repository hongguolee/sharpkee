package com.sharpkee.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder; 

import com.sharpkee.model.data.UserInfo;
 

/**
 * 
 * @author li-hg
 *
 */
public class UserDao {
	/**
	 * 获取用户
	 * 
	 * @param id
	 * @return
	 * @throws IOException
	 */
	public List<UserInfo> getUserInfo(int id) throws IOException { 
		InputStream inputStream = UserDao.class.getClassLoader()
				.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
		SqlSession session = sqlSessionFactory.openSession(); 
		List<UserInfo> userInfos = session.selectList("com.sharpkee.mapper.UserInfoMapper.selectUser");
		return userInfos;
	}
}
