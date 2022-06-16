package equipodebeisbol;

/** @author Jose Ignacio */

public class Ordenamiento {
    private ListasEnlazadas lista;

    public Ordenamiento(ListasEnlazadas lista) {
        this.lista = lista;
    }

    public void ordenar() {
        Nodo actual;
        Jugador temp;

        for (int i = 0; i < this.lista.getTam()-1; i++) {
            
            actual = this.lista.getCabeza();
            
            while (actual.getSiguienteNodo() != null) {

                if (actual.getJugador().getPromedio() > actual.getSiguienteNodo().getJugador().getPromedio()) {
                    
                    temp = actual.getJugador();
                    actual.setJugador(actual.getSiguienteNodo().getJugador());
                    actual.getSiguienteNodo().setJugador(temp);
                    
                }
                actual = actual.getSiguienteNodo();
            }
        }
    }
}
