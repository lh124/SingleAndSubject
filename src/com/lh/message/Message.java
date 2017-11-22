package com.lh.message;

public class Message {
	private String msg;
//	public Message(String msg) {
//		this.msg=msg;
//	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	@Override
	public String toString() {
		return "Message [msg=" + msg + "]";
	}
	
	
}
