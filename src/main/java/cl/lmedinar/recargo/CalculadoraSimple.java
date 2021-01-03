package cl.lmedinar.recargo;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraSimple implements CalculadoraDescuentos{

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
		
		Double factor= 1.10;
		
		
		for(Integer precio:precios)
			preciosAux.add((int) (precio * factor));
		
		
		return preciosAux;
	}

}
