package cl.lmedinar;

import java.util.List;

import cl.lmedinar.recargo.CalculadoraCompleja;
import cl.lmedinar.recargo.CalculadoraDescuentos;
import cl.lmedinar.recargo.CalculadoraSimple;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Integer> precios = Utilitaria.creaListaAleatoria();
		
		CalculadoraDescuentos descuento = new CalculadoraSimple();
		List<Integer> preciosDescuento = descuento.Calcula(precios);
		Integer total = descuento.totalDescuento(precios);
		
		
		CalculadoraDescuentos descuentoComplejo = new CalculadoraCompleja();
		List<Integer> preciosDescuentoComplejo= descuentoComplejo.Calcula(precios);
		Integer totalComplejo = descuentoComplejo.totalDescuento(precios);
		
		System.out.println("5 precios aleatorios: "+precios);
		System.out.println("-------------------");
		System.out.println("Descuento con algoritmo simple del 10%: "+preciosDescuento);
		System.out.println("Descuento total algoritmo simple: "+total);
		System.out.println("-------------------");
		System.out.println("Descuento con algoritmo complejo: "+preciosDescuentoComplejo);
		System.out.println("Descuento total algoritmo complejo: "+totalComplejo);
	}

}
