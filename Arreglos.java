package fes.aragon.arreglos;

import java.util.Arrays;

public class Arreglos {
	private int longitud;
	private int[] elementos; 
	private int tamanio; 
	
	//constructor
	public Arreglos(int tamanio) {
		this.tamanio= tamanio; 
		this.elementos=new int[tamanio]; 
	}

	//metodos 
	public int getLongitud() {
		return tamanio;
	}

	public void setLongitud(int longitud) {
		this.longitud = tamanio;
	}

	public int getElementos(int indice) {
		return elementos[indice];
	}

	public void setElementos(int indice, int valor) {
		this.elementos[indice]=valor;
	}
	
	
	
	
	void limpiar(int valor) {
		for(int i=0;i<tamanio;i++)
			this.elementos[i]=valor; 
	}

	@Override
	public String toString() {
		return "Arreglos [longitud=" + longitud + ", elementos=" + Arrays.toString(elementos) + ", tamanio=" + tamanio
				+ ", getLongitud()=" + getLongitud() + "]";
	}




	

	
	
	
	
	
	

	
	
	
	
	
	
	
	

	
}
