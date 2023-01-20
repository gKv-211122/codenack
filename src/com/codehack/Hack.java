package com.codehack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;



public class Hack {
	
	// palindrome method
		public static void palindrome() {
			
			String s = "geeksforgeeks";
			
			// Creating a HashMap containing char
	        // as a key and occurrences as  a value
	        HashMap<Character, Integer> charCountMap
	            = new HashMap<Character, Integer>();
	        
	        ArrayList<Character> r = new ArrayList<Character>();
	 
	        // Converting given string to char array
	        char[] strArray = s.toCharArray();
	 
	        // checking each char of strArray
	        for (char c : strArray) {
	            if (charCountMap.containsKey(c)) {
	 
	                // If char is present in charCountMap,
	                // incrementing it's count by 1
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            }
	            else {
	 
	                // If char is not present in charCountMap,
	                // putting this char to charCountMap with 1 as it's value
	                charCountMap.put(c, 1);
	            }
	        }
	        
	        for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	        
	        // Create a string of characters
	        // with odd occurrences
	        for(char i = 'a'; i <= 'z'; i++) {
	        	
	        		for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
	                    if(charCountMap.containsKey(i) && entry.getValue() % 2 != 0) {
	                    	//System.out.println(entry.getValue());
	                    	r.add(entry.getKey());
	                    	
	                    	
	                    	
	                    }
	        		}	
	        	
	        
	        	
	        	//i++;
	        	 
	        }
	        
	        System.out.println(r);
	        
	        int l = r.size();
	        int j = 0;
	        
	        for(int i = l - 1; i >= l / 2; i--) {
	        	charCountMap.put(r.get(i), i--);
	        	r.add(i, (char) j);
	        	charCountMap.put(r.get(j), j--);
	        	j++;
	        	
	        	
	        }
	        
	        
	        char f = 0, m = 0, se;
	        
			for(char i = 'a'; i <= 'z'; i++) {
				
				for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
					if(charCountMap.containsKey(i)) {
						
						if(entry.getValue() % 2 == 0) {
							
							int k = 0;
							
							while(k < entry.getValue() / 2) {
								
								f += 1;
								k++;
							}
						}
						else {
							int h = 0;
							
							while(h < (entry.getValue() - 1) / 2) {
								
								f += 1;
								h++;
							}
							
							m += i;
						}
					}
				}
				
				
			}
			
			
			

			
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palindrome();

	}

}
