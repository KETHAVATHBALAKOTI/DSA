package list;
import java.util.ArrayList;
public class MyArrayListDriver {
	public static void main(String[] args) {
		System.out.println("Predefined ArrayList");
		ArrayList l =  new ArrayList(5);
		l.addLast(10);
		l.addLast("hello");
		l.addFirst(56);
		l.addFirst(28);
		System.out.println(l.add(60));
		System.out.println("get : "+l.get(4));
		System.out.println("get : "+l.get(4));
		System.out.println(l);
		System.out.println("size : "+l.size());
		System.out.println("isEmpty : "+l.isEmpty());
		
		
		
		System.out.println("==============");
		System.out.println("My array list");
		MyArrayList mylist  = new MyArrayList(5);
		mylist.addLast(10);
		mylist.addLast("hello");
		mylist.addFirst(56);
		mylist.addFirst(28);
		System.out.println(mylist.add(60));
		
		System.out.println("get : "+mylist.get(4));
		mylist.display();
		System.out.println(mylist);
		System.out.println("size : "+mylist.size());
		System.out.println("isEmpty : "+mylist.isEmpty());
		// MyArrayList  list  =  new MyArrayList();
		// list.addLast(10);
		// list.addLast(20);
		// list.addLast(30);
		// list.addLast(40);
		// list.addLast(50);
		// list.addLast(60);
		// list.addLast(70);
		// list.addLast(80);
		// System.out.println(list);
		// list.insertAt(2 , 400);
		// list.reverse();
		// System.out.println(list);
		
	}
}


















