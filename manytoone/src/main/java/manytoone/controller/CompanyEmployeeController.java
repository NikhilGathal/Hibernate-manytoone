package manytoone.controller;

import manytoone.dao.Companydao;
import manytoone.dao.Employeedao;
import manytoone.dto.Company;
import manytoone.dto.Employee;

public class CompanyEmployeeController {

	public static void main(String[] args) {

//		Company company = new Company();
//		company.setId(1);
//		company.setName("Cognizant");
//		company.setGst("Cognizant@123");
//
//		Employee employee1 = new Employee();
//		employee1.setName("Aniket");
//		employee1.setId(1);
//		employee1.setAddress("Pune");
//		employee1.setComapny(company);
//
//		Employee employee2 = new Employee();
//		employee2.setName("Tanmay");
//		employee2.setId(2);
//		employee2.setAddress("Mumbai");
//		employee2.setComapny(company);
//
		Companydao companydao = new Companydao();
//		companydao.savecompany(company);
//
		Employeedao employeedao = new Employeedao();
//		employeedao.saveemployee(employee1);
//		employeedao.saveemployee(employee2);

		// update company

//		Company company = new Company();
//		company.setName("TCS");
//		company.setGst("TCS@123");

//		companydao.updateCompany(1, company);

		// update employee

//		Employee employee2 = new Employee();
//		employee2.setName("Prathamesh");
//		employee2.setAddress("Pune");

//		employeedao.updateEmployee(1, employee2);

		// find employee and company at a time

//		companydao.findCompany(1);
//		employeedao.findEmployee(1);
		
		// delete all  employee first then onlly we can delete company cant delete company first

		//employeedao.deleteEmployee(2);

		// delete company

		companydao.deletecompany(1);

	}
}
