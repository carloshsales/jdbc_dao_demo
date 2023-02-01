package model.dao;

import db.DB;
import model.dao.impl.SellerDAOIMPL;

public class DAOFactory {

	public static SellerDAO createSellerDAO() {
		return new SellerDAOIMPL(DB.getConnection());
	}
	
}
