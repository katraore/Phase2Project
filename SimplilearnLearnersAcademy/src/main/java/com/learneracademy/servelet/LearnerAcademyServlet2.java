package com.learneracademy.servelet;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LearnerAcademyServlet2
 */
@WebServlet("/LearnerAcademyServlet2")
public class LearnerAcademyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cname2 = null;
		Students students = new Students();
		students.setRollno(Integer.parseInt(request.getParameter("rollno")));
		students.setSname(request.getParameter("name"));
		int cid = (Integer.parseInt(request.getParameter("classes2")));
		if (cid == 1) {
			cname2="Algebra";
		}
		else if (cid==2)
		{
			cname2="Biology";
		}
		else if (cid==3)
		{
			cname2="Chemestry";
		}
		else if (cid==4)
		{
			cname2="Data Science";
		}
		else if (cid==5)
		{
			cname2="English";
		}
		else if (cid==6)
		{
			cname2="French";
		}
		else if (cid==7)
		{
			cname2="Java";
		}
		
		
		Classes cl = new Classes();
		
		cl.setCname(cname2);
		cl.setSbj(null);
		cl.setTch(null);
		cl.setCid(cid);
		students.setClasses(cl);
	
		
		
		
		SessionFactory factory;
		Transaction tx = null;
		try {
			//1. Create the Configuration Object
			AnnotationConfiguration cfg= new AnnotationConfiguration();
			
			//2. Call the Configure Object
			cfg=(AnnotationConfiguration) cfg.configure();
			
			//3. Through the Configuration object call the buildSessionFactory
			factory=cfg.buildSessionFactory();
			
			//4. With the factory object open the session
			Session session=factory.openSession();
			
			//5. With the help of Session need to begin the transaction
			tx=session.beginTransaction();
			
			//6. Business Object
			session.save(cl);
			session.save(session);
			
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}

	
	}

}
