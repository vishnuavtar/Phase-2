import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;	

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	// From login.jsp, as a post method only the credentials are passed
	// Hence the parameters should match both in jsp and servlet and
	// then only values are retrieved properly
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// We can able to get the form data by means of the below ways.
		// Form arguments should be matched and then only they are recognised
		// login.jsp component names should match and then only
		// by using request.getParameter, it is matched
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		// To verify whether entered data is printing correctly or not
		System.out.println("emailId.." + emailId);
		System.out.println("password.." + password);
		// Here the business validations goes. As a sample,
		// we can check against a hardcoded value or pass
		// the values into a database which can be available in local/remote db
		// For easier way, let us check against a hardcoded value
		if (emailId != null && emailId.equalsIgnoreCase("admin@gmail.com") && password != null && password.equalsIgnoreCase("admin")) {
			// We can redirect the page to a welcome page
			// Need to pass the values in session in order
			// to carry forward that one to next pages
			HttpSession httpSession = request.getSession();
			// By setting the variable in session, it can be forwarded
			httpSession.setAttribute("emailId", emailId);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
	}
}
