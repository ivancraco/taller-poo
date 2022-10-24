package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

// import vista.Login;
import vista.Login;

public class Biblioteca {

        private static Obras obras = new Obras();
        private static Lectores lectores = new Lectores();
        private Login funcionario;

        public Biblioteca() {
                funcionario = new Login();
        }

        public static String fechaYHoraActual() {
                LocalDateTime fechaActual = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a");
                String nuevoFormato = fechaActual.format(formato);
                return nuevoFormato;
        }

        public static LocalDate parsearFecha(String fecha) {
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate local = LocalDate.parse(fecha, formato);
                return local;
        }

        public static String formatearFecha(String fecha, int plazo) {
                LocalDate local = parsearFecha(fecha);
                local = local.plusDays(plazo);
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String form = local.format(formato);
                return form;
        }

        public static String fechaString(LocalDate local) {
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                return local.format(formato);
        }

        public void setVisible() {
                funcionario.setVisible(true);
        }

        public static List<Obra> obras() {
                return obras.getObras();
        }

        public static List<Lector> lectores() {
                return lectores.getLectores();
        }

        public Login getFuncionario() {
                return funcionario;
        }

        public void setFuncionario(Login funcionario) {
                this.funcionario = funcionario;
        }

}
