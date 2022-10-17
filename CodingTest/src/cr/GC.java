package cr;

public class GC {
	private Object o;
	private void doSomethingElse(Object obj) { o = obj; }
	public void doSomething() {
		Object o = new Object();
		System.out.println(o);
		System.out.println(this.o);
		System.out.println();
		
		doSomethingElse(o);
		System.out.println(o);
		System.out.println(this.o);
		System.out.println();
		
		o = new Object();
		System.out.println(o);
		System.out.println(this.o);
		System.out.println();
		
		doSomethingElse(null);
		System.out.println(o);
		System.out.println(this.o);
		System.out.println();
		
		o = null;
		System.out.println(o);
		System.out.println(this.o);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
	}
}
