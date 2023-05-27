package apis;

import impl.ObjetoAlumno;

public interface ListasDinamicasTDA {
	public void inicializarLista();
	public void agregarElemento(ObjetoAlumno alumno);
	public void eliminarElemento(ObjetoAlumno alumnoEliminar);

}
