package com.ibm.ws.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.ibm.ws.domain.Emp;

@Repository
public class EmpDao {
	
	ArrayList<Emp> emps = new ArrayList<>();

	public EmpDao() {
		this.emps.add(new Emp(1, "Rohan"));
		this.emps.add(new Emp(2, "Steve"));
		this.emps.add(new Emp(3, "John"));
	}
	
	public ArrayList<Emp> getAllEmps(){
		return this.emps;
	}
	
	public ArrayList<Emp> insertEmp(Emp e){
		this.emps.add(e);
		return this.emps;
	}
	
	public ArrayList<Emp> deleteEmp(int id){
		for(int i = 0; i<this.emps.size(); i++) {
			if(id== this.emps.get(i).getEmpId()) {
				this.emps.remove(i);
				break;
			}
		}
		return this.emps;
	}


}
