package com.cn.utils;

import com.cn.interfaces.ISubject;
import com.cn.interfaces.impl.ProxySubject;
import com.cn.interfaces.impl.RealSubject;

public class TestDemo {

	public static void main(String[] args) {
		ISubject sub=new ProxySubject(new RealSubject());
		sub.eat();
	}
}
