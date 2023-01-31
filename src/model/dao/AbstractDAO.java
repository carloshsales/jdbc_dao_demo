package model.dao;

import java.util.List;

public interface AbstractDAO <T> {
	void insert(T t);
	void update(T t);
	void deleteById(Integer id);
	T findById(Integer id);
	List<T> findAll();
}	
