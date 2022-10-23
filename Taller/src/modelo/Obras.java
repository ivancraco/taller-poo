package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

                List<String> indices = new ArrayList<String>();
                indices.add("Sumar");
                indices.add("Restar");
                indices.add("Multiplicación");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-03"), "Compra",
                                 "0103101", "", "384561");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-05"), "Compra",
                                 "0103102", "", "865492");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-03-05"), "Compra",
                                "0103103", "", "635012");
                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                
                Obra obra = new Obra("Matemática", "Matemática", "Matemáticas para todos", "Matemática de la suerte",
                "Adrián Paenza", " Guillermo Schavelzon", "", Genero.DIDACTICO, "manuales",
                "978-950-07-4039-5", indices, new Edicion("Printing Books S.A",
                "Argentina", 1, 2012, 50, 349, "Español", "papel"),
                ejemplares);

                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                
                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);
                ejemplares.get(2).setObra(obra);
                return obra;

        }

        public Obra obra2() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Tipos de datos");
                indices.add("Clases e interfaces");


                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-03"), "Compra",
                                 "0912038", "", "343434");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-05"), "Compra",
                                 "0912032", "", "353535");

                ejemplares.add(e1);
                ejemplares.add(e2);

                Obra obra = new Obra("Programación", "Java", "Programación Inicial", "Todos podemos programar",
                                "Victor Smith", "Ernesto Robles", "Marta Quevedo", Genero.DIDACTICO, "manuales",
                                "876-592-13-7890-3", indices, new Edicion("Printing Books S.A",
                                                "Argentina", 1, 2014, 50, 559, "Español", "papel"),
                                ejemplares);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);

                return obra;

        }

        public Obra obra3() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Tipos de datos");
                indices.add("Variables locales");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-03"), "Compra",
                                 "1202034", "", "343434");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-05"), "Compra",
                                 "1202033", "", "353535");

                ejemplares.add(e1);
                ejemplares.add(e2);

                Obra obra = new Obra("Programación", "Python", "Programación Inicial", "Todos podemos programar",
                                "Michael Rockefeller", "Ana Montero", "Isaias Montenegro", Genero.DIDACTICO, "manuales",
                                "876-592-13-7890-3", indices, new Edicion("Printing Books S.A",
                                                "Argentina", 1, 2014, 50, 559, "Español", "papel"),
                                ejemplares);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);               

                return obra;

        }

        public static void ordenarLista1() {
               Biblioteca.obras().sort(((o1, o2) -> o2.getSolicitadasAlumnosDocentes()
               .compareTo(o1.getSolicitadasAlumnosDocentes())));
        }

        public static void ordenarLista2() {
                Biblioteca.obras().sort(((o1, o2) -> o2.getSolicitadasPublicoGeneral()
                .compareTo(o1.getSolicitadasPublicoGeneral())));
        }

        



}
