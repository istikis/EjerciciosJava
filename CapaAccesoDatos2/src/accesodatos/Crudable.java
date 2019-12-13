package accesodatos;


//CRUD: Create, Retrieve, Update, Delete
public interface Crudable<T> {
	
	public Iterable<T> getAll();
	public T getById(Long id);
	public T insert(T t);
	public T update(T t);
	public T delete(T t);
	public T delete(Long id);
	
	
	
	
	
	

}
