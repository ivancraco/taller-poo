package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import vista.Funcionario;

public class Biblioteca {

        private static Obras obras = new Obras();
        private static Lectores lectores = new Lectores();
        private Funcionario funcionario;
       
        public Biblioteca() {
                funcionario = new Funcionario();
        }

        public static LocalDate parsearFecha(String fecha) {
                LocalDate local = LocalDate.parse(fecha);
                return local;
            }

        public static String formatearFecha(String fecha, int plazo) {
                LocalDate local = parsearFecha(fecha);
                local = local.plusDays(plazo);
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String form = local.format(formato);
                return form;
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

        public Funcionario getFuncionario() {
                return funcionario;
        }

        public void setFuncionario(Funcionario funcionario) {
                this.funcionario = funcionario;
        }



}
