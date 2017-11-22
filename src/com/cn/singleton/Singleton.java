package com.cn.singleton;

public class Singleton {
	private static final Singleton INFO=new Singleton();//���췽���ڲ�����
	private Singleton() {}//���췽��˽�л�
	
	public static Singleton getSingleton() {//����ʵ��������
		return INFO;
	}
	
	public void print() {
		System.out.println("Hello world");
	}
	public void eat() {
		System.out.println("��Ҫ�Զ����ˣ�����");
	}
	
}
