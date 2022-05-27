import java.util.Scanner;
public class WordCount {

	public static void main(String[] args) {
		
		wordCount();
	}
		public static void wordCount() {
			
			Scanner scnr = new Scanner(System.in);
			System.out.println("Enter a sentence and I will tell you the word count.");
			String userWord;
			
			userWord = scnr.nextLine();
			int  count = 1;
			for (int i = 0; i<userWord.length(); i++) {
				if ((userWord.charAt(i) == ' ' ) && ( userWord.charAt(i+1) != ' ')){			
			
				count ++;	
		
				}
				
			}
			System.out.println("Number of words in your sentence is " +count);
		
			
			
		
			
			
			
			
			
			
			//Practice writing over and over and over again until it becomes a habit//
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
