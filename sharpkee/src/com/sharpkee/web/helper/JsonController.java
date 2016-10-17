package com.sharpkee.web.helper; 

import com.sharpkee.model.common.JsonResult;
import com.sharpkee.model.common.JsonResult.ResultStatus;
import com.sharpkee.utils.JsonHelper;

public class JsonController {
	/**����json����
	 * @param  status ״̬
	 * @param  msg ���ص���Ϣ
	 * @param  data ����
	 * @exception ���������׳��쳣 
	 * */
	public String Json(ResultStatus status, String msg, Object data)
			throws Exception {
		return JsonHelper.objectToJson(new JsonResult(status, msg, data));
	}
	
	/**���سɹ�json���� 
	 * @param  msg ���ص���Ϣ
	 * @param  data ����
	 * @exception ���������׳��쳣 
	 * */
	public String  JsonSuccess(Object data,String msg)
			throws Exception{
		return JsonHelper.objectToJson(new JsonResult(ResultStatus.Success, msg, data));
	}
	
	/** @category ����ʧ��json���� 
	 * @param  msg ���ص���Ϣ 
	 * @exception ���������׳��쳣 
	 * */
	public  String JsonFailed(String msg)
			throws Exception{
		return JsonHelper.objectToJson(new JsonResult(ResultStatus.Failed, msg, null));
	}
	
	/**���ؾ���json���� 
	 * @param  msg ���ص���Ϣ 
	 * @param  data ����
	 * @exception ���������׳��쳣 
	 * */
	public   String JsonWarning(Object data,String msg)
			throws Exception{
		return JsonHelper.objectToJson(new JsonResult(ResultStatus.Warning, msg, data));
	}
	
	/** ����json����
	 * @param  msg ���ص���Ϣ 
	 * @param  data ����
	 * @exception ���������׳��쳣 
	 * */
	public String JsonInfo(Object data,String msg)
			throws Exception{
		return JsonHelper.objectToJson(new JsonResult(ResultStatus.Info, msg, data));
	}
}
