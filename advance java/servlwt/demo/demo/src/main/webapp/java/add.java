import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class add extends Http{

    public void doPost(HttpRequest req,HttpResponse res) throws Exception{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        int a=Integer.parseInt(req.getParameter("n1"));
        int b=Integer.parseInt(req.getParameter("n2"));
        out.println("addition  is "+(a+b));
        int mul=a*b;
        req.setAttribute("add",mul);
        out.println("multiplication is "+(a*b));
    }
}