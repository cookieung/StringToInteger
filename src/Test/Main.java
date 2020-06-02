package Test;

import java.util.*;

class Main {
    public static void main(String args[]) {
    	
        Scanner scan = new Scanner(System.in); 
        String input = scan.nextLine(); 
        while(!input.equals("end")) {
        	String result = "";
            for(int i = 0; i < input.length(); i++) {
            	char current = input.charAt(i);
            	if(Character.isDigit(current)) {
            		result += current;
            	}
            }
            if(result.length() == 0) result = "Have no integer";
    		System.out.println(result);
        	input = scan.nextLine(); 
        }
        System.out.println("Thank you!");
    }
}