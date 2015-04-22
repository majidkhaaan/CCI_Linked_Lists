package org.cci_linked_list.majid;

public class MyStack<Item> extends MyLinkedList<Item>{
	//private Node<Item> top;
	
	public MyStack() {
		this.first=null;
	}
	
	public void push(Item d) {
		Node<Item> n = new Node<Item>(d);
		n.next=first;
		first=n;
	}
	
	public Item pop() {
		if(first==null)
			return null;
		else {
			Node<Item> result = first;
			first=result.next;
			return result.data;
		}
	}

}
