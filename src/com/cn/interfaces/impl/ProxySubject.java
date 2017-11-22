package com.cn.interfaces.impl;

import com.cn.interfaces.ISubject;

public class ProxySubject implements ISubject {
	private ISubject subject;
	public ProxySubject(ISubject subject) {
		this.subject=subject;
	}
	public void prepare() {
		System.out.println("准备食材");
	}
	@Override
	public void eat() {
		this.prepare();
		this.subject.eat();
		this.clean();

	}
	public void clean() {
		System.out.println("打扫卫生");
	}

}
