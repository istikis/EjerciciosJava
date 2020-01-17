package com.istikis.repositorios;

import java.util.GregorianCalendar;
import java.util.TreeMap;
import com.istikis.modelos.Student;

public class StudentTreeMap implements Dao<Student> {
	
	private TreeMap<Long, Student> student = new TreeMap<>();
	
	// Patrón SINGLETON
	private final static StudentTreeMap INSTANCIA = new StudentTreeMap(); 
	
	private StudentTreeMap() {
		AddStudent(new Student(null, "Rodrigo","Soto","Hombre",new GregorianCalendar(1982, 2-1, 28).getTime()));
		AddStudent(new Student(null, "Camila","Tapia","Mujer",new GregorianCalendar(1989, 11-1, 16).getTime()));
		AddStudent(new Student(null, "Guillermo","Cuate","Hombre",new GregorianCalendar(1979, 8-1, 9).getTime()));
	}
	
	public static StudentTreeMap getInstancia() { return INSTANCIA;	}
	
	// Fin SINGLETON

	@Override
	public Iterable<Student> getAll() {
		return student.values();
	}

	@Override
	public Student getById(Long id) {
		throw new UnsupportedOperationException("NO ESTÁ IMPLEMENTADO");
	}

	@Override
	public void AddStudent(Student student) {
		throw new UnsupportedOperationException("NO ESTÁ IMPLEMENTADO");
	}

	@Override
	public void UpdateStudent(Student student) {
		throw new UnsupportedOperationException("NO ESTÁ IMPLEMENTADO");	
	}

	@Override
	public void DeleteStudent(Long id) {
		throw new UnsupportedOperationException("NO ESTÁ IMPLEMENTADO");
	}

}
