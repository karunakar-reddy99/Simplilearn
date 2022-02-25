Servlet Code:
package com.karunakar.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class InsertProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertProduct() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		String pprice= request.getParameter("pprice");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.print("<h1>Prodcut Details</h1>");
		out.print("<table border='1'><tr><th>Product Id</th><th>Product Name</th><th>Product Price</th></tr>");
		out.println("<tr><td>"+pid+"</td> <td>"+pname+"</td> <td>"+pprice+"</td></tr></table>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

HTML CODE:
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Product Details</h1>
<hr>
<form  action="insert">
    
    <ul>
        <li>
            <label for="name">Product Id:</label><br>
            <input type="text" name="pid" id="pid" value="" />
        </li>
        <li>
            <label for="email">Product name</label><br>
            <input type="text" name="pname" id="pname" value="" />
        </li>
        <li>
            <label for="comments">Product Price:</label><br>
            <textarea id="pprice" name="pprice" cols="25" rows="3"></textarea>
        </li>
        <li>
            <input type="submit" value="submit" />
            <input type="reset" value="reset" />
        </li>
    </ul>
</form>

</body>
</html>


