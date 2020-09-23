package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	public T t;
	ArrayList<T> list = new ArrayList<T>();
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return list.get(loc);
	}
	
	public void add(T val) {
		list.add(val);
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		list.insert(loc, val);
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list.get(loc).equals(val);
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		list.remove(loc);
	}
	
	public boolean contains(T val) {
		if(list.contains(val)) {
			return true;
		}
		else {
			return false;
		}
	}
}