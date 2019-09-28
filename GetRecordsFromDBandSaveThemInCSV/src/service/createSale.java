package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Sales;

public class createSale {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("GetRecordsFromDBandSaveThemInCSV");
		
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Sales sale = new Sales();
		
		sale.setProductName("OMV MaxxMotion 95");
		sale.setProductType("Gasoline");
		sale.setQuantity(100);
		
		entityManager.persist(sale);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		emFactory.close();
		
	}

}
