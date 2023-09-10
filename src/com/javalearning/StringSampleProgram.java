package com.javalearning;

public class StringSampleProgram {

	public static void main(String[] args) {
		
		String text = "QA Testing department!";
        
        // Length of the string
        int length = text.length();
        System.out.println("Length: " + length);
        
        // Convert to lowercase
        String lowercase = text.toLowerCase();
        System.out.println("Lowercase: " + lowercase);
        
        // Convert to uppercase
        String uppercase = text.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        
        // Equals Ignorecase
        String t1="testing";  
        String t2="testing";  
        String t3="Testing";  
        String t4="development";  
        System.out.println(t1.equalsIgnoreCase(t2));//true because content and case both are same  
        System.out.println(t1.equalsIgnoreCase(t3));//true because case is ignored  
        System.out.println(t1.equalsIgnoreCase(t4));//false because content is not same  
        
        // String is empty
        String s1="";  
        String s2="department";  
          
        System.out.println(s1.isEmpty());  
        System.out.println(s2.isEmpty());  
        
        // Check if the string starts with a prefix
        boolean startsWithQA = text.startsWith("QA");
        System.out.println("Starts with 'QA': " + startsWithQA);
        
        // Check if the string ends with a suffix
        boolean endsWithTesting = text.endsWith("Testing!");
        System.out.println("Ends with 'Testing!': " + endsWithTesting);
        
        // Get a substring from index 7 to the end
        String substring = text.substring(7);
        System.out.println("Substring from index 7: " + substring);
        
        // Get a substring from index 0 to 5 (excluding 5)
        String substringRange = text.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substringRange);
        
        // Replace a substring
        String replaced = text.replace("Team", "department");
        System.out.println("Replaced: " + replaced);
        
        // Trim leading and trailing whitespace
        String spacedText = "   Space given   ";
        String trimmedText = spacedText.trim();
        System.out.println("Trimmed: '" + trimmedText + "'");
        
        // Java string value of method
        int value=77;  
        String n1=String.valueOf(value);  
        System.out.println(n1+66);//concatenating string with 66  
        
        // Split the string into an array using a delimiter
        String mobiles = "iPhone,Oneplus,Realme";
        String[] mobilesArray = mobiles.split(",");
        System.out.println("mobiles array:");
        for (String mobile : mobilesArray) 
        System.out.println(mobile);
     
        // Check if the string contains a substring
        boolean containsTest = text.contains("Testing");
      	System.out.println("Contains 'Testing': " + containsTest);
        

	}

}
