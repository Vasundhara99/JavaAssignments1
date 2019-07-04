package vasundhara.assignment2;

import java.util.Scanner;

public class CheckAString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.next();
        boolean answer =AllAlphabetsArePresent(inputString);
        if(answer==true)
            System.out.println("All a-z and A-Z alphabets are present in the string");
        else
            System.out.println("All a-z and A-Z alphabets are not present in the string");
    }
    static boolean AllAlphabetsArePresent(String str)
    {
        int count=0;
        for(char a='a';a<='z';a++)
        {
            if(str.indexOf(a)>=0 && str.indexOf(a-32)>=0)
            {
                count++;
            }
            else
                break;
        }
        if(count==26)
            return true;
        return false;
    }
}
