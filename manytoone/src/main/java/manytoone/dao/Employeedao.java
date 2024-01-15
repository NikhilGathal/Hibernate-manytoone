package manytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytoone.dto.Company;
import manytoone.dto.Employee;

public class Employeedao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}

	public void saveemployee(Employee employee) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

	public void updateEmployee(int id, Employee employee) {
		EntityManager entityManager = getEntityManager();
		Employee dbemployee = entityManager.find(Employee.class, id);
		if (dbemployee != null) {
			// that comp is present then can update data
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			employee.setId(id);
			employee.setComapny(dbemployee.getComapny());
			entityManager.merge(employee);
			entityTransaction.commit();
		} else {
			// company not present
			System.out.println("Not present");
		}
	}

	public void findEmployee(int id) {
		EntityManager entityManager = getEntityManager();
		Employee dbemployee = entityManager.find(Employee.class, id);
		if (dbemployee != null) {
			// that comp is present then can find data
			System.out.println(dbemployee);
		} else {
			// company not present
			System.out.println("Not present");
		}
	}

	public void deleteEmployee(int id) {
		EntityManager entityManager = getEntityManager();
		Employee dbemployee = entityManager.find(Employee.class, id);
		if (dbemployee != null) {
			// that comp is present then can delete data
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbemployee);
			entityTransaction.commit();

		} else {
			// company not present
			System.out.println("Not present");
		}
	}

}
