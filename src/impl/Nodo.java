package impl;

public class Nodo {
	
	
	public ObjetoAlumno alumno;
	public Nodo puntero; // a quien apunta
	
	
	public Nodo(ObjetoAlumno alumno){ //inicializo un nodo nuevo, va apuntar a null
		this.alumno = alumno;
		this.puntero = null;
		
	}
	
	public boolean haySiguiente() {//Determina si hay un siguiente o no
		return(puntero!= null);
		
	} //determina si el puntero de ese nodo apunta a null o a otro nodo
		
	public Nodo siguiente() {
		if(haySiguiente()) {
		return puntero;
			
		}else {
			return null;
		}
		
		
		

	}
	
	

	

}
