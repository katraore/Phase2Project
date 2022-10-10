package com.learneracademy.servelet;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class StudentsClasses {
	
	@Id
	@Column(name="student_id")
	private int cid;
	
	
	private String cname;
	
	@OneToMany(mappedBy = "cla")
	private List<Students> stc = new ArrayList<Students>();
	
	public StudentsClasses() {
		super();
		
	}

	public StudentsClasses(String cname, List<Students> stc) {
		super();
	
		this.cname = cname;
		this.stc = stc;
	}
	
	public StudentsClasses(int cid, String cname, List<Students> stc) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.stc = stc;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Students> getStc() {
		return stc;
	}

	public void setStc(List<Students> stc) {
		this.stc = stc;
	}

	@Override
	public String toString() {
		return "StudentsClasses [cid=" + cid + ", cname=" + cname + ", stc=" + stc + "]";
	}
	
	
}
