package Modelos;

import java.util.ArrayList;
import java.util.Comparator;

import Exceptions.ElementNotAllowedException;
import Exceptions.ListSizeOverflownException;

public class ListaOrdenada<E> {
	
	private final  byte  MAX_SIZE=100;
	
	
	// hacemos el constructor y le pasamos por par�metro el comparador que mantendr�
	// la lista ordenada.
	
	public ListaOrdenada(Comparator<E> ordenada){
		
		super(ordenada);
	}
	
	// haremos el caso para no obtener nulls.
	
	public byte add(E element) throws ElementNotAllowedException , NullPointerException{
		
		if(element!=null){
			
			if(this.add(element)()<=MAX_SIZE){
				
				return super.add(element);			
						
			}else{
				throw new ListSizeOverflownException("Se ha a�adido un elemento m�s.");
			}
			
			// hacemos el metodo reverse para cambiar el orden de la lista.
			
			public void reverse(){
				
				ListaOrdenada.reverse();
				
			}
			
			// hacemos el metodo min para devolver el mas peque�o de la lista segun el comparador.
			
			public int min(){
				
				return.MAX_SIZE;
			}			
			
			}
			
		}		
		
	}


