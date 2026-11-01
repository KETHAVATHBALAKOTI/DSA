package package_1;

import java.util.LinkedList;

public class StringTest {
	public static void main(String[] args) {
		String s1 = new String("hello");
		System.out.println(s1);
	    String s2 = new String("hello");
	    System.out.println(Integer.toHexString(System.identityHashCode(s1)));
		System.out.println(s1.getClass()+"[@"+System.identityHashCode(s1));
		System.out.println(Integer.toHexString(System.identityHashCode(s2)));
		System.out.println(s2.getClass()+"[@"+System.identityHashCode(s2));
		System.out.println("hi");
		
		LinkedList<Integer> list  = new LinkedList<Integer>();
		list.add(10);
		list.addFirst(1);
		list.addLast(30);
		list.remove();
	}
}
