package com.sharpkee.model.common;

import org.springframework.context.annotation.Description; 

@Description("���ص�json") 
public class JsonResult {
	   
	@Description("����״̬")
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
	
	/**json���ؽ��
	 * @param status ����״̬
	 * @param msg ��Ϣ
	 * @param data ���ص�����
	 */
	public JsonResult(ResultStatus status,String msg,Object data)
	{
		this.setStatus(status);
		this.setMessage(msg);
		this.setData(data);
	}
}