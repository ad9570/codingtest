package cr;

public class MonitorCount {
	public static synchronized void foo1() {};
	public synchronized void foo2() {}
	public void foo3() {
		synchronized (this) {
		}
	}
	public void foo4(){
		synchronized (getClass()) {
		}
	}
	public void foo5(){
		synchronized (new Object()) {
		}
	}
	public void foo6(){
		synchronized (new Object()) {
		}
	}
	
	public static void main(String[] args) {
		MonitorCount mc = new MonitorCount();
	}
}
