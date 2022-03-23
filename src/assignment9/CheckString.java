package assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckString
{

    public static boolean startWithCapitalEndWithPeriod(String input)
    {
        if(Pattern.matches("^[A-Z].*[.]$",input))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println("Result: "+startWithCapitalEndWithPeriod(input));
    }
}
