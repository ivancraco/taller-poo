package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Obras {

        private List<Obra> obras;

        public Obras() {
                obras = new ArrayList<Obra>();
                obras.add(obra1());
                obras.add(obra2());
                obras.add(obra3());
        }

        public List<Obra> getObras() {
                return obras;
        }

        public void setObras(List<Obra> obras) {
                this.obras = obras;
        }

        public Obra obra1() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                Map<Integer, String> indices = Map.ofEntries(
                                Map.entry(0, "Ejemplo 1"),
                                Map.entry(40, "Ejemplo 2"),
                                Map.entry(110, "Ejemplo 3"));

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-03"), "Compra",
                                "Matemática", 1, "", "34-34-34");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-05"), "Compra",
                                "Matemática", 2, "", "35-35-35");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-03-05"), "Compra",
                                "Matemática", 3, "", "36-36-36");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);

                Obra obra = new Obra("Matemática", "Matemáticas para todos", "Matemática de la suerte",
                                "Adrián Paenza", " Guillermo Schavelzon", "", Genero.DIDACTICO, "manuales",
                                "978-950-07-4039-5", indices, "10-5-3-10", new Edicion("Printing Books S.A",
                                                "Argentina", 1, 2012, 50, 349, "Español", "papel"),
                                ejemplares);

                return obra;

        }

        public Obra obra2() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                Map<Integer, String> indices = Map.ofEntries(
                                Map.entry(0, "Ejemplo 1"),
                                Map.entry(99, "Ejemplo 2"),
                                Map.entry(320, "Ejemplo 3"));

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-03"), "Compra",
                                "Java", 1, "", "34-34-34");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-05"), "Compra",
                                "Java", 2, "", "35-35-35");

                ejemplares.add(e1);
                ejemplares.add(e2);

                Obra obra = new Obra("Programación", "Programación Inicial", "Todos podemos programar",
                                "Victor Smith", "Ernesto Robles", "Marta Quevedo", Genero.DIDACTICO, "manuales",
                                "876-592-13-7890-3", indices, "10-7-7-5", new Edicion("Printing Books S.A",
                                                "Argentina", 1, 2014, 50, 559, "Español", "papel"),
                                ejemplares);

                return obra;

        }

        public Obra obra3() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                Map<Integer, String> indices = Map.ofEntries(
                                Map.entry(0, "Ejemplo 1"),
                                Map.entry(120, "Ejemplo 2"),
                                Map.entry(150, "Ejemplo 3"));

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-03"), "Compra",
                                "Python", 1, "", "34-34-34");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-05"), "Compra",
                                "Python", 2, "", "35-35-35");

                ejemplares.add(e1);
                ejemplares.add(e2);

                Obra obra = new Obra("Programación", "Programación Inicial", "Todos podemos programar",
                                "Michael Rockefeller", "Ana Montero", "Isaias Montenegro", Genero.DIDACTICO, "manuales",
                                "876-592-13-7890-3", indices, "10-7-7-5", new Edicion("Printing Books S.A",
                                                "Argentina", 1, 2014, 50, 559, "Español", "papel"),
                                ejemplares);

                return obra;

        }

}
