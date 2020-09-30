package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class CustomArrayList <T>{
	CustomArrayList<T> list = new CustomArrayList<>();
	public CustomArrayList() {
		CustomArrayList<T> list = new CustomArrayList<>();
		this.list = list;
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
		list.set(loc, val);
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