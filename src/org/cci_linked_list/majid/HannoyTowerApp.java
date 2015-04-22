package org.cci_linked_list.majid;

public class HannoyTowerApp {
	
	private static MyStack<Integer> A = new MyStack<Integer>();
	private static MyStack<Integer> B = new MyStack<Integer>();
	private static MyStack<Integer> C = new MyStack<Integer>();
	
	public static void displayTowers() {
		System.out.print("A:");
		A.display();
		System.out.print("B:");
		B.display();
		System.out.print("C:");
		C.display();
		System.out.println("-----");
	}
	public static void  HannoyMove(MyStack<Integer> source, MyStack<Integer> buffer, MyStack<Integer> destination, int num) {

		if(source.isEmpty())
			return;
		if(num==0)
			return;
		HannoyMove(source,destination,buffer,num-1);
		Integer t=source.pop();
		destination.push(t);
		displayTowers();
		HannoyMove(buffer,source,destination,num-1);
	}
	public static void main(String[] args) {
		A.push(4);A.push(3);A.push(2);A.push(1);
		displayTowers();
		HannoyMove(A,B,C,4);
		displayTowers();
	}

}
