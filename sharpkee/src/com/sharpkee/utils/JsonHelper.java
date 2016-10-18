package com.sharpkee.utils;

import java.text.SimpleDateFormat;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * json帮助类
 * @author li-hg
 *
 */
public class JsonHelper {

	private static ObjectMapper objectMapper = new ObjectMapper();
	
	/**
	 * 设置日期格式
	 */
	static
	{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		objectMapper.setDateFormat(fmt); 
	}

	/**
	 * 把object转换为json字符串
	 * 
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public static String objectToJson(Object obj) throws Exception {
		return objectMapper.writeValueAsString(obj); 
	}

	/**
	 * json 反序列化
	 * 
	 * @param json
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	public static <T> T jsonToObject(String json, Class<T> cls)
			throws Exception {
		T resultT = objectMapper.readValue(json, cls);
		return resultT;
	}
}
