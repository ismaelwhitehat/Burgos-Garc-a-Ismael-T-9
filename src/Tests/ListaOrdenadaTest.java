package Tests;

import org.junit.Before;
import org.junit.Test;
import Exceptions.ListSizeOverflownException;
import Modelos.ListaOrdenada;


public class ListaOrdenadaTest {
	
	private ListaOrdenada<Integer> c;
	
	// sobreescribe el metodo añadir suceso
	
		@Test
		
		public void AddSuccess(){
			
			// Se aseguraran los elementos introducidos en la lista
			
			assert(c.add(9)));
			assert(c.peek()==9);
		}
		
		
			// recorremos los elementos añadidos
			
			for(int i=0;i<10;i++){
				c.add(i);
			}
			try{
				c.add(10);
			} catch (ListSizeOverflownException e){
				
				assert(c.size()==10);
				assert(!c.contains(10));
			}
			
		}
		

			
			
		}


