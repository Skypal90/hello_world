package Arrays;

public class AnnonymousArray {
	public static void main(String[] args) {
		sum(new int [] {10,20,30,40});
		
	}
	public static void sum(int[] x) {
		int total=0;
		for(int x1:x) {
			total=total+x1;
			}
		System.out.println("The sum is: "+total);
	

	//public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60};
		int [] b= {70,80};
		//a=b;
		b=a;
		for(int x2:a ) {
			System.out.println(x2);
		};
		for(int x3:b) {
			System.out.println(x3);
		
	}
			
	}
}
