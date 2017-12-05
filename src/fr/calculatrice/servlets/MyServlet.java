package fr.calculatrice.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// import our model
import fr.calculatrice.beans.MyBean;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyServlet() {
       
    	super();
       
    }

	
	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response
			) throws ServletException, IOException {
	
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/calculatrice.jsp")
		.forward(request, response);
	
	}

	
	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response
			) throws ServletException, IOException {
		
		/* We get parameters number1, number2 and operation of the form.
		 * We construct MyBean model.
		 * MyBean checks values and does the calculus.
		 * The method toString returns the result message and
		 * sets it as attribute of request
		 */
		
		request.setAttribute(
				"reponse", 
				new MyBean(
						request.getParameter("number1"), 
						request.getParameter("number2"), 
						request.getParameter("operations")
						).toString()
				);
				
		
		this.getServletContext()
				.getRequestDispatcher("/WEB-INF/calculatrice.jsp")
				.forward(request, response);
	
	}

}
