package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
		Logger modelo = Logger.getLogger("modelo");
		FileHandler fileHandler= new FileHandler("modelo.txt");
		fileHandler.setFormatter(new JSONFormatter());
		modelo.addHandler(fileHandler);
		modelo.addHandler(new EmailHandler());
		modelo.setLevel(Level.WARNING);
		Logger interfaz = Logger.getLogger("interfaz");
		interfaz.setLevel(Level.INFO);
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setFormatter(new ShoutingSimpleFormatter());
		interfaz.addHandler(consoleHandler);
		ConsoleHandler consoleHandler2 = new ConsoleHandler();
		consoleHandler2.setFormatter(new PalabrasProhibidasFormatter());
		interfaz.addHandler(consoleHandler2);
	}

}
