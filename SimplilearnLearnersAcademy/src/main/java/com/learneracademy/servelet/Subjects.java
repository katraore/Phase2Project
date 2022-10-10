package com.learneracademy.servelet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subjects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sbject_id")
	private int sid;
	
	@Column(name="subject_name")
	private String sname;
	
	@ManyToOne
	private Classes cls;
	
	public Subjects() {
		super();
		
	}
	
	public Subjects(String sname, Classes cls) {
		super();
		
		this.sname = sname;
		this.cls = cls;
	}
	
	public Subjects(int sid, String sname, Classes cls) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cls = cls;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Classes getCls() {
		return cls;
	}

	public void setCls(Classes cls) {
		this.cls = cls;
	}

	@Override
	public String toString() {
		return "Subjects [sid=" + sid + ", sname=" + sname + ", cls=" + cls + "]";
	}
	
	
	
}
