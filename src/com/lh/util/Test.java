package com.lh.util;

import java.util.UUID;

import com.lh.bean.Houst;
import com.lh.bean.Person;

public class Test {
	public static void main(String[] args) {
		UUID uuid=UUID.randomUUID();
		System.out.println(uuid);//自动更名
		Houst houst=new Houst(12000);
		houst.addObserver(new Person("张三"));
		houst.addObserver(new Person("李四"));
		houst.setPrice(16000);
		
	}
}
