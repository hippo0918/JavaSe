import java.util.Arrays;

public class LizebinList<E> implements DefinitionList<E> {
	
	private Object[] elementData = null;
	
	private int size = 0;
	
	public LizebinList(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException("Illegal Capacity: " + capacity);
		}
		
		elementData = new Object[capacity];
	} 
	
	public LizebinList() {
		elementData = new Object[10];
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	};
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		rangeCheck(index);
		return (E)elementData[index];
	};
	
	@SuppressWarnings("unchecked")
	public void add(E object) {
		ensureAdd(size + 1);
		elementData[size++] = object;
	};
	
	@SuppressWarnings("unchecked")
	public void add(int index, E object) {
		rangeCheck(index);
		ensureAdd(size + 1);
		System.arraycopy(elementData, index, elementData, index + 1, size - index);
		elementData[index] = object;
		size++;
	};
	
	@SuppressWarnings("unchecked")
	public E remove(int index) {
		rangeCheck(index);
		
		Object removeObject = elementData[index];
		int copyLength = size-index-1;
		if(copyLength > 0) {
			System.arraycopy(elementData, index + 1, elementData, index, copyLength);
		}
		elementData[--size] = null;
		return (E)removeObject;
	};
	
	public int size() {
		return size;
	};
	
	public void clear() {
		for(int i=0; i<elementData.length; i++) {
			elementData[i] = null;
		}
		elementData = null;
		size = 0;
	};
	
	public void set(int index, E object) {
		rangeCheck(index);
		
		elementData[index] = object;
	};
	
	/*
	ȷ���������Ԫ��
	*/
	private void ensureAdd(int newLength) {
		if(newLength < 0) {
			throw new IllegalArgumentException("Illegal Index: " + newLength);
		}
		
		int oldLength = elementData.length;
		if(newLength > oldLength) {
			//JavaԴ�����˼��һ����������newLength����elementData�ĳ��ȣ�
			//�ͻ��elementData����,�������������ĳ������ݣ������Ƕ��������ʵ�ʳ���
			int _newLength = (3 * oldLength)/2 + 1;
			if(_newLength < newLength) {_newLength = newLength;}
			elementData = Arrays.copyOf(elementData, _newLength);
		}
	}
	
	private void rangeCheck(int index) {
		if(index < 0) {
			throw new IllegalArgumentException("Illegal Index: " + index);
		}
		
		if(size < index) {
			throw new IndexOutOfBoundsException("Out of bounds: " + index);
		}
	}
}