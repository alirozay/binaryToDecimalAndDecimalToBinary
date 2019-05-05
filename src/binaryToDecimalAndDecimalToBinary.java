import java.util.Scanner;

public class binaryToDecimalAndDecimalToBinary {
 public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 String command;
	 do {
		System.out.println("Type binary to convert it to binary or decimal to convert it to decimal or quit to quit");
		command = key.nextLine();
		String num;
		if(command.equalsIgnoreCase("binary")) {
			System.out.println("Enter the decimal number:");
			num = key.nextLine();
			System.out.println(binaryConversion(num));
			
		} else if( command.equalsIgnoreCase("decimal")) {
			System.out.println("Enter the binary number:");
			num = key.nextLine();
			System.out.println(decimalConversion(num));
		}
	 }while(!command.equals("quit"));
 }
 
 public static String binaryConversion(String number) {
	 int result = 0;
	 for(int i=1;i<=number.length();i++) {
		 result+= Character.getNumericValue(number.charAt(i-1)) * (int)Math.pow(2, number.length()-i);
	 }
	 return Integer.toString(result);
 }
 
 public static String decimalConversion(String number) {
	 int d = Integer.parseInt(number);
	 String dummyResult = "";
	 while(d!=0) {
		 if(d%2==0) dummyResult+="0";
		 else  dummyResult+="1";
		 d/=2;
	 }
	 String result = "";
	 for(int i= dummyResult.length()-1;i>=0;i--) {
		 result+= dummyResult.charAt(i);
	 }
	 return result;
 }
}
