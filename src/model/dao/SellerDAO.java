package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDAO extends AbstractDAO<Seller>{
	void insert(Seller department);
	void update(Seller department);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
