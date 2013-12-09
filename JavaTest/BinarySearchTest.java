import java.util.*;

public class BinarySearchTest {
	
	public static void main(String[] args) {
		int length = 1000;
		int[] a = getIntArray(length);
		javaArraysSort(a);
		int[] b = getIntArray(length);
		selectEdSort(b);
		int[] c = getIntArray(length);
		bubbleSort(c);
		
		Map<Integer, Integer> map = calculateCount(a);
		System.out.println(map);
	}
	
	public static int[] getIntArray(int length) {
		Random random = new Random();
		int[] array = new int[length];
		while(length > 0) {
			array[--length] = random.nextInt(1000) + 10;//生成[10,50]随机数
		}
		return array;
	}
	
	/*
		冒泡算法
	*/
	public static void bubbleSort(int[] array) {
		boolean sorted = true;
		long startTime = System.currentTimeMillis();
		for(int i=0; i<array.length; i++) {
			sorted = true;
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					sorted = false;
				}
			}
			if(sorted) {
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("冒泡总共花费毫秒数:" + (endTime - startTime));
	}
	
	/*
		选择排序
	*/
	public static void selectEdSort(int[] array) {
		long startTime = System.currentTimeMillis();
		for(int i=0; i<array.length; i++) {
			int min = array[i];
			for(int j=i; j<array.length; j++) {
				if(array[j] < min) {
					min = array[j];
					continue;
				}
			}
			array[i] = min;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("选择排序总共花费毫秒数:" + (endTime - startTime));
	}
	
	public static void javaArraysSort(int[] array) {
		long startTime = System.currentTimeMillis();
		Arrays.sort(array);
		long endTime = System.currentTimeMillis();
		System.out.println("Java自带的API总共花费毫秒数:" + (endTime - startTime));
	}
	
	public static int binarySearch(int[] array, int selectNum) {
		int first = 0;
		int last = array.length - 1;
		int middle = 0;
		
		while(array[first] < array[last]) {
			middle = (first + last)/2;
			if(array[middle] == selectNum) {
				return middle;
			}
			
			if(array[middle] < selectNum) {
				first = middle;
			}
			
			if(array[middle] > selectNum) {
				last = middle;
			}
		}
		
		return -1;
	}
	
	public static Map<Integer, Integer> calculateCountByBinarySearch(int[] array) {
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		for(int i=0; i<array.length; i++) {
			int result = binarySearch(array, array[i]);
			if(result != -1) {
				int c = 0;
				
			}
		}
	}
	
	public static Map<Integer, Integer> calculateCount(int[] array) {
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		for(int i=0; i<array.length; i++) {
			if(count.containsKey(array[i])) {
				int value = count.get(array[i]) + 1;
				count.put(array[i], value + 1);
			} else {
				count.put(array[i], 0);
			}
		}
		//去除出现个数为零的数
		Set<Map.Entry<Integer, Integer>> set = count.entrySet();
		Iterator<Map.Entry<Integer, Integer>> i = set.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, Integer> entry = i.next();
			if(entry.getValue() == 0) {
				i.remove();
			}
		}
		return count;
	}
}