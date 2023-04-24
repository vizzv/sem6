package tcp_client_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class client1 {
    public static void main(String[] args) throws Exception{
        InetAddress in=InetAddress.getLocalHost();
        Socket s= new Socket(in,2104);

        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);

        System.out.println(dis.readUTF());

        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);

        Scanner sc=new Scanner(System.in);

        dos.writeUTF(sc.nextLine());

        System.out.println(dis.readUTF());
        
        System.out.println(dis.readUTF());
        os.close();
        dos.close();
        dis.close();
        is.close();
        s.close();
    }
    
}
