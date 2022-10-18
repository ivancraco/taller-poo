package modelo;

import java.util.List;

import vista.Funcionario;

public class Biblioteca {

        private static Obras obras = new Obras();
        private static Lectores lectores = new Lectores();
        private Funcionario funcionario;
       
        public Biblioteca() {
                funcionario = new Funcionario();
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
