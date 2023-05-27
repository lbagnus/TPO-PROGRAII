package impl;
import apis.ListasDinamicasTDA;

public class ListasDinamicas implements ListasDinamicasTDA{
	
	public Nodo primerNodo; //apunta el primer nodo de la lista
	public int size; //tamanio de la lista
	

	
		
public void inicializarLista() { //ListaEnlazada= secuencia de nodos
	this.primerNodo = null; //no existe todavia el primerNodo, xq esta vacia
	size = 0; //no tiene elementos
	
	
}	

public void agregarElemento(ObjetoAlumno alumno) {
	Nodo newNodo = new Nodo(alumno); //creo un nuevo nodo
	
	
	if(primerNodo == null) {// si la lista esta vacia, osea el puntero = null
		primerNodo = newNodo; // se establece el nuevo como el primerNodo
		
	}
	else { //si la lista no esta vacia
		
		Nodo nodo = primerNodo;// igualo nodo a primerNodo
		
		 while(nodo.siguiente() != null) { //mientras el puntero sea distinto a null
			 nodo = nodo.siguiente(); //variable nodo va guardar el siguiente, y asi, hasta llegar al ultimo nodo, que tiene puntero null 
		 }
		
		 nodo.puntero = newNodo; //cuando el puntero sea igual a null, lo enlazo al nuevoNodo
	}
	size++;
	
}



public void eliminarElemento(ObjetoAlumno alumnoEliminar) {
	
	//FALTAN LAS VERIFICACIONES
	Nodo aux = primerNodo; 
	Nodo anterior = primerNodo; //su funcion va ser guardar el nodoAnterior al que queremos eliminar
	int legajoEliminar = alumnoEliminar.legajo;
	
	
	while (aux != null) {
		
		if(legajoEliminar == aux.alumno.legajo) {
			Nodo punteroCambio = aux.puntero; //es el puntero del nodo q eliminamos
			System.out.println("*ELIMNINO : " +aux.alumno.nombre + "/" + aux.alumno.legajo + "\n" );
			anterior.puntero = punteroCambio;
			aux = aux.puntero;
			
			
		}else {
			anterior = aux;
			aux = aux.puntero;	
			} 
			
		
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
}

}


