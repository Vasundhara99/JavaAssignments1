package vasundhara.assignment3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PingHost {
    public static void sendPingRequest(String ipAddress)
            throws UnknownHostException, IOException
    {
        InetAddress geek = InetAddress.getByName(ipAddress);
        System.out.println("Sending Ping Request to " + ipAddress);
        if (geek.isReachable(5000))
            System.out.println("Host is reachable");
        else
            System.out.println("Sorry ! We can't reach to this host");
        long finish = 0;
        long start = new GregorianCalendar().getTimeInMillis();

        if (geek.isReachable(5000)){
            finish = new GregorianCalendar().getTimeInMillis();
            System.out.println("Ping RTT: " + (finish - start + "ms"));
        } else {
            System.out.println(ipAddress + " NOT reachable.");
        }
    }

    public static void main(String[] args)
            throws UnknownHostException, IOException
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        sendPingRequest(input);
    }
}
