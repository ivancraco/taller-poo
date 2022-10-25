package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import vista.Login;

/**
 * La clase biblioteca representa la clase principal
 * del la aplicación y contiene métodos estaticos para
 * obtener toda la lista obras con sus respectivas listas de
 * ejemplares y la lista de lectores.
 * Tambien contiene métodos estaticos para obtener la fecha y hora
 * actual.
 * 
 * @author Ivan Craco
 * 
 */
public class Biblioteca {

        /**
         * obras representa la lista de Obra de la
         * biblioteca
         */
        private static Obras obras = new Obras();

        /**
         * lectores representa la lista de Lector de
         * la biblioteca
         */
        private static Lectores lectores = new Lectores();

        /**
         * Ventana principal
         */
        private Login funcionario;

        public Biblioteca() {
                funcionario = new Login();
        }

        /**
         * Retorna la fecha y hora actual del sistema en formato cadena.
         * 
         * @return String fecha y hora actual
         */
        public static String fechaYHoraActual() {
                LocalDateTime fechaActual = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a");
                String nuevoFormato = fechaActual.format(formato);
                return nuevoFormato;
        }

        /**
         * 
         * @return Localdate fecha actual
         */
        public static LocalDate fechaActual() {
                String fecha = Biblioteca.fechaYHoraActual();
                String str = fecha.substring(0, 10);
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechaParseada = LocalDate.parse(str, formato);
                return fechaParseada;
        }

        /**
         * @param fecha Una fecha en formato cadena.
         * @return la cadena parseado a un onjeto LocalDate
         */
        public static LocalDate parsearFecha(String fecha) {
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate local = LocalDate.parse(fecha, formato);
                return local;
        }

        /**
         * 
         * @param fecha Una fecha en formato String
         * @param plazo Cantidad de dias a sumar
         * @return fecha ingresada por parámetro con los dias sumados
         */
        public static String formatearFecha(String fecha, int plazo) {
                LocalDate local = parsearFecha(fecha);
                local = local.plusDays(plazo);
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String form = local.format(formato);
                return form;
        }

        /**
         * 
         * @param local fecha en formato LocalDate
         * @return fecha parsead a un objeto String
         */
        public static String fechaString(LocalDate local) {
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                return local.format(formato);
        }

        /**
         * Hace visible la ventana principal
         */
        public void setVisible() {
                funcionario.setVisible(true);
        }

        /**
         * @return listado de obras de la biblioteca
         */
        public static List<Obra> obras() {
                return obras.getObras();
        }

        /**
         * @return listado de lectores de la biblioteca
         */
        public static List<Lector> lectores() {
                return lectores.getLectores();
        }

        /**
         * 
         * @return ventana Login
         */
        public Login getFuncionario() {
                return funcionario;
        }

        /**
         * 
         * @param funcionario establece un nuevo objeto Login
         */
        public void setFuncionario(Login funcionario) {
                this.funcionario = funcionario;
        }

}
