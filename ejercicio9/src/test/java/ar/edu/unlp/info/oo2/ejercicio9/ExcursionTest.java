package ar.edu.unlp.info.oo2.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExcursionTest {
	Excursion exc,exc2;
	
	@BeforeEach
	void setUp() throws Exception {
		exc = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.now(), LocalDate.now(), "en el rio", 7854.45, 2,1);
		exc2 = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.now(), LocalDate.now(), "en el rio", 7854.45, 5,2);
	}

	@Test
	void testInscribirUsuario() {
		exc2.inscribir(new Usuario("Roberto","Perez","gidsfd22@hotmail.com"));
		System.out.println(exc2.obtenerInformacion());
		exc2.inscribir(new Usuario("Maria","De Las Nieves","marinieves@gmail.com"));
		System.out.println(exc2.obtenerInformacion());
		exc2.inscribir(new Usuario("Silvio","Rodriguez","silvio@hotmail.com"));
		System.out.println(exc2.obtenerInformacion());
	}

}
