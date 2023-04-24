package tcp_client_server;

import java.net.*;
import java.io.*;

public class server1 {
    public static void main(String[] args) throws Exception{
        ServerSocket ss= new ServerSocket(2104);
        Socket s= ss.accept();
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeUTF("please enter string :");

        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        String msg=dis.readUTF();
        System.out.println("Enterd String is "+msg);
        StringBuffer revString= new StringBuffer(msg);
        revString=revString.reverse();
    
        dos.writeUTF(revString.toString());

        if(msg.equals(revString.toString())){
            dos.writeUTF("It is pallindrome");
        }
        else{
            dos.writeUTF("It is not pallindrome");
        }
    
        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();

    }
}
