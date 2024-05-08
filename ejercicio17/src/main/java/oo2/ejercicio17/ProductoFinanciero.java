package oo2.ejercicio17;

import java.time.LocalDate;

public abstract class ProductoFinanciero {
	private LocalDate fechaOperacion;
	
	public ProductoFinanciero () {
		fechaOperacion = LocalDate.now();
	}
	
	public abstract double retornoInversion (double montoInicial);
}
