import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public static void main(String[] args) throws Exception {


        Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-03"),"Compra",
        "Matemática",1,"","34-34-34");

        Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-05"),"Compra",
        "Matemática",2,"","35-35-35");

        List<Ejemplar> ejemplarList = new ArrayList<Ejemplar>();
        ejemplarList.add(e1);
        ejemplarList.add(e2);

        Obra o1 = new Obra("Matemática","Matemáticas para todos","Matemática de la suerte",
        "Adrián Paenza"," Guillermo Schavelzon", "", Genero.DIDACTICO, "manuales",
        "978-950-07-4039-5", "55", "10-5-3-10", new Edicion("Printing Books S.A",
        "Argentina", 1, 2012, 50, 349, "Español", "papel"),
        ejemplarList);











        System.out.println(o1.toString());

    }
}
