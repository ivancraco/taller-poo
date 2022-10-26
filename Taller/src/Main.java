import modelo.Biblioteca;
import modelo.CodigoDeBarra;
import vista.Login;

/**
 * Clase principal para ejecutar la aplicacion.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
 */
public class Main {
    public static void main(String[] args) {
        CodigoDeBarra codigo = new CodigoDeBarra();
        codigo.generarCodigo(Biblioteca.obras());
        Login biblioteca = new Login();
        biblioteca.setVisible(true);
    }
}
