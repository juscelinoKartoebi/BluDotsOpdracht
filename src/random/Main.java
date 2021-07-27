package random;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main (String[] args) {
		
		//opdracht2
		randomPick( 5, 10);
		randomPick( 4, 20);
		
		
		//Opdracht1
		repeatNow('a', 10);
		System.out.println("");
		repeatNow('o', 7);
	}
	     
        //Opdracht1
	
        public static void randomPick(int grootte, int max) { 
        	
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        	
        for (int i = 0; i < grootte; i++) 
        {
       
            Random random = new Random();
            
            int x = random.nextInt(max);
            
            randomNumbers.add(x);
            
        }
        
        System.out.println(randomNumbers.toString());     
}
        
        //Opdracht1
        
    	public static void repeatNow(char repeat, int count) {
    	
    	 for (int i = 0; i <= count; i++) {
    		 
    			System.out.print(repeat);

    		}
    	}
}
