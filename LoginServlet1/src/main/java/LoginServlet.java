import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/login")
public class LoginServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			String s1 = req.getParameter("uname");
			String s2 = req.getParameter("pwd");
			PrintWriter pw = res.getWriter();
			
			pw.println("<html><body bgcolor=yellow text=red><h1>");
			if((s1.equals("abc"))&&(s2.equals("xyz"))){
				pw.println("Welcome "+s1);
			}
			else {
				pw.println("Invalid Uname/Pwd");
			}
			pw.println("</h1></body></html>");
			System.out.println("Created by Harshal Kavitkar");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
