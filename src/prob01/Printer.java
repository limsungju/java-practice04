package prob01;

public class Printer{
	private int i;
	private boolean b;
	private double d;
	private String str;
	
	public void println(int i) {
		this.i = i;
		System.out.println(this.i);
	}
	
	public void println(boolean b) {
		this.b = b;
		System.out.println(this.b);
	}
	
	public void println(double d) {
		this.d = d;
		System.out.println(this.d);
	}
	
	public void println(String str) {
		this.str = str;
		System.out.println(this.str);
	}
	
	public void println(int i, boolean b, double d, String str) {
		this.i = i;
		this.b = b;
		this.d = d;
		this.str = str;
	}
	

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
