package com.ibm.ws.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.ws.dao.EmpDao;
import com.ibm.ws.domain.Emp;

@Service
public class EmpService {

	@Autowired
	EmpDao empdao;

	public ArrayList<Emp> getAllEmps() {
		return empdao.getAllEmps();
	}

	public ArrayList<Emp> insertEmp(Emp e) {
		return empdao.insertEmp(e);
	}

	public ArrayList<Emp> deleteEmp(int id) {
		return empdao.deleteEmp(id);
	}
}
