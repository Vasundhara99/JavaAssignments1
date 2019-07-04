package vasundhara.assignment1;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchFiles {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String pattern = scan.next();
        searchFiles(pattern);
    }
   static void searchFiles(String pattern)
    {
        File f=new File("/home/user");
        FilenameFilter textFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                if(name.matches(pattern))
                {
                    return true;
                }
                return false;
            }
        };
        File[] files = f.listFiles(textFilter);
        for(File file:files)
        {
            System.out.println(file);
        }
    }
}
