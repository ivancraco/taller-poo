package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lectores {
        private List<Lector> lectores;

        public Lectores() {

                lectores = new ArrayList<Lector>();

                lectores.add(new Lector("Adrián", "Perez", TipoLector.ALUMNO,
                                "40125645", "AdriPerez@gmail.com", "5515384756",
                                LocalDate.parse("1997-05-10"), "Masculino", "Argentina",
                                new Domicilio("Calle alegría 123", 3220, "Federación",
                                                "Concordia")));

                lectores.add(new Lector("Ana", "Palacios", TipoLector.DOCENTE,
                                "33897556", "AnaPalacios@gmail.com", "5515886754",
                                LocalDate.parse("1986-03-10"), "Femenino", "Argentina",
                                new Domicilio("Santa Teresita 125", 3220, "Federación",
                                                "Concordia")));

                lectores.add(new Lector("Ezequiel", "Leiva", TipoLector.DOCENTE,
                                "32409233", "EzequielLeiva@gmail.com", "5515337596",
                                LocalDate.parse("1985-09-25"), "Masculino", "Argentina",
                                new Domicilio("Yrigoyen 25", 3228, "Federación",
                                                "Chajarí")));

                lectores.get(0).getPrestamoLector().add(new Prestamo());
                lectores.get(0).getPrestamoLector().get(0).setFechaYHoraPrestamo("10/10/2022");
                lectores.get(0).getPrestamoLector().get(0).setFuncionario("Roberto Perez");
                lectores.get(0).getPrestamoLector().get(0).setFechaDevolucion(LocalDate.of(2022, 10, 14));
                lectores.get(0).getPrestamoLector().get(0).setLugarPrestamo("Domicilio");
                lectores.get(0).getPrestamoLector().get(0).setLector(lectores.get(0));
                lectores.get(0).getPrestamoLector().get(0).setEjemplar(Biblioteca.obras().get(0).getEjemplar().get(2));
                Biblioteca.obras().get(0).getEjemplar().get(2).setPrestamoEjemplar(lectores.get(0).getPrestamoLector().get(0));
        }

        public List<Lector> getLectores() {
                return lectores;
        }

        public void setLectores(List<Lector> lectores) {
                this.lectores = lectores;
        }

}
