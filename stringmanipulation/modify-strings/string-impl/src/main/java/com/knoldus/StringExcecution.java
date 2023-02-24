package com.knoldus;
import java.util.Scanner;
public class StringExcecution 
{
    public static void main( String[] args )
    {	
    	/*creating object of string operations class*/
    	StringOperations performOperations = new StringOperations();
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter a string you want to perform operations on: ");
        String stringToOperate = takeInput.nextLine();
        String reversedSrting = performOperations.stringReverse(stringToOperate);
        int lengthOfString = performOperations.getStringLength(stringToOperate);
        System.out.println("The reversed string is: "+reversedSrting);
        System.out.println("The length of string is: "+lengthOfString);
    }
}
