package ejecucion;
import impl.*;
import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		ListasDinamicas listaAlumnos = new ListasDinamicas();
		
		
		listaAlumnos.inicializarLista();
		
		
		System.out.println("Agregar Alumnos \n ");
	
			System.out.println(">> Ingrese el legajo o -1 para finalizar la carga: \n ");
			String legajo = myScanner.nextLine();
			
			
			while(!legajo.equals("-1")) {
				System.out.println(">> Ingrese el nombre:  \n ");
				String nombre = myScanner.nextLine();
				System.out.println(">> Ingrese el apellido:  \n ");
				String apellido = myScanner.nextLine();
				ObjetoAlumno alumno = new ObjetoAlumno(nombre,apellido,legajo);
				listaAlumnos.agregarElemento(alumno);
				System.out.println(">> ingrese el legajo o -1 para finalizar la carga: \n ");
				legajo = myScanner.nextLine();
			}
			
			//ListasDinamicas listaAlumnosOrdeanada = ListasDinamicas.ordenarLista(listaAlumnos);
			imprimirLista(listaAlumnos);
			
		
			System.out.println(">> Desea eliminar algun alumno? (ingrese si o no)\n ");
			String opcion = myScanner.nextLine();
			if(opcion.equals("si") || opcion.equals("Si")|| opcion.equals("SI")) {
				System.out.println(">> ingrese el legajo a eliminar \n ");
				String legajoEliminar = myScanner.nextLine();
				ObjetoAlumno legajoObjeto = listaAlumnos.obtenerAlumno(legajoEliminar);
				listaAlumnos.eliminarElemento(legajoObjeto);
			}
			if(opcion.equals("no") || opcion.equals("No")|| opcion.equals("NO")) {
				System.out.println(">> Finalizo la carga de alumnos \n ");
				
			}
			
		ListasDinamicas listaAlumnosOrdeanada = listaAlumnos.ordenarLista(listaAlumnos);
		imprimirLista(listaAlumnosOrdeanada);
		

	}
		
	public static void imprimirLista(ListasDinamicas listaAlumnos) {
		Nodo aux = listaAlumnos.primerNodo;
		while (aux.haySiguiente()) {
		System.out.println("*" +aux.alumno.nombre+ " " + aux.alumno.apellido +"/" + aux.alumno.legajo + "\n");
	        aux = aux.siguiente();	
		   }
		}

	
}
