package com.cn.link.interfaces;

public class LinkImpl implements ILink {

	private class Node{
		private Node next;
		private Object data;
		
		private Node(Object data) {
			this.data=data;
		}

		public void addNode(Node newNode) {
			// TODO Auto-generated method stub
			if(this.next==null) {
				this.next=newNode;
			}else {
				this.next.addNode(newNode);
			}
		}

		public void toArrayNode() {
			LinkImpl.this.retData[LinkImpl.this.foot++]=this.data;
			if(this.next!=null) {
				this.next.toArrayNode();
			}
			
		}

		public boolean containsNode(Object obj) {
			if(obj.equals(this.data)) {
				return true;
			}else  {
				if(this.next==null) {
					return true;
				}else {
					return this.next.containsNode(obj);
				}
			}
		
		}
		
	}
	
	private Node root;
	private Object retData[];
	private int foot=0;
	private int count=0;
	
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null) {
			return ;
		}
		Node newNode=new Node(obj);
		if(this.root==null) {
			this.root=newNode;
		}else {
			this.root.addNode(newNode);
		}
		this.count++;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.count;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		if(this.root==null) {
			return new Object[0];
		}else {
			this.retData=new Object[this.count];
			this.foot=0;
			this.root.toArrayNode();
			return retData;
		}
	}

	@Override
	public void clean() {
		this.count=0;
		this.root=null;
		
	}

	@Override
	public boolean contains(Object obj) {
		if(obj==null||this.root==null) {
			return false;
		}
		return this.root.containsNode(obj);
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
