package service;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sun.jmx.snmp.Timestamp;

import entity.Sales;

public class SaveRecordsToCsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("GetRecordsFromDBandSaveThemInCSV");
		EntityManager entityManag = emfactory.createEntityManager();
		
		entityManag.getTransaction().begin();
		
		Query query = entityManag.createQuery("SELECT s FROM Sales s WHERE s.productType like '%Gasoline%'");
		
		List<Sales> result = query.getResultList();
		
		entityManag.close();
		emfactory.close();
		
		System.out.println("Please insert the path where you want the csv file to be generated");
		Scanner input = new Scanner(System.in);
		
		String path = input.nextLine();
		
		try {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy_HHmmss");
			Date date = new Date();
			
			String filename = "ProductReport_" + String.valueOf(dateFormat.format(date.getTime())) +".csv";
			
			FileWriter csvFile = new FileWriter(path+ "\\" + filename);
			
			csvFile.append("ID");
			csvFile.append(",");
			csvFile.append("Product Name");
			csvFile.append(",");
			csvFile.append("Product Type");
			csvFile.append(",");
			csvFile.append("Quantity");
			csvFile.append("\n");
			
			for(Sales sale : result) {
				
				csvFile.write(String.valueOf(sale.getId()));
				csvFile.append(",");
				csvFile.append(sale.getProductName());
				csvFile.append(",");
				csvFile.append(sale.getProductType());
				csvFile.append(",");
				csvFile.write(String.valueOf(sale.getQuantity()));
				csvFile.append("\n");
				
			}
			
			csvFile.flush();
			csvFile.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
