package com.cn.util;

import com.cn.singleton.Singleton;

public class TestDemo {
	public static void main(String[] args) {
		Singleton sing=Singleton.getSingleton();//ͨ��static���Ի�ȡ����
		sing.print();
		sing.eat();
	}
}
