package InetAddressDemo;
import java.net.*;

class InetAddressDemo{
    public static void main(String[] args) throws Exception {
    InetAddress i= InetAddress.getByName("localhost");
    InetAddress i1= InetAddress.getLocalHost();
    InetAddress i2[]= InetAddress.getAllByName(i1.getHostName());
    System.out.println(i);
    System.out.println(i1);
    for (InetAddress iaddr : i2) {
        System.out.println(iaddr);
    }

    
    }
}
