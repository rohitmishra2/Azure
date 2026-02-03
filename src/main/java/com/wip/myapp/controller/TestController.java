package com.wip.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wip.myapp.entity.SEmployee;
import com.wip.myapp.service.SEmployeeService;

@RestController
@RequestMapping("/api/employee")
public class TestController {
	
	@Autowired
	private SEmployeeService sEmployeeService;
	
	@GetMapping("/hi")
	private String sayHi() {
		return "Success!!! Getting Message from TestController!";
	}
	@PostMapping("/createEmp")
	public ResponseEntity<?> addEmployee(@RequestBody SEmployee employee) {
		sEmployeeService.createEmployee(employee);
		return new ResponseEntity<>(employee, HttpStatus.CREATED);
	}

	@GetMapping("/allEmp")
	public ResponseEntity<List<SEmployee>> listAllEmployees() {
		List<SEmployee> emplist = sEmployeeService.getAllEmployee();
		return new ResponseEntity<List<SEmployee>>(emplist, HttpStatus.OK);

	}

	@PutMapping("/updateEmp")
	public ResponseEntity<List<SEmployee>> updateEmployee(@RequestBody SEmployee employee) {
		List<SEmployee> emplist = sEmployeeService.updateEmployee(employee);
		return new ResponseEntity<List<SEmployee>>(emplist, HttpStatus.OK);

	}

	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<List<SEmployee>> deleteEmployee(@PathVariable("id") Long eid) {
		List<SEmployee> emplist = sEmployeeService.deleteEmployee(eid);
		return new ResponseEntity<List<SEmployee>>(emplist, HttpStatus.OK);
	}	

}
