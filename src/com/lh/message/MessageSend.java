package com.lh.message;

public class MessageSend {
//	public static void send(Message msg) {
//		
//		System.out.println("��Ϣ���ͣ�"+msg.getMsg());
//	}
	
	public static void send() {
		Message msg=MessageSpace.getMessage();
		System.out.println(Thread.currentThread().getName()+"��Ϣ���ͣ�"+msg.getMsg());
		
	}
}
