package application;

import model.dao.DAOFactory;
import model.dao.impl.SellerDAO;

public class Application {

	public static void main(String[] args) {
		
		SellerDAO seller = DAOFactory.createSellerDAO();
		
	}

}
