package prob01;

public class Printer {
	private int i;
	private boolean b;
	private double d;
	private String str;

//	public void println(int i) {
//		this.i = i;
//		System.out.println(this.i);
//	}
//	
//	public void println(boolean b) {
//		this.b = b;
//		System.out.println(this.b);
//	}
//	
//	public void println(double d) {
//		this.d = d;
//		System.out.println(this.d);
//	}
//	
//	public void println(String str) {
//		this.str = str;
//		System.out.println(this.str);
//	}
//	
//	public void println(int i, boolean b, double d, String str) {
//		this.i = i;
//		this.b = b;
//		this.d = d;
//		this.str = str;
//	}

	public <T> void println(T t) {
		System.out.println(t);
	}

//	public int sum(int a, int b) {
//		return 0;
//	}
//
//	public int sum(int[] a) {
//		return 0;
//	}

	// 가변 변수
	public int sum(int... nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}

		return sum;
	}
	
	@SuppressWarnings("unchecked")
	public <T> void println(T... ts) {
		for(T t : ts) {
			System.out.println(t);
		}
	}
}
