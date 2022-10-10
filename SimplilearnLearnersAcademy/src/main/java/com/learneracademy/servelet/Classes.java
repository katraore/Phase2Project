package com.learneracademy.servelet;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Classes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="class_id")
	private int cid;
	
	@Column(name="class_name")
	private String cname;
	
	@ManyToOne
	private Teachers tch;
	
	@OneToMany(mappedBy = "cls")
	//One class has many subjects
	private List<Subjects> sbj = new ArrayList<Subjects>();
	
	public Classes() {
		super();
		
	}
	
	public Classes(String cname, Teachers tch, List<Subjects> sbj) {
		super();
		
		this.cname = cname;
		this.tch = tch;
		this.sbj = sbj;
	}
	
	public Classes(int cid, String cname, Teachers tch, List<Subjects> sbj) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.tch = tch;
		this.sbj = sbj;
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

	public Teachers getTch() {
		return tch;
	}

	public void setTch(Teachers tch) {
		this.tch = tch;
	}

	public List<Subjects> getSbj() {
		return sbj;
	}

	public void setSbj(List<Subjects> sbj) {
		this.sbj = sbj;
	}

	@Override
	public String toString() {
		return "Classes [cid=" + cid + ", cname=" + cname + ", tch=" + tch + ", sbj=" + sbj + "]";
	}

}
