package com.lh.bean;

public class Houst  extends java.util.Observable{//±ªπ€≤Ï’ﬂ
	private double price;
	public Houst(double price) {
		this.price=price;
	}
	
	public void setPrice(double price) {
		if(this.price<price) {
			super.setChanged();
			super.notifyObservers(price);
		}
		this.price = price;
	}
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Houst [price=" + price + "]";
	}




	
	
}
