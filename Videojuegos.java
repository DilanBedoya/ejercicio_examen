import java.util.ArrayList;
import java.util.List;
public class Videojuegos {
    private int precio;
    public String nombre;
    public int anio;

    public Videojuegos(int precio, String nombre, int anio){
        this.precio=precio;
        this.nombre=nombre;
        this.anio=anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void compra(){
        System.out.println("El videojuego ha sido comprado");
    }


}
class Clasico extends Videojuegos{
    private String autor;

    public Clasico(int precio, String nombre, int anio, String autor) {
        super(precio, nombre, anio);
        this.autor=autor;
    }



    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void historia(){
        System.out.println("La historia ha sido completada");
    }


}
class Zelda extends Clasico{
    private String personaje;
    public Zelda(int precio, String nombre, int anio, String autor, String personaje) {
        super(precio, nombre, anio, autor);
        this.personaje=personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public void saltar(){
        System.out.println("El personaje está saltando");
    }


}

