package org.cci_linked_list.majid;

public class MyLinkedList<Item> {
	protected Node<Item> first;

	public MyLinkedList() {
		this.first = null;
	}
	public boolean isEmpty() {
		if(this.first==null)
			return true;
		else
			return false;
	}

	public void insertFirst(Item d) {
		Node<Item> n = new Node<Item>(d);
		n.next = this.first;
		this.first = n;
	}

	public void insertLast(Item d) {
		Node<Item> currentNode = first;
		if (first == null)
			this.insertFirst(d);
		else {
			while (currentNode.next != null)
				currentNode = currentNode.next;
			Node<Item> n = new Node<Item>(d);
			currentNode.next = n;
		}
	}
	public Node<Item> nToTheLast(int n) {
		int counter=0;
		Node<Item> currentNode = first;
		Node<Item> result = first;
		while (currentNode != null) {
			currentNode = currentNode.next;
			counter++;
			if(counter>n+1)
				result=result.next;
		}
		return result;
	}

	public void display() {
		Node<Item> currentNode = first;
		while (currentNode != null) {
			currentNode.Display();
			currentNode = currentNode.next;
		}
		System.out.println();
	}
}
