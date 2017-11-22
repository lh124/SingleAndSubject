package com.cn.util;

import com.cn.singleton.Singleton;

public class TestDemo {
	public static void main(String[] args) {
		Singleton sing=Singleton.getSingleton();//通过static属性获取对象
		sing.print();
		sing.eat();
	}
}
