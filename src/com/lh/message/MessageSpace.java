package com.lh.message;

public class MessageSpace {//��Ϣ�洢�ռ�
	private static ThreadLocal<Message> tlocal=new ThreadLocal<>();
//	private static Message msg=null;
	public static void setMassage(Message t) {
		tlocal.set(t);
//		msg=t;
	}
	public static Message getMessage() {
//		return msg;
		return tlocal.get();
	}
	
}
