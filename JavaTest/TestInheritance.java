import java.util.Arrays;
public class TestInheritance {
	static {
		System.out.println("TestInheritance static statement");
	}
	public static void main(String[] args) {
		Parent p = new Children();
		System.out.println(p.parentStaticI);
		
		int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<(a.length+1)/2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}

class Parent {
	public static final int parentStaticI = 1;
	public int parentUnStaticJ = 2;
	
	{
		System.out.println("Parent unstatic statement");
	}
	
	static {
		System.out.println("Parent static statement");
	}
	
	public Parent() {
		System.out.println("Parent's constructor");
	}
}

class Children extends Parent {
	public static final int parentStaticI = 3;
	public static int childStaticI = 1;
	public int childUnStaticJ = 2;
	
	{
		
		System.out.println("child unstatic statement parentStaticI = " + super.parentStaticI);
		System.out.println("child unstatic statement");
	}
	
	static {
		//System.out.println("child unstatic statement parentStaticI = " + super.parentStaticI);
		System.out.println("child static statement");
	}
	
	public Children() {
			
		System.out.println("child's constructor");
	}
	
}