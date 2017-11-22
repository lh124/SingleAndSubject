package com.lh.message;

public class MessageSend {
//	public static void send(Message msg) {
//		
//		System.out.println("消息发送："+msg.getMsg());
//	}
	
	public static void send() {
		Message msg=MessageSpace.getMessage();
		System.out.println(Thread.currentThread().getName()+"消息发送："+msg.getMsg());
		
	}
}
