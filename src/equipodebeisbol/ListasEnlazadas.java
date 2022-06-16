package equipodebeisbol;

/** @author Jose Ignacio */

public class ListasEnlazadas {
    
 private Nodo cabeza;
    private int tam;

    public ListasEnlazadas() {
        this.cabeza = null;
        this.tam = 0;
    }

    public int getTam() {
        return this.tam;
    }

    private void setCabeza(Nodo nodo) {
        this.cabeza = nodo;
    }

    public Nodo getCabeza() {
        return this.cabeza;
    }

    private Nodo getUltimoNodo() {

        Nodo temp = cabeza;

        while (temp != null) {
            if (temp.getSiguienteNodo() == null) {
                break;
            } else {
                temp = temp.getSiguienteNodo();
            }
        }
        return temp;
    }

    public void agregarAlPrincipio(Nodo nodo) {

        if (cabeza == null) {
            this.cabeza = nodo;
        } else {
            nodo.setSiguienteNodo(this.cabeza);
            this.setCabeza(nodo);
        }
        this.tam++;
    }

    public void agregarAlFinal(Nodo nodo) {

        if (cabeza == null) {
            this.cabeza = nodo;
        } else {
            this.getUltimoNodo().setSiguienteNodo(nodo);
        }
        this.tam++;
    }

    public void agregarDespuesDe(Nodo nodop, Nodo nuevo) {

        nuevo.setSiguienteNodo(nodop.getSiguienteNodo());
        nodop.setSiguienteNodo(nuevo);
        this.tam++;
    }

    public void eliminar(Nodo nodo) {

        if (this.cabeza == nodo) {
            this.setCabeza(this.cabeza.getSiguienteNodo());
        } else {

            Nodo temp = this.cabeza;

            while (temp.getSiguienteNodo() != nodo) {
                temp = temp.getSiguienteNodo();
            }

            temp.setSiguienteNodo(nodo.getSiguienteNodo());
            nodo.setSiguienteNodo(null);
            this.tam--;
        }
    }
 
 }
