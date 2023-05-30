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
		
		 while(nodo.haySiguiente()) { //mientras el puntero sea distinto a null
			 nodo = nodo.siguiente(); //variable nodo va guardar el siguiente, y asi, hasta llegar al ultimo nodo, que tiene puntero null 
		 }
		
		 nodo.puntero = newNodo; //cuando el puntero sea igual a null, lo enlazo al nuevoNodo
	}
	size++;
	
}



public void eliminarElemento(ObjetoAlumno alumnoEliminar) {
	
	if (primerNodo != null) {
		
		Nodo aux = primerNodo; 
		Nodo anterior = primerNodo; //su funcion va ser guardar el nodoAnterior al que queremos eliminar
		String legajoEliminar = alumnoEliminar.legajo;
		
		
		while (aux.haySiguiente()) {
			
			if(legajoEliminar.equals (aux.alumno.legajo)) {
				Nodo punteroCambio = aux.siguiente(); //es el puntero del nodo q eliminamos
				System.out.println("*ELIMNINO : " +aux.alumno.nombre + "/" + aux.alumno.legajo + "\n" );
				anterior.puntero = punteroCambio;
				aux = aux.siguiente();
				
				
			}else {
				anterior = aux;
				aux = aux.siguiente();	
				} 
				
			
		}
		
		
	}
			
	
}

public static ListasDinamicas ordenarLista(ListasDinamicas listaAlumnos) {//Ordenamiento Burbujeo
	
	if (listaAlumnos.size > 1) { // si la lista tiene por lo menos 1 nodo
        boolean desordenada = true; // esta desordendad
        while (desordenada){ //mientras este desordenada
            Nodo nodo = listaAlumnos.primerNodo;
            Nodo anterior = null;
            Nodo siguiente = listaAlumnos.primerNodo.siguiente();// el nodo siguiente al que estoy parado
            desordenada = false;
            while ( siguiente != null ) {//mientras el puntero sea distinto a null
                if (nodo.alumno.apellido.compareTo(siguiente.alumno.apellido)>0) { //compara strings a ver cual va primero
                	desordenada = true; // si va antes en orden alfabetico, ordenada = true
                    if ( anterior != null ) { // si hay un anterior
                        Nodo sig = siguiente.puntero; //sig = al siguiente del siguiente
                        anterior.puntero = siguiente; //anterior va apuntar al siguiente
                        siguiente.puntero = nodo; // el siguiente va apuntar a nodo
                        nodo.puntero = sig; //nodo va apuntar al siguiente del siguiente
                    } else {
                        Nodo sig = siguiente.puntero; //si no hay un anterior
                        listaAlumnos.primerNodo = siguiente; //el primerNodo = siguiente
                        siguiente.puntero = nodo; //y el siguiente va apuntar a nodo
                        nodo.puntero = sig; //nodo va apuntar al siguiente del siguiente
                    }
                    //si no va antes en el alfabeto
                    anterior = siguiente; //anterior = siguiente
                    siguiente = nodo.puntero; //siguiente va a apuntar al que apunte nodo
                } else { //si el siguiente es menor en el alfabeto
                    anterior = nodo; // anterior = nodo
                    nodo = siguiente; //nodo = siguiente
                    siguiente = siguiente.puntero; // siguiente = al siguiente del siguiente
                }
            } 
        } desordenada = false;
        
        
    }
	return listaAlumnos;
                       }

}


