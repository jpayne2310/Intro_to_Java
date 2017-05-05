package problem_2;

import java.util.*;
public class Problem_Two {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a line of text. No punctuations please.");
        String input = keyboard.nextLine();
        
        String firstWord = input.substring(0, input.indexOf(" "));
        int firstWordLength = firstWord.length();
        String blankSpace = input.substring(firstWordLength, firstWordLength+1);
        String fLetter = input.substring((firstWordLength+1),(firstWordLength+2)).toUpperCase();
        String finalPart = input.substring(firstWordLength+2);
        System.out.println("I have rephrased that line to read:");
        
        StringBuffer strBuff = new StringBuffer();
        strBuff.append(fLetter);
        strBuff.append(finalPart);
        strBuff.append(blankSpace);
        strBuff.append(firstWord);
        
        System.out.println(strBuff);
        
        //show that the origin user input line is unbroken
        //System.out.println(input);
    }
}
