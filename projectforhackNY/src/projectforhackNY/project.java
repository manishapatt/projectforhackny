package projectforhackNY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
import java.io.File;

public class project {
	


		
		// Reading the dictionary.txt file 
		
		public static void main(String[] args) throws Exception
		
		{
			
			
			//there are different methods to use for reading a file
			//use scanner because of familiarity from assignment 3 Q311
			
			BST dictionary = new BST(); 
			
			File file = new File("/Users/Manisha/Desktop/352 Project Files/dictionary.txt");
			//"C:\\Users\\Manisha\\Desktop//352 Project Files\\dictionary.txt"
			Scanner scan = new Scanner(file);
			
			//int val = 0; 

			ArrayList<String> dictionaryarray = new ArrayList<String>();
			
			
			//shuffle to sort 
			
			//address why u use certain concepts for coding and not others like the BST structure
			
			while (scan.hasNext()) {
				//print each of the contents of the dictionary file
				//printing is not necessary but keep to see if result is good
				//scan.useDelimiter(" "); 
				
				
				///since the dictionary is in order, it is not necessary to complicate the BST and it
				//is possible to just put in one word at a time like a list 
				
				
				
				String key = scan.next(); 
				
				dictionaryarray.add(key);
				
				//this is to just make sure 
				System.out.println(key); 
			}
			
			Collections.shuffle(dictionaryarray); 
			
			
			for (String word: dictionaryarray) {
				dictionary.put(word);
			}
			
			
			
			scan.close();
		
		}
		
	}


