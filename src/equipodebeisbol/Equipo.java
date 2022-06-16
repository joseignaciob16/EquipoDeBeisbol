package equipodebeisbol;

/** @author Jose Ignacio */

public class Equipo {
    
 private ListasEnlazadas lista;
    private Busqueda busqueda;
    private Ordenamiento ordenamiento;

    public Equipo() {
        this.lista = new ListasEnlazadas();
        this.busqueda = new Busqueda(lista);
        this.ordenamiento = new Ordenamiento(lista);
    }

    public boolean agregarJugador(Nodo nodo, String pos) {
        if (buscarJugador(nodo.getJugador().getIdentificacion()) == null) {
            if (pos.equalsIgnoreCase("inicio")) {
                this.lista.agregarAlPrincipio(nodo);
            } else if (pos.equalsIgnoreCase("final")) {
                this.lista.agregarAlFinal(nodo);
            }
            return true;
        }
        return false;
    }

    public void agregarJugador(Nodo nodoSeleccionado, Nodo nuevoNodo) {
        this.lista.agregarDespuesDe(nodoSeleccionado, nuevoNodo);
    }

    public void ordenarLista() {
        this.ordenamiento.ordenar();
    }

    public Nodo buscarJugador(String nombreOID) {
        return this.busqueda.buscarJugador(nombreOID);
    }

    public void eliminarJugador(Nodo nodo) {
        this.lista.eliminar(nodo);
    }

    public ListasEnlazadas getLista() {
        return this.lista;
    }
}
