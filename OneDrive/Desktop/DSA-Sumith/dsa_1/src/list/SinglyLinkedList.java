package list;
import java.util.NoSuchElementException;
public class SinglyLinkedList<T> {
	class Node{
		T data ;
		Node next ;
		Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	private Node head ;
	private Node tail;
	private int size = 0 ;
//	isEmpty
	public boolean isEmpty() {
		return head == null||size == 0 ;
	}
//	size
	public int size() {
		return size ;
	}
//	addFirst
	public void addFirst(T value) {
		Node newNode  = new Node(value);
		if(head == null) {
			tail = head = newNode ;
			size++;
			return ;
		}
		newNode.next = head ;
		head = newNode ;
		size++;
	}
//	toString
	@Override
	public String toString() {
		if(head == null)
			return  "[]";
		Node temp  = head ;
		StringBuilder  sb  = new StringBuilder("[");
		while(temp != null) {
			sb.append(temp.data);
			if(temp.next != null)
				sb.append(", ");
			temp = temp.next;
		}
		return sb+"]";
	}
//	addLast
	public void addLast(T value) {
		Node newNode  = new Node(value);
		if(head==null) {
			head = tail = newNode ;
			return  ;
		}
		tail.next = newNode;
		tail  = newNode ;
		size++;
	}
//	add
	public boolean add(T value) {
		addLast(value);
		return true ;
	}
//	addAt index , value
	public void add(int index , T value) {
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException("invalid index");
		if(index == 0){
			addFirst(value);
			return ;
		}
		if(index == size) {
			addLast(value);
			return ;
		}
		Node newNode = new Node(value);
		Node temp  =  head ;
		for(int i=0;i<index-1;i++) {
			temp  = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode ;
		size++;
	}
//	removeFirst
	public T removeFirst() {
		if(isEmpty())
			throw new NoSuchElementException("list is empty");
		T result = head.data ;
		if(size() == 1) {
			head = tail = null ;
			size--;
			return result ;
		}
		head = head.next ;
		size--;
		return result ;
	}
//	removeLast
	public T removeLast() {
		if(isEmpty())
			throw new NoSuchElementException("list is empty");
		T result   = tail.data;
		if(size== 1) {
			head = tail = null;
			size--;
			return result ;
		}
		Node temp  = head ;
		while(temp.next  != tail) {
			temp = temp.next;
		}
		temp.next = null ;
		size--;
		tail  = temp;
		return result;
	}
//	remove(value)
	public boolean remove(T value) {
		if(isEmpty())
			throw new NoSuchElementException("list is empty");
		if(head.data.equals(value)) {
			 removeFirst();
			 return true;
		}
		if(tail.data.equals(value)) {
			 removeLast();
			 return true ;
	    }
		Node temp  = head ;
		while(temp.next != null) {
			if(temp.next.data.equals(value)) {
				temp.next = temp.next.next;
				size--;
				return true; 
			}
			temp = temp.next;
		}
		return false ;
	}
//	removeAt index
	public T remove(int index) {
		if(index < 0 || index >= size )
			throw new IndexOutOfBoundsException("invalid index");
		if(index == 0)
			return removeFirst();
		if(index == size-1)
			return removeLast();
		Node temp  =  head ;
		for(int i=0;i<index-1;i++)
			temp = temp.next;
		T result  =  temp.next.data;
		temp.next = temp.next.next;
		size--;
		return result ;
	}
//	search(value)
	public boolean search(T value) {
		if(isEmpty())
			throw new RuntimeException("list is empty");
		Node temp  =  head ;
		while(temp != null) {
			if(temp.data.equals(value))
				return true ;
			temp = temp.next;
		}
		return false ;
	}
//	display
	public void display() {
		if(head == null) {
			System.out.println("[]");  
			return ;
		}
		Node temp  = head ;
		StringBuilder  sb  = new StringBuilder("[");
		while(temp != null) {
			sb.append(temp.data);
			if(temp.next != null)
				sb.append(", ");
			temp = temp.next;
		}
		System.out.println(sb+"]");
	}

}




































