package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	Object[] mann = (T[]) new Object[10];
	int size = 0;

	public ArrayList() {
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		return (T) mann[loc];
	}

	public void add(T val) {
		ensureArray();
		mann[size++] = val;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		ensureArray();
		for (int i = size - 1; i >= loc; i--) {
			mann[i + 1] = mann[i];
		}
		mann[loc] = val;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		mann[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		for(int i = loc; i <= size-1; i++) {
			mann[i] = mann[i+1];
		}	
		mann[size] = null;
		size--;
	}
	


	public boolean contains(T val) {
		for(int i = 0; i < size-1; i++) {
			if(mann[i] == val) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {	
		return size;
		
	}

	public void ensureArray() {
		int v = 0;
		if (size == mann.length - 1) {
			Object[] newman = new Object[size + 10];
			for (Object x : mann) {
				newman[v] = x;
				v++;
			}
			mann = newman;
		}
	}
}