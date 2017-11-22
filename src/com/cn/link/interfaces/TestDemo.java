package com.cn.link.interfaces;

public class TestDemo {
	public static void main(String[] args) {
		ILink link=new LinkImpl();
		System.out.println(link.size());
		link.add("����A");
		link.add("����B");
		link.add("����C");
		link.add("����D");
		
		Object obj[]=link.toArray();
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		System.out.println(link.size());
	}
}
