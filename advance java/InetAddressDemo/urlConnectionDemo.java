package InetAddressDemo;
import java.net.*;
public class urlConnectionDemo {
    public static void main(String[] args) throws Exception{
        URL ul= new URL("https://www.youtube.com/watch?v=CULzwVcyw2c");
        URLConnection ulc=ul.openConnection();
        System.out.println("url = "+ulc.getURL());
        System.out.println("iam running");
        System.out.println("content type is = "+ulc.getContentType());
        System.out.println("content length is = "+ulc.getContentLength());
        System.out.println("class is = "+ulc.getClass());
        //System.out.println("content is = "+ulc.getContent());
        
    }
}
