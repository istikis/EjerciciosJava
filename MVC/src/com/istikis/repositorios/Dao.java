package com.istikis.repositorios;

public interface Dao<T>  {
	
	Iterable<T> getAll();
	T getById(Long id);
	
	void AddStudent(T student);
	void UpdateStudent(T student);
	void DeleteStudent(Long id);

}
