public class InnerClassTest1 {
	public static void main(String[] args) {
		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
	}
}


class OuterClass {
	
	public OuterClass() {
		System.out.println("OuterClass's constructor.");
	}
	public class InnerClass {
		public InnerClass() {
			System.out.println("InnerClass's constructor.");
		}
	}
}