package manytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytoone.dto.Company;
import manytoone.dto.Employee;

public class Companydao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}

	public void savecompany(Company company) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();
	}

	public void updateCompany(int id, Company company) {
		EntityManager entityManager = getEntityManager();
		Company dbcompany = entityManager.find(Company.class,id);
		if (dbcompany != null) {
			// that comp is present then can update data
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			company.setId(id);
			entityManager.merge(company);
			entityTransaction.commit();
		} else {
			// company not present
			System.out.println("Not present");
		}
	}
	
	public void findCompany(int id) {
		EntityManager entityManager = getEntityManager();
		Company dbcompany = entityManager.find(Company.class, id);
		if (dbcompany != null) {
			// that comp is present then can find data
			System.out.println(dbcompany);
		} else {
			// company not present
			System.out.println("Not present");
		}
	}
	
	public void deletecompany(int id) {
		EntityManager entityManager = getEntityManager();
		Company dbcompany = entityManager.find(Company.class, id);
		if (dbcompany != null) {
			// that comp is present then can delete data
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbcompany);
			entityTransaction.commit();

		} else {
			// company not present
			System.out.println("Not present");
		}
	}
}
