package vasundhara.assignment4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FillingKYCForm {
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int testCases=sc.nextInt();
        for(int i=0;i<testCases;i++) {
            Calendar signUpDate = Calendar.getInstance();
            signUpDate.setTime(new SimpleDateFormat("dd-MM-yyyy").parse(sc.next()));
            Calendar currentDate = Calendar.getInstance();
            currentDate.setTime(new SimpleDateFormat("dd-MM-yyyy").parse(sc.next()));
            if (signUpDate.get(Calendar.YEAR) >= currentDate.get(Calendar.YEAR)) {
                System.out.println("No range");
            }
            ;
            Calendar startDate = Calendar.getInstance();
            startDate.set(Calendar.MONTH, signUpDate.get(Calendar.MONTH));
            startDate.set(Calendar.DATE, signUpDate.get(Calendar.DATE));
            startDate.set(Calendar.YEAR, currentDate.get(Calendar.YEAR));
            startDate.add(Calendar.DAY_OF_MONTH, -30);
            Calendar endDate = Calendar.getInstance();
            endDate.set(Calendar.MONTH, signUpDate.get(Calendar.MONTH));
            endDate.set(Calendar.DATE, signUpDate.get(Calendar.DATE));
            endDate.set(Calendar.YEAR, currentDate.get(Calendar.YEAR));
            endDate.add(Calendar.DAY_OF_MONTH, +30);
            if (currentDate.compareTo(endDate) > 0) {
                System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(startDate.getTime())+" "+
                        new SimpleDateFormat("dd-MM-yyyy").format(endDate.getTime()) );
            } else if (currentDate.compareTo(startDate) > 0 && currentDate.compareTo(endDate) < 0) {

                System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(startDate.getTime())+" "
                +new SimpleDateFormat("dd-MM-yyyy").format(currentDate.getTime()));
            }
        }
    }
}
