package tcp_client_server;

import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) throws Exception{
        InetAddress in=InetAddress.getLocalHost();
        int port=1234;
        //Socket s=new Socket(serverIp,port);
        Socket s=new Socket(in,port);
        InputStream istm=s.getInputStream();
        DataInputStream distm= new DataInputStream(istm);
        System.out.println("output is "+distm.readUTF());
        
        
        distm.close();
        istm.close();
        s.close();
    }
}
