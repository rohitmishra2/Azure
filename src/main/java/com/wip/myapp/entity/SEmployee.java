package com.wip.myapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class SEmployee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eid;

	private String ename;

	public SEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "SEmployee [eid=" + eid + ", ename=" + ename + "]";
	}

}
