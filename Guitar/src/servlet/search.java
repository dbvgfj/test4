package servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.dataAccess;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;


public class search extends HttpServlet{
	
    private static final long serialVersionUID = 1L ; 
public void doGet(HttpServletRequest request,HttpServletResponse response)throws 
		ServletException,IOException{
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws
		ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		
		
		
		GuitarSpec spec = new GuitarSpec(null, null, null, null, null);
		spec.setBackWood(request.getParameter("backwood"));
		spec.setBuilder(request.getParameter("builder"));
		spec.setModel(request.getParameter("model"));
		spec.setTopWood(request.getParameter("topwood"));
		spec.setType(request.getParameter("type"));

		// 新建一个guitar List 用来存储匹配到的guitars				
		List search = new LinkedList();
		UserDao i = dataAccess.createGuitarDao();
		search = i.Inventory().search(spec);		
		
		System.out.println(search);
		
		request.setAttribute("res", search);
		if (!search.isEmpty()) {
	        request.getRequestDispatcher("list.jsp").forward(request,response);
	      } else {
	        System.out.println("对不起，暂无此商品。");
	      }	
	}
}

