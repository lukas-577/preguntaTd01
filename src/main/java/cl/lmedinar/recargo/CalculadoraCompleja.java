package cl.lmedinar.recargo;

import java.util.ArrayList;
import java.util.List;

import cl.lmedinar.Utilitaria;

public class CalculadoraCompleja implements CalculadoraDescuentos {
	
	@Override
	public Integer totalDescuento(List<Integer> precios) {
		int total = 0;
		
		for(Integer precio: Calcula(precios))
			total = total +precio;
		
		return total;
	}

	@Override
	public List<Integer> Calcula(List<Integer> precios) {
		
		List<Integer> preciosAux = new ArrayList<>();
		
		Double factor= 1.0;
		
		Integer suma = Utilitaria.sumaLista(precios);
		
		if(suma>5000)
			factor=1.1;
		else if(suma>20000)
			factor=1.15;
		if(suma<=3500)
			factor=1.05;
		
		for(Integer precio:precios)
			preciosAux.add((int) (precio * factor));
		
		
		return preciosAux;
	}

}
