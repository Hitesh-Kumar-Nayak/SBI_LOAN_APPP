package in.ashokit.servlet;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ashokit.dao.BookDao;

@WebServlet("/bookServlet")

public class BookServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) {
		
		try {
			
			String id = req.getParameter("bookId");
			String name= req.getParameter("bookName");
			String price = req.getParameter("bookPrice");
			
			int bookId = Integer.parseInt(id);
			double bookPrice = Double.parseDouble(price);
			
			
			BookDao dao = new BookDao();
			boolean status = dao.saveBook(bookId, name,bookPrice);
			
			String response = null;
			if(status) {
				response = "Record Inserted";
				
				
			}else {
				response = "Insertion Failed";
				}
			PrintWriter pw = res.getWriter();
			pw.append(response);
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
		
			
		
		


