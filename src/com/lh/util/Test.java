package com.lh.util;

import java.util.UUID;

import com.lh.bean.Houst;
import com.lh.bean.Person;

public class Test {
	public static void main(String[] args) {
		UUID uuid=UUID.randomUUID();
		System.out.println(uuid);//�Զ�����
		Houst houst=new Houst(12000);
		houst.addObserver(new Person("����"));
		houst.addObserver(new Person("����"));
		houst.setPrice(16000);
		
	}
}
