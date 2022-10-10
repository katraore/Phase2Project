package com.learneracademy.servelet;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LearnerAcademyServlet
 */
@WebServlet("/LearnerAcademyServlet")
public class LearnerAcademyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGett(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cname1 = null;
		Classes classes = new Classes();
		classes.setCid(Integer.parseInt(request.getParameter("classes1")));
		if (classes.getCid()==1) {
			cname1="Algebra";
		}
		else if (classes.getCid()==2)
		{
			cname1="Biology";
		}
		else if (classes.getCid()==3)
		{
			cname1="Chemestry";
		}
		else if (classes.getCid()==4)
		{
			cname1="Data Science";
		}
		else if (classes.getCid()==5)
		{
			cname1="English";
		}
		else if (classes.getCid()==6)
		{
			cname1="French";
		}
		else if (classes.getCid()==7)
		{
			cname1="Java";
		}
		classes.setCname(cname1);
		
		
		Teachers teachers = new Teachers();
		
		String tname = null;
		int id = 0;
		
		teachers.setId(Integer.parseInt(request.getParameter("teacher")));
		if(teachers.getId()==1)
		{
			tname="Kassoum Traore";
		}
		
		else if(teachers.getId()==2)
		{
			tname="Hamady Ba";
		}
		
		else if(teachers.getId()==3)
		{
			tname="Nouhoum Diallo";
		}
		
		else if(teachers.getId()==4)
		{
			tname="Niame Ba";
		}
		else if(teachers.getId()==5)
		{
			tname="Sira Keita";
		}
		teachers.setTname(tname);	
		
		Subjects subjects1 = new Subjects();
		Subjects subjects2 = new Subjects();
		Subjects subjects3 = new Subjects();
		Subjects subjects4 = new Subjects();
		Subjects subjects5 = new Subjects();
		Subjects subjects6 = new Subjects();
		
		teachers.getCla().add(classes);
		classes.setTch(teachers);
		String[] checkbox;
		checkbox = request.getParameterValues("subject");
		
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
			for(int i = 0;i<checkbox.length;i++)
			{
				PrintWriter out = response.getWriter();
				out.println("top"+checkbox[i]);
				if(checkbox[i].equals("1"))
				{
					out.println(checkbox[i]);
					subjects1.setSid(1);
					subjects1.setSname("Mathematics");
					classes.getSbj().add(subjects1);
					subjects1.setCls(classes);
					session.save(subjects1);
					
				}
				
				else if(checkbox[i].equals("2"))
				{
					out.println(checkbox[i]);
					subjects2.setSid(2);
					subjects2.setSname("Languages");
					classes.getSbj().add(subjects2);
					subjects2.setCls(classes);
					session.save(subjects2);
					
				}
				
				else if(checkbox[i].equals("3"))
				{
					out.println(checkbox[i]);
					subjects3.setSid(3);
					subjects3.setSname("Informatics");
					classes.getSbj().add(subjects3);
					subjects3.setCls(classes);
					session.save(subjects3);
					
				}
				
				else if(checkbox[i].equals("4"))
				{
					out.println(checkbox[i]);
					subjects4.setSid(4);
					subjects4.setSname("Business");
					classes.getSbj().add(subjects4);
					subjects4.setCls(classes);
					session.save(subjects3);
					
				}
				
				else if(checkbox[i].equals("5"))
				{
					out.println(checkbox[i]);
					subjects5.setSid(5);
					subjects5.setSname("Sports");
					classes.getSbj().add(subjects5);
					subjects5.setCls(classes);
					session.save(subjects3);
					
				}
				
				else if(checkbox[i].equals("6"))
				{
					out.println(checkbox[i]);
					subjects6.setSid(6);
					subjects6.setSname("Nursing");
					classes.getSbj().add(subjects6);
					subjects6.setCls(classes);
					session.save(subjects3);
					
				}
				
			}
			session.save(classes);
			session.save(teachers);
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
		}
	}

	}
}
