package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Application {

	public static void main(String[] args) {
		
		Department depart = new Department(1, "IT");
		System.out.println(depart);
		
		System.out.println();
		
		Seller seller = new Seller(1, "Carlos", "carlos@gmail.com", new Date(), 1200.00, depart);
		System.out.println(seller);
		
	}

}
