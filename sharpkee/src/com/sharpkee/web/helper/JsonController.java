package com.sharpkee.web.helper; 

import com.sharpkee.model.common.JsonResult;
import com.sharpkee.model.common.JsonResult.ResultStatus;
import com.sharpkee.utils.JsonHelper;

public class JsonController {
	/**返回json数据
	 * @param  status 状态
	 * @param  msg 返回的消息
	 * @param  data 数据
	 * @exception 处理错误会抛出异常 
	 * */
	public String Json(ResultStatus status, String msg, Object data)
			throws Exception {
		return JsonHelper.objectToJson(new JsonResult(status, msg, data));
	}
	
	/**返回成功json数据 
	 * @param  msg 返回的消息
	 * @param  data 数据
	 * @exception 处理错误会抛出异常 
	 * */
	public String  JsonSuccess(Object data,String msg)
			throws Exception{
		return JsonHelper.objectToJson(new JsonResult(ResultStatus.Success, msg, data));
	}
	
	/** @category 返回失败json数据 
	 * @param  msg 返回的消息 
	 * @exception 处理错误会抛出异常 
	 * */
	public  String JsonFailed(String msg)
			throws Exception{
		return JsonHelper.objectToJson(new JsonResult(ResultStatus.Failed, msg, null));
	}
	
	/**返回警告json数据 
	 * @param  msg 返回的消息 
	 * @param  data 数据
	 * @exception 处理错误会抛出异常 
	 * */
	public   String JsonWarning(Object data,String msg)
			throws Exception{
		return JsonHelper.objectToJson(new JsonResult(ResultStatus.Warning, msg, data));
	}
	
	/** 返回json数据
	 * @param  msg 返回的消息 
	 * @param  data 数据
	 * @exception 处理错误会抛出异常 
	 * */
	public String JsonInfo(Object data,String msg)
			throws Exception{
		return JsonHelper.objectToJson(new JsonResult(ResultStatus.Info, msg, data));
	}
}
