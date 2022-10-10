package com.learneracademy.servelet;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Teacher_LA")
public class Teachers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="teacher_id")
	private int id;
	
	@Column(name="teacher_name")
	private String tname;
	
	@OneToMany(mappedBy = "tch")
	private List<Classes> cla = new ArrayList<Classes>();

	public Teachers() {
		super();
		
	}
	
	public Teachers(String tname, List<Classes> cla) {
		super();
		
		this.tname = tname;
		this.cla = cla;
	}
	
	public Teachers(int id, String tname, List<Classes> cla) {
		super();
		this.id = id;
		this.tname = tname;
		this.cla = cla;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public List<Classes> getCla() {
		return cla;
	}

	public void setCla(List<Classes> cla) {
		this.cla = cla;
	}

	@Override
	public String toString() {
		return "Teachers [id=" + id + ", tname=" + tname + ", cla=" + cla + "]";
	}
	
	
	
}
