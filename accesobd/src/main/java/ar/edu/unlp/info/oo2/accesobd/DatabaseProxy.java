package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.logging.*;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
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
			Logger.getLogger("app.main").log(Level.SEVERE,"Acceso indebido a la base de datos");
			throw new RuntimeException ("Debe estar loggeado para acceder a la base de datos.");
		}
		Logger.getLogger("app.main").log(Level.INFO,"Acceso correcto a la base de datos");
		return dataBase.getSearchResults(queryString);
	}
	
	public int insertNewRow(List<String> rowData) {
		if (! loggedIn) {
			Logger.getLogger("app.main").log(Level.SEVERE,"Acceso indebido a la base de datos");
			throw new RuntimeException ("Debe estar loggeado para acceder");
		}
		Logger.getLogger("app.main").log(Level.WARNING,"Acceso correcto a la base de datos");
		return dataBase.insertNewRow(rowData);
	}
}
