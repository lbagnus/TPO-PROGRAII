package ejecucion;
import impl.*;
import java.util.*;

public class Main {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		ListasDinamicas listaAlumnos = new ListasDinamicas();
		
		
		listaAlumnos.inicializarLista();
		
		System.out.println("A) Agregar Alumnos \n ");
		System.out.println("B) Eliminar Alumnos \n");
		System.out.println(">> Seleccione una opcion: \n");
		
		String opcion = myScanner.nextLine();
		if (opcion.equals("A") || opcion.equals("a")) {
			System.out.println(">> Agregar Alumnos \n ");
			System.out.println(">> ingrese el legajo o -1 para finalizar la carga: \n ");
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
		}if(opcion.equals("B") || opcion.equals("b")) {
			System.out.println(">> ingrese el legajo a eliminar \n ");
			String legajoEliminar = myScanner.nextLine();
			//listaAlumnos.eliminarElemento(alumno3);
			
			
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//ObjetoAlumno alumno1 = new ObjetoAlumno("LARA", "BAGNUS","12345");
		//listaAlumnos.agregarElemento(alumno1);
		
		//ObjetoAlumno alumno2 = new ObjetoAlumno("JULIETA", "GOMEZ","111111");
		//listaAlumnos.agregarElemento(alumno2);
		
		//ObjetoAlumno alumno3 = new ObjetoAlumno("JERO", "AQUINO","2222");
		//listaAlumnos.agregarElemento(alumno3);
		
		
		
		
		
		ListasDinamicas listaAlumnosOrdeanada = ListasDinamicas.ordenarLista(listaAlumnos);
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
