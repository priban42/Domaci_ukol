import javax.servlet.*;
import java.util.*; 
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.time.*; 

@WebServlet("/TimeZone")
public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //arg = request.getParameter("arg");
	String tz = request.getParameter("timezone");
	String[] id = TimeZone.getAvailableIDs();
	boolean validId = false;
	response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

	out.println("<html><body>");
	for (int i=0; i<id.length; i++){
		if (id[i].equals(tz)){
			validId = true;
			break;
		}
	}
	
	TimeZone zone = TimeZone.getTimeZone(tz);

        
		if(validId){
			out.println(tz);
			ZoneId zoneId = ZoneId.of("Europe/Prague");
			ZonedDateTime now = ZonedDateTime.now(zoneId);
			out.println(now);
		}else{
			out.println("invalid id");
		}
        out.println("</body></html>");

    }
} 