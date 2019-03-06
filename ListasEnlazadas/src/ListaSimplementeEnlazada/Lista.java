package ListaSimplementeEnlazada;

public class Lista {
	public int largo;
	public Dato dato;
	
	
	public int getLargo() {
		return largo;
	}


	public void setLargo(int largo) {
		this.largo = largo;
	}


	public Dato getDato() {
		return dato;
	}


	public void setDato(Dato dato) {
		this.dato = dato;
	}


	public void inicializador () {
		this.setLargo(0);
		this.setDato(null);
		
		
	}
	public void agregarNodo() {
		Nodo nodo = new Nodo();
		this.setLargo((this.getLargo())+1);
		
		 
	}
	

}
