import java.util.Scanner;

public class Q3 {

	public static int Power(int a, int b) {
		if (b==0) {
			return 1;
		}else {
			return a*Power(a,b-1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = scan.nextInt();
		System.out.println("Enter the value of b : ");
		int b = scan.nextInt();
		
		System.out.println(a*Power(a,b-1));
		
		scan.close();
	}

}
