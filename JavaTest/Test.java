import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		// DefinitionList<String> list = new LizebinList<String>();
		// list.add("li");
		// list.add("ze");
		// list.add("bin");
		// list.set(0, "LinXiangJun");
		// list.add(3, "lin");
		// list.set(0, "xiangjun");
		// System.out.println(list.size());
		// printList(list);
		// list.clear();
		DefinitionList<String> list = new LizebinLinkedList<String>();
		list.add("li");
		list.add("ze");
		list.add("bin");
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		String s1 = list.remove(0);
		String s = list.remove(1);
		System.out.println("remove = " + s);
		System.out.println("remove1 = " + s1);
		System.out.println("size = " + list.size());
		//list.clear(); 
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public static void printList(DefinitionList list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}