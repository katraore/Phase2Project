package com.learneracademy.servelet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Students_LA")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="student_id")
	private int rollno;
	
	@Column(name="student_name")
	private String sname;
	
	@OneToOne
	private Classes cla;

	public Students() {
		super();
		
	}
	
	public Students(String sname, Classes cla) {
		super();
		this.sname = sname;
		this.cla = cla;
	}
	
	public Students(int rollno, String sname, Classes classes) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.cla = classes;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Classes getClasses() {
		return cla;
	}

	public void setClasses(Classes cla) {
		this.cla = cla;
	}

	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", sname=" + sname + ", classes=" + cla + "]";
	}
	

}
