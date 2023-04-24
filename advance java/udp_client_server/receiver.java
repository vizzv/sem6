

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class receiver {
    public static void main(String[] args) throws Exception{
        int myPort=2555;
        int otherPort=701;
        InetAddress ia=InetAddress.getByName("localhost");
        DatagramSocket ds=new DatagramSocket(myPort);
        byte rd[]= new byte[1024];
        byte sd[]= new byte[1024];
        String s="receiver sending data";
        //rd= "receiver receving data".getBytes();
        sd=s.getBytes();
        DatagramPacket dpR=new DatagramPacket(rd,rd.length);
        DatagramPacket dpS=new DatagramPacket(sd, sd.length,ia,otherPort);
        ds.receive(dpR);
        String s1=new String(dpR.getData());
        System.out.println(s1);
        ds.send(dpS);
        //System.out.println(dp);
        ds.close();
    }
}
