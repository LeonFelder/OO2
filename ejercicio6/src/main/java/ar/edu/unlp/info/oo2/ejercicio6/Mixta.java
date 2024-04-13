package ar.edu.unlp.info.oo2.ejercicio6;

import java.util.List;
import java.util.ArrayList;

public class Mixta extends Topografia {
	private List<Topografia> topografias;
	
	public Mixta (Topografia top1, Topografia top2, Topografia top3, Topografia top4) {
		topografias = new ArrayList<>();
		topografias.add(top1);
		topografias.add(top2);
		topografias.add(top3);
		topografias.add(top4);
	}
	
	public List<Topografia> getTopografia() {
		return topografias;
	}
	
	@Override
	public double calcularProporcion() {
		return (topografias.stream().mapToDouble(t -> t.calcularProporcion()).sum()) / 4;
	}

	@Override
	public boolean isEquals(Topografia topografia) {
		return this.topografias.equals(topografia.getTopografia());
	}
}
