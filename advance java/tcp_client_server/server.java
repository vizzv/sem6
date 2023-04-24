package tcp_client_server;

import java.net.*;
import java.io.*;

public class server {
    
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(1234);
        Socket s=ss.accept();
        OutputStream ostm=s.getOutputStream();
        DataOutputStream dostm=new DataOutputStream(ostm);
        
        
        dostm.writeUTF("Hii I am Server");
        
        dostm.close();
        ostm.close();
        s.close();
        

    }
}
