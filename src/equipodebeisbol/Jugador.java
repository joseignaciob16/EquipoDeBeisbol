package equipodebeisbol;

/** @author Jose Ignacio */

public class Jugador {

    private String nombre, identificacion;
    private int edad;
    private Posicion posicion;
    private float promedio;

    public Jugador() {
        identificacion = "";
        nombre = "";
        edad = 0;
        posicion = null;
        promedio = 0;
    }
    
    public Jugador(String Id, String nombre, int edad, Posicion posicion, float promedio){
    this.identificacion=Id;
    this.nombre = nombre;
    this.edad = edad;
    this.posicion = posicion;
    this.promedio = promedio;      
    }

   public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
   
    @Override
    public String toString(){
     return this.getNombre()+ ", " + this.getIdentificacion() + ", " + this.getEdad() + ", " + this.posicion + ", " + this.promedio;
    }

}
