package model.dao;

import java.util.List;

import com.mysql.cj.xdevapi.Client;

public interface AbstractDAO <T> {
	void insert(T t);
	void update(T t);
	void deleteById(Integer id);
	T findById(Integer id);
	List<T> findAll();
}	
