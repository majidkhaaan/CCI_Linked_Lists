package org.cci_linked_list.majid;

public class Node<Item> {
	public Item data;
	public Node<Item> next;

	public Node(Item d) {
		data = d;
		next = null;
	}
	public void Display() {
		System.out.print(" "+data);
	}
//	public boolean appendToTail(int d) {
//		if (this.next != null)
//			return false;
//		else {
//			Node n = new Node(d);
//			this.next = n;
//			return true;
//		}
//	}
}
