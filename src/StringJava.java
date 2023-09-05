public class StringJava {
public static void main(String[] args) {
	
	 // Using StringBuffer
	
	
    StringBuffer stringBuffer = new StringBuffer("Hello");
    stringBuffer.append(", world!");
    stringBuffer.insert(5, " there");
    stringBuffer.replace(0, 5, "Hi");
    stringBuffer.delete(2, 5);
    String stringBufferResult = stringBuffer.toString();

    // Using StringBuilder
    
    
    StringBuilder stringBuilder = new StringBuilder("Hello");
    stringBuilder.append(", world!");
    stringBuilder.insert(5, " there");
    stringBuilder.replace(0, 5, "Hi");
    stringBuilder.delete(2, 5);
    String stringBuilderResult = stringBuilder.toString();

    // Print results
    
    
    System.out.println("Using StringBuffer: " + stringBufferResult);
    System.out.println("Using StringBuilder: " + stringBuilderResult);

}
}
