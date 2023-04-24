package InetAddressDemo;
import java.net.*;
public class urlDemo {
    public static void main(String[] args) throws Exception {
        URL ul= new URL("http://www.google.com:74/search?q=vizzv");
        System.out.println("protocol ="+ul.getProtocol());
        System.out.println("host ="+ul.getHost());
        System.out.println("port ="+ul.getPort());
        System.out.println("default port ="+ul.getDefaultPort());
        System.out.println("file ="+ul.getFile());
    }
    
}
