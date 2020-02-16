/*Prompt the user at the command line for one 3-character string.
*Then (after the user inputs that first 3-character string) prompt the user for another 3-character string.
*Then print out the two input strings with a space between them.
*Finally print on a separate line the two input strings 'in reverse' (see example below) with a space between them.
*/

/*So, for example, if the first string is 'usr' and the second string is 'bin', your program would output something
like the following:

*"The two strings you entered are: usr bin."
*"The two strings in reverse are: nib rsu."

*Note that the reversed SECOND string comes FIRST when printing the strings in reverse.
*/
package backwardsstrings;

import java.util.Scanner;
public class BackwardsStrings {

    public static void main(String[] args) {
        String stringOne, stringTwo;
        StringBuilder firstReversed = new StringBuilder();
        StringBuilder secondReversed = new StringBuilder();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        stringOne = input.next();
        
        System.out.println("Enter the second string:");
        stringTwo = input.next();
        
        System.out.println("The two strings you entered are:"+ stringOne + " " + stringTwo + ".");
        
        for (int i = stringOne.length()-1; i >= 0; i--)
            firstReversed.append(stringOne.charAt(i));
        
        for (int i = stringTwo.length()-1; i >= 0; i--)
            secondReversed.append(stringTwo.charAt(i));
        
        System.out.println("The two strings in reverse are:" + secondReversed + " " + firstReversed + ".");
    }
    
}
