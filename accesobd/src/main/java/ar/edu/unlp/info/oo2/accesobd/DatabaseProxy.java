package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy {
	private DatabaseRealAccess dataBase;
	private boolean loggedIn;
	
	public DatabaseProxy (DatabaseRealAccess dataBase) {
		this.dataBase = dataBase;
		loggedIn = false;
	}
	
	public void logIn () {
		loggedIn = true;
	}
	
	public void logOut () {
		loggedIn = false;
	}
	
	public Collection<String> getSearchResults (String queryString){
		if(!loggedIn) {
			throw new RuntimeException ("Debe estar loggeado para acceder a la base de datos.");
		}
		return dataBase.getSearchResults(queryString);
	}
	
	public int insertNewRow(List<String> rowData) {
		if (! loggedIn) {
			throw new RuntimeException ("Debe estar loggeado para acceder");
		}
		return dataBase.insertNewRow(rowData);
	}
}
