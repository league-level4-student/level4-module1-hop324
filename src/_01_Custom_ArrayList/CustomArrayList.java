package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class CustomArrayList <T>{
	T[] list;
	public CustomArrayList() {
		list = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if(loc<0 || loc>list.length) {
			throw new IndexOutOfBoundsException();
		}
		return list[loc];
	}
	
	public void add(T val) {
		T[] holder = list = (T[]) new Object[list.length+1];
		for(int i = 0; i < list.length; i++) {
			holder[i] = list[i];
		}
		holder[holder.length-1]=val;
		list=holder;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] holder = (T[]) new Object[list.length+1];
		for(int i=0; i < loc; i++) {
			holder[i]=list[i];
		}
		for(int i=loc; i < list.length; i++) {
			holder[i+1]=list[i];
		}
		holder[loc]=val;
		list=holder;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] holder = (T[]) new Object[list.length];
		for(int i=0; i < loc; i++) {
			holder[i] = list[i];
		}
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		//list.remove(loc);
	}
	
	public boolean contains(T val) {
		//if(list.contains(val)) {
		//	return true;
	//	}
	//	else {
	//		return false;
		}
	//}
}