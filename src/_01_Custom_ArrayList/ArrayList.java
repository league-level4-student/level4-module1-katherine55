package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	Object[] mann = new Object[10];
	int size = 0;
	
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return (T)mann[loc];
	}
	
	public void add(T val) {
		mann[size++] = val;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}