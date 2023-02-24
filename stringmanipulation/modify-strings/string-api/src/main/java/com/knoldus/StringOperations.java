package com.knoldus;


public class StringOperations
{
    public String stringReverse(String stringToReverse)
    {
    	char charToReverse[] = stringToReverse.toCharArray();
    	String reversedString = "";
    	for(int index=charToReverse.length-1; index>=0; index--)
    	{
    		reversedString = reversedString+charToReverse[index];
    	}
    	
    	return reversedString;
    }
    
    public int getStringLength(String stringToCalculateLength)
    {
    	int numberOfLettersInString=0;
    	char charToCalculateLength[] = stringToCalculateLength.toCharArray();
    	for(int index=0; index<charToCalculateLength.length; index++)
    	{
    		numberOfLettersInString = numberOfLettersInString+1;
    	}
    	return numberOfLettersInString;
    }
}
