
public class Q1 {

	public static void multplicationTable(int n, int m) {
		if (m>12) {
			return ;
		}
		
		System.out.println(n+" * "+m+" = "+n*m);
		
		
		multplicationTable(n,m+1);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int n =15;
		
		multplicationTable(n,1);
		

	}

}
