import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Date;
public class server3 {
    
    public static void main(String[] args) throws Exception{
        ServerSocket ss= new ServerSocket(1234);
        
        Socket s=ss.accept();
        
        OutputStream os=s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF("enter your string");


        InputStream is=s.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        
        String str=dis.readUTF();
        System.out.println("entered string is :"+str);

        StringBuffer answer= new StringBuffer();
        for(char c:str.toCharArray()){
            if(Character.isLowerCase(c)){
                answer.append(Character.toUpperCase(c));
            }
            else{
                answer.append(Character.toLowerCase(c));
            }
        }
        answer=answer.reverse();
        dos.writeUTF(answer.toString());

        dos.writeUTF(new Date().toString());// for getting date

        int sum=0;
        sum+=dis.readInt();
        sum+=dis.readInt();
        System.out.println("sum is : "+sum);
        
        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}
