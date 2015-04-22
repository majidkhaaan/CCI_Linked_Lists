package org.cci_linked_list.majid;

public class MyLinkedListApp {

	public static void main(String[] args) {		// TODO Auto-generated method stub
		MyLinkedList<Integer> intList = new MyLinkedList<Integer>();			
		intList.insertFirst(55);
		intList.insertFirst(66);
		intList.insertLast(77);		
		intList.insertLast(88);
		intList.display();	
		intList.nToTheLast(44).Display();
	}

}
