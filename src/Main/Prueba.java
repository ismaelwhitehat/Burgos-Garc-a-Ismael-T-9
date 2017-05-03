package Main;

import java.util.Queue;

import Exceptions.ListSizeOverflownException;
import Modelos.ListaOrdenada;

// Hacemos la prueba

public class Prueba {

	public static void main(String[] args) throws ListSizeOverflownException {
		
		@SuppressWarnings("unchecked")
		Queue<Integer> lista=(Queue<Integer>) new ListaOrdenada<Integer>(
				
				(Integer a,Integer b) -> a-b
				);
				


	}

}
