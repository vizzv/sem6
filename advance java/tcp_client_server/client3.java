import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.zip.InflaterInputStream;
public class client3 {
   
    public static void main(String[] args) throws Exception{
        InetAddress inet=InetAddress.getLocalHost();
        Socket s= new Socket(inet,1234);
        
        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
    
        System.out.println(dis.readUTF());

        OutputStream os=s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF("Welcome To Gujarat Technical UNIVERSITY");
        
        System.out.println(dis.readUTF());

        System.out.println(dis.readUTF());

        

        dos.writeInt(1);
        dos.writeInt(2);

        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();


    }
    
}
