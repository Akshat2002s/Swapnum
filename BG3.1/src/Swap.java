public class Swap {
	static void swap(int a, int b) {
		int x=0;
		int y=0;
	    x=b;
	    y=a;
		System.out.println("Values after swap");
		System.out.println("a="+x + " b="+y);
		}
	public static void main(String[] args) {
		int a=23;
		int b=45;
		swap(a,b);
	}

}
