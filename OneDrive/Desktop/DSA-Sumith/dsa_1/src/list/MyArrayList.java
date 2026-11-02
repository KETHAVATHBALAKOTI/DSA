package list;

public class MyArrayList {
	private int arraySize  ;  
	private Object [] array ;
	public MyArrayList() {
		arraySize =  10 ;
		array  =  new Object [arraySize];
	}
	public MyArrayList(int initialCapacity){
		this.arraySize = initialCapacity ;
	    array  =  new Object [arraySize];
	}
	private int size = 0 ;
//	 size
	public int size() {
		return size ;
	}
//	isEmpty
	public boolean isEmpty() {
		return size == 0;
	}
//	grow
	private Object [] grow() {
		int len  = array.length+(array.length)/2 ;
		System.out.println(len);
		Object [] temp  = new Object[len];
		for(int i=0;i<=size;i++)
			temp[i] = array[i];
		return temp ;
	}
//	addLast
	public void addLast(Object  element) {
		if(size ==  array.length) {
			array  = grow();
		}
		array[size++]= element;
	}
//  display
	public void display() {
		System.out.print("[");
		for(int i=0;i<size;i++) {
			System.out.print(array[i]);
			if(i <size-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
//	toString 
	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder("[");
		for(int i=0;i<size;i++) {
			sb.append(array[i]);
			if(i <size-1)
				sb.append(", ");
		}
		return sb+"]";
	}
//	addFirst
	public void addFirst(Object element) {
		if(size == array.length)
			array  = grow();
		for(int p=size;p>0;p--) 
			array[p] = array[p-1];
		size++;
		array[0] = element ;
	}
//	add
	public boolean  add(Object element) {
		addLast(element);
		return true ;
	}
//	get
	public Object get(int index) {
		if(index < 0 || index >= size )
			throw new IndexOutOfBoundsException("invalid index");
		return  array[index];
	}
//	remove at index
	public void remove(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("invalid index");
		for(int i=index;i<size-1;i++) {
			array[i] = array[i+1];
		}
		array[--size] = 0 ;
	}
//	remove element 
	public boolean remove(Object val) {
		for(int i=0;i<size;i++) {
			if(array[i].equals(val)) {
				remove(i);
				return true ;
			}
		}
		return false;
	}
//	remove start , end
	public void remove(int start, int end) {
		if(start > end ||start < 0 || start >= size || end < 1 || end >= size) 
			throw new IndexOutOfBoundsException("invalid index's");
		int store  = 0 ; 
		for(int i=start;end < size-1 ;i++) {
			array[i] = array[end+1] ;
			end++;
			store = i ;
		}
		size =  store+1;
	}
//	insertAt index , object
	public void insertAt(int index , Object element) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("invalid index");
		if(size == array.length)
			array = grow();
		for(int i=size;i>=index+1;i--) {
			array[i] = array[i-1];
		}
		array[index] = element ;
		size++;
	}
//	reverse
	public void reverse() {
	    if(isEmpty() ||  size == 1)
	    	return ;
	    int i = 0 ,j=size-1;
	    while(i < j) {
	    	Object temp  = array[i] ;
	    	array[i] = array[j] ;
	    	array[j] = temp ;
	    	i++;
	    	j--;
	    }
	}
	
}

















