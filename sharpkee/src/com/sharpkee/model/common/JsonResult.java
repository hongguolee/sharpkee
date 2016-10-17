package com.sharpkee.model.common;

import org.springframework.context.annotation.Description; 

@Description("返回的json") 
public class JsonResult {
	   
	@Description("处理状态")
	public enum ResultStatus
	{  
	   Success,
	   Failed,
	   Warning,
	   Info
	} 
	public JsonResult() {
 
	}
	public ResultStatus getStatus() {
		return Status;
	}
	public void setStatus(ResultStatus status) {
		Status = status;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public Object getData() {
		return Data;
	}
	public void setData(Object data) {
		Data = data;
	}
	private ResultStatus Status;
	private String Message;
	private Object Data;
	
	/**json返回结果
	 * @param status 处理状态
	 * @param msg 消息
	 * @param data 返回的数据
	 */
	public JsonResult(ResultStatus status,String msg,Object data)
	{
		this.setStatus(status);
		this.setMessage(msg);
		this.setData(data);
	}
}