package ejecucion;
import impl.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListasDinamicas listaAlumnos = new ListasDinamicas();
		listaAlumnos.inicializarLista();
		
		ObjetoAlumno alumno1 = new ObjetoAlumno("LARA", "BAGNUS",12345);
		listaAlumnos.agregarElemento(alumno1);
		
		ObjetoAlumno alumno2 = new ObjetoAlumno("JULIETA", "GOMEZ",111111);
		listaAlumnos.agregarElemento(alumno2);
		
		ObjetoAlumno alumno3 = new ObjetoAlumno("JERO", "AQUINO",2222);
		listaAlumnos.agregarElemento(alumno3);
		
		ObjetoAlumno alumno4 = new ObjetoAlumno("AGUSTIN", "PAULISE",33333);
		listaAlumnos.agregarElemento(alumno4);
		
		
		//listaAlumnos.eliminarElemento(alumno3);
		ListasDinamicas listaAlumnosOrdeanada = ordenarLista(listaAlumnos);
		imprimirLista(listaAlumnosOrdeanada);
		
			
	}
	
	
	public static ListasDinamicas ordenarLista(ListasDinamicas listaAlumnos) {
		
		if (listaAlumnos.size > 1) { //Ordenamiento Burbujeo
	        boolean desordenada = true;
	        while (desordenada){
	            Nodo actual = listaAlumnos.primerNodo;
	            Nodo anterior = null;
	            Nodo siguiente = listaAlumnos.primerNodo.puntero;
	            desordenada = false;
	            while ( siguiente != null ) {
	                if (actual.alumno.apellido.compareTo(siguiente.alumno.apellido)>0) {
	                	desordenada = true;
	                    if ( anterior != null ) {
	                        Nodo sig = siguiente.puntero;
	                        anterior.puntero = siguiente;
	                        siguiente.puntero = actual;
	                        actual.puntero = sig;
	                    } else {
	                        Nodo sig = siguiente.puntero;
	                        listaAlumnos.primerNodo = siguiente;
	                        siguiente.puntero = actual;
	                        actual.puntero = sig;
	                    }
	                    anterior = siguiente;
	                    siguiente = actual.puntero;
	                } else { 
	                    anterior = actual;
	                    actual = siguiente;
	                    siguiente = siguiente.puntero;
	                }
	            } 
	        } desordenada = false;;
	        
	        
	    }
		return listaAlumnos;
		
		
		}
		
	
	public static void imprimirLista(ListasDinamicas listaAlumnos) {
		Nodo aux = listaAlumnos.primerNodo;
		while (aux != null) {
		System.out.println("*" +aux.alumno.nombre+ " " + aux.alumno.apellido +"/" + aux.alumno.legajo + "\n");
	        aux = aux.puntero;	
		   }
		}

	
}
