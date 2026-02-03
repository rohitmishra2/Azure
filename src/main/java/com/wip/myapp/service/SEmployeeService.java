package com.wip.myapp.service;

import java.util.List;

import com.wip.myapp.entity.SEmployee;

public interface SEmployeeService {
	public void createEmployee(SEmployee employee);
	public List<SEmployee> getAllEmployee();
	public List<SEmployee> updateEmployee(SEmployee employee);
	public List<SEmployee> deleteEmployee(Long eid);

}
