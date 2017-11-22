package com.cn.singleton;

public class Singleton {
	private static final Singleton INFO=new Singleton();//构造方法内部调用
	private Singleton() {}//构造方法私有化
	
	public static Singleton getSingleton() {//返回实例化对象
		return INFO;
	}
	
	public void print() {
		System.out.println("Hello world");
	}
	public void eat() {
		System.out.println("我要吃东西了！！！");
	}
	
}
