package p0831;

public class JA0831_14 {

	public static void main(String[] args) {
		int a =100000;
		int b =200000;
		long c = a*b;
		System.out.println(c);
         
		int x = 1000000;
		int y = 2000000;
		long z =(long)x*y;
		System.out.println(z);
		
		long num =a*x/y;
		System.out.println(num);
		
		long num2= (long)a/x*y;
		System.out.println(num2);
		
		int i = 1;
		int j = 1;
		i = i+j;
		i += j;
	
	}

}
