package interfaces;

public interface IArray {
	public int getSize();
	public void addFirst(int elem);
	public void addLast(int elem);
	public void removeFirst();
	public void removeLast();
	public void insertAt(int index, int elem);
	public boolean isEmpty();
	public boolean contains(int elem);
	public int getIndexOf(int elem);
	public int getFirst();
	public int getLast();
	public void removeAt(int index);
	public void removeAll(int index);
	public String toString();

}
