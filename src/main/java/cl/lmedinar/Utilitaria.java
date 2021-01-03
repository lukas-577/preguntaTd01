package cl.lmedinar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Utilitaria {
	
	private Utilitaria() {
		
	}
	
	public static List<Integer> creaListaAleatoria(){
		
		Random r = new Random();
		List<Integer> precios = new ArrayList<>();
		for(int i = 0; i < 5; i++)			
		precios.add((int) r.nextInt(9000)+1000);
		return precios;
	}
	
	//por cada uno de los elementos voy a sumarlos y retornar la suma
	public static Integer sumaLista(List<Integer> lista) {
		int suma = 0;
		
		for(Integer num:lista)
			suma= suma+num;
		
		return suma;
	}


}
