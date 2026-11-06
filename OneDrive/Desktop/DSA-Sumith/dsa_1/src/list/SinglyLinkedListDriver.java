package list;
import java.util.LinkedList;
public class SinglyLinkedListDriver {
	public static void linkedListTest() {
		LinkedList<Integer> list  = new LinkedList<>();
		list.addFirst(10);
		list.addFirst(20);
		list.addLast(25);
		list.addLast(30);
		System.out.println(list.add(35));
		list.add(2, 45);
//		list.add(12, 45);
		System.out.println(list);
//		System.out.println(list.removeLast());
//		System.out.println(list.removeLast());
//		boolean b  = list.remove(new Integer(25));
//		System.out.println("remove 25 element : "+b);
		System.out.println(list.remove(2));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);
		
	}
	public static void singlyLinkedList() {
		SinglyLinkedList<Integer>  list  = new SinglyLinkedList<>();
		list.addFirst(10);
		list.addFirst(20);
		list.addLast(25);
		list.addLast(30);
		System.out.println(list.add(35));
		list.add(2, 45);
//		list.add(12, 45); // exception
		System.out.println(list);
//		System.out.println(list.removeLast());
//		System.out.println(list.removeLast());
//		boolean b  = list.remove(new Integer(25));
//		System.out.println("remove 25 element : "+b);
		System.out.println(list.remove(2));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.search(205));
		list.display();
//		System.out.println(list.removeLast()); // exception
		
	}
	public static void main(String[] args) {
		System.out.println("linkedlist ");
		linkedListTest();
		System.out.println("===============");
		System.out.println("singly linked list");
		singlyLinkedList();
	}
}































