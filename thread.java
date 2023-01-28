
class threadRun1 implements Runnable {
	public void run() {
		System.out.println("its first run");
		System.out.println("its first run");
		System.out.println("its first run");
		System.out.println("its first run");
		System.out.println("its first run");
	}
}

class threadRun2 implements Runnable {
	public void run() {
		System.out.println("its second run");

	}
}

public class thread {
	public static void main(String[] args) {
		threadRun1 sc = new threadRun1();
		Thread run1 = new Thread(sc);
		threadRun2 pc = new threadRun2();
		Thread run2 = new Thread(pc);

		run1.start();
		run2.start();// thread compile higher priority to lower priority
	}
}