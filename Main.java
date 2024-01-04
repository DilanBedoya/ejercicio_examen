import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args){
        try {
            List<Videojuegos> lista_objetos = new ArrayList<>();
            Videojuegos objeto1=new Videojuegos(25,"Tocho",2003);
            Clasico objeto2=new Clasico(20,"God",2001,"Dilan");
            Zelda objeto3=new Zelda(23,"Zelda",2023,"Dilan","Link");
            lista_objetos.add(objeto1);
            lista_objetos.add(objeto2);
            lista_objetos.add(objeto3);
            System.out.println(lista_objetos.get(0));
        }catch (Exception e){
            System.out.println("Error!");
        }
    }
}