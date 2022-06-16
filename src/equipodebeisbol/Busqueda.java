package equipodebeisbol;

/** @author Jose Ignacio */

public class Busqueda {
    
    ListasEnlazadas lista;

    public Busqueda(ListasEnlazadas lista) {
        this.lista = lista;
    }

    public Nodo buscarJugador(String busqueda) {

        Nodo nodoTemp = this.lista.getCabeza();

        while (nodoTemp != null) {
            if (nodoTemp.getJugador().getNombre().equalsIgnoreCase(busqueda)
                    || nodoTemp.getJugador().getIdentificacion().equalsIgnoreCase(busqueda)) {
                return nodoTemp;
            }
            nodoTemp = nodoTemp.getSiguienteNodo();
        }

        return null;
    }
}
