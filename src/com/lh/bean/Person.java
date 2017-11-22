package com.lh.bean;

import java.util.Observable;
import java.util.Observer;

public class Person  implements Observer{
	private String name;
	public Person(String name) {
		this.name=name;

	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("�۲��ߣ�"+this.name+"�����Ǽ��ˣ��Ͻ���"+arg);
		
	}
	
	
}
