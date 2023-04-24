

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class sender {    
    public static void main(String[] args) throws Exception{
        int myPort =701;
        int otherPort=2555;
        DatagramSocket ds = new DatagramSocket(myPort);
        String s="sender sending data";
        
        byte sd[]=new byte[1024];
        sd=s.getBytes();
        byte rd[]=new byte[1024];
        InetAddress ia=InetAddress.getLocalHost();
        DatagramPacket dpS=new DatagramPacket(sd, sd.length, ia, otherPort);
        DatagramPacket dpR=new DatagramPacket(rd, rd.length);
        ds.send(dpS);
        ds.receive(dpR);
        System.out.println(dpR.getData().toString());
        ds.close();
    }
}
