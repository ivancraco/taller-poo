//import modelo.Biblioteca;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import modelo.Biblioteca;
import modelo.CodigoDeBarra;
import vista.Accion;
// import vista.ConsultaObra;
//import vista.VerificarLector;

public class Main {
    public static void main(String[] args) {
        // CodigoDeBarra code = new CodigoDeBarra();
        // code.generarCodigo(Biblioteca.obras());
        Accion biblioteca = new Accion();
        biblioteca.setVisible(true);
    }
}
