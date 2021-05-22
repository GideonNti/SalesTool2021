
public class Q4 {

	
	public static void reverse(String sentence) {
		if ((sentence ==null) || (sentence.length()<=1)) {
			System.out.println(sentence);
		}else {
			System.out.print(sentence.charAt(sentence.length()-1));
            reverse(sentence.substring(0,sentence.length()-1));
		}
	}
	
	public static void main(String[] args) {
		
		String statement = "Google Drive";
        
        reverse(statement);

	}

}
