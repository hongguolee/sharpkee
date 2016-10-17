package com.sharpkee.utils;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * json������
 * @author li-hg
 *
 */
public class JsonHelper {

	private static ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * ��objectת��Ϊjson�ַ���
	 * 
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public static String objectToJson(Object obj) throws Exception {
		return objectMapper.writeValueAsString(obj);
	}

	/**
	 * json �����л�
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