package cl.lmedinar.recargo;

import java.util.List;

public interface CalculadoraDescuentos {
	
	Integer totalDescuento (List<Integer>precios);
	List<Integer> Calcula (List<Integer>precios);

}
