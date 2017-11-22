package com.lh.test;

import com.lh.message.Message;
import com.lh.message.MessageSend;
import com.lh.message.MessageSpace;

public class Test {
	public static void main(String[] args) {
//		Message mess=new Message("Hello");
//		MessageSend.send(mess);//ʹ�������ô���
		
		//��ʹ�����ô���
		new Thread(()->{
		Message message=new Message();
		message.setMsg("hello");
		MessageSpace.setMassage(message);
		MessageSend.send();
		},"AAA").start();
		new Thread(()->{
			Message message=new Message();
			message.setMsg("hellosss");
			MessageSpace.setMassage(message);
			MessageSend.send();
		},"BBB").start();
	}
}
