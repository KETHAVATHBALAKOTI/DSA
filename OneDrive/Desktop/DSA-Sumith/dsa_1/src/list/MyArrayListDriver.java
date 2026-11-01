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
		
		
	}
}


















