package model.dao;

import model.dao.impl.SellerDAO;

public class DAOFactory {

	public static SellerDAO createSellerDAO() {
		return new SellerDAO();
	}
	
}
