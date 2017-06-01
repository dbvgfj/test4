package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.dataAccess;
import model.Guitar;
import model.GuitarSpec;
import mysqlDao.UserDaoImpl;

public class addGuitar extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    public addGuitar() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
			request.setCharacterEncoding("utf-8");
			response.setContentType("utf-8");
			String price=request.getParameter("price");
			String serialNumber=request.getParameter("serialNumber");
			String builder=request.getParameter("builder");
			String model=request.getParameter("model");
			String type=request.getParameter("type");
			String backwood=request.getParameter("backwood");
			String topwood=request.getParameter("topwood");
			
			
			GuitarSpec spec = new GuitarSpec(null, null, null, null, null);
			
			//获取系列号和价格
			String serialNumber1=request.getParameter("serialnumber");
			
			UserDao i = dataAccess.createGuitarDao();
			i.addGuitar(serialNumber1, price, spec);		

	 	 	request.getRequestDispatcher("index.html").forward(request, response);
			
			
				
			
		}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}
