import java.util.Scanner;

public class Q2 {

	
	public static int fb(int n) {
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}else {
			return fb(n-1)+fb(n-2);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n =scan.nextInt();
		System.out.println(fb(n));
		
		scan.close();
	}

}
