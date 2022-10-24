//import modelo.Biblioteca;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import modelo.Biblioteca;
import modelo.CodigoDeBarra;
import vista.Accion;
// import vista.ConsultaObra;
// import vista.VerificarLector;
import vista.Login;

public class Main {
    public static void main(String[] args) {
        Accion biblioteca = new Accion();
        biblioteca.setVisible(true);
    }
}
