package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que mantiene en una lista la cantidad
 * de obras disponibles en la biblioteca.
 * 
 * @author Ivan Craco
 */
public class Obras {

        private List<Obra> obras;

        /**
         * Constructor que inicializa una lista y almacena todas las obras
         */
        public Obras() {
                obras = new ArrayList<Obra>();
                obras.add(obra1());
                obras.add(obra2());
                obras.add(obra3());
                obras.add(obra4());
                obras.add(obra5());
                obras.add(obra6());
                obras.add(obra7());
                obras.add(obra8());
                obras.add(obra9());
                obras.add(obra10());
                obras.add(obra11());
                obras.add(obra12());
                obras.add(obra13());
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
                                "876-592-13-7890-3", indices, new Edicion("Libro",
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
                                "876-592-13-7890-3", indices, new Edicion("Ejemplo",
                                                "Argentina", 1, 2014, 50, 559, "Español", "papel"),
                                ejemplares);

                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);

                return obra;

        }

        public Obra obra4() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Vinculos");
                indices.add("Apego");
                indices.add("La actitud");
                indices.add("La Alegria");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-06"), "Compra",
                                "0514466", "", "246546");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-06"), "Compra",
                                "0514465", "", "865492");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-03-06"), "Compra",
                                "0514464", "", "354735");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-03-06"), "Compra",
                                "0514463", "", "453578");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-03-06"), "Compra",
                                "0514462", "", "272682");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);

                Obra obra = new Obra("AutoAyuda", "Ayuda", "Gente Nutritiva",
                                "Como son las personas que sanan y motivan nuestra vida y como ser una de ellas",
                                "Bernardo Stamateas", "", "", Genero.DIDACTICO, "Manuales",
                                "535-835-94-1465-5", indices, new Edicion("Penguin Ramdom Haouse",
                                                "Argentina", 1, 2021, 1, 188, "Español", "papel"),
                                ejemplares);

                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);
                ejemplares.get(2).setObra(obra);
                ejemplares.get(3).setObra(obra);
                ejemplares.get(4).setObra(obra);
                return obra;

        }

        public Obra obra5() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("La Administracion");
                indices.add("Los Sistemas");
                indices.add("La Niveles Jerarquicos");
                indices.add("Funciones Administrativas");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-08"), "Compra",
                                "9342119", "", "937583");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-08"), "Compra",
                                "9342118", "", "828462");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-03-08"), "Compra",
                                "9342117", "", "335485");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-03-08"), "Compra",
                                "9342116", "", "384575");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-03-08"), "Compra",
                                "9342115", "", "353527");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);

                Obra obra = new Obra("Administración", "Empresas", "La Administracion de Empresas", "",
                                "Alvarez Hector", "", "", Genero.DIDACTICO, "Manuales",
                                "745-846-29-9537-7", indices, new Edicion("Eudecor",
                                                "Argentina", 1, 2000, 50, 325, "Español", "papel"),
                                ejemplares);

                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);
                ejemplares.get(2).setObra(obra);
                ejemplares.get(3).setObra(obra);
                ejemplares.get(4).setObra(obra);
                return obra;

        }

        public Obra obra6() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Polinomios");
                indices.add("Matrices");
                indices.add("Logica");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-05-08"), "Compra",
                                "8533503", "", "935763");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-05-08"), "Compra",
                                "8533504", "", "649237");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-05-08"), "Compra",
                                "8533505", "", "846728");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-05-08"), "Compra",
                                "8533506", "", "763846");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-05-08"), "Compra",
                                "85335037", "", "387535");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);

                Obra obra = new Obra("Algebra", "Matematicas", "Calculo Numerico II", "",
                                "Georgina Estelar", "", "", Genero.DIDACTICO, "Manuales",
                                "953-935-76-7385-3", indices, new Edicion("BrainMath",
                                                "España", 1, 1997, 50, 325, "Español", "papel"),
                                ejemplares);

                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);
                ejemplares.get(2).setObra(obra);
                ejemplares.get(3).setObra(obra);
                ejemplares.get(4).setObra(obra);
                return obra;

        }

        public Obra obra7() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Circuitos");
                indices.add("Electronica");
                indices.add("Electricidad");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-05-02"), "Compra",
                                "9538553", "", "424242");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-05-02"), "Compra",
                                "9538554", "", "822882");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-05-02"), "Compra",
                                "9538555", "", "485474");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-05-02"), "Compra",
                                "9538556", "", "294738");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-05-02"), "Compra",
                                "9538557", "", "294563");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);

                Obra obra = new Obra("Arquitectura", "Computacion", "Hardware de Computadoras",
                                "Como son y funcionan las maquinas de hoy en dia",
                                "Emanuel Tadeo Berileonte", "", "", Genero.DIDACTICO, "Manuales",
                                "585-387-13-5835-6", indices, new Edicion("Marfil Industruia",
                                                "Argentina", 1, 2017, 50, 350, "Español", "papel"),
                                ejemplares);

                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);
                ejemplares.get(2).setObra(obra);
                ejemplares.get(3).setObra(obra);
                ejemplares.get(4).setObra(obra);
                return obra;

        }

        public Obra obra8() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Libro Diario");
                indices.add("Cuentas");
                indices.add("Registros");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-05-10"), "Compra",
                                "8543031", "", "947291");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-05-10"), "Compra",
                                "8543032", "", "209532");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-05-10"), "Compra",
                                "8543033", "", "194732");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-05-02"), "Compra",
                                "8543034", "", "395632");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-05-02"), "Compra",
                                "8543035", "", "184357");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);

                Obra obra = new Obra("Contabilidad", "Documentos", "Contabilidad y Finanzas", "",
                                "Graciela Echague", "", "", Genero.DIDACTICO, "Manuales",
                                "042-395-63-9346-3", indices, new Edicion("Eudecor",
                                                "Argentina", 1, 2012, 50, 350, "Español", "papel"),
                                ejemplares);

                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);
                ejemplares.get(2).setObra(obra);
                ejemplares.get(3).setObra(obra);
                ejemplares.get(4).setObra(obra);
                return obra;

        }

        public Obra obra9() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Redes Inalambricas");
                indices.add("Tipos de Conexiones");
                indices.add("Protocolo HTTPS");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-05-20"), "Compra",
                                "2946521", "", "245873");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-05-20"), "Compra",
                                "2946522", "", "240675");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-05-20"), "Compra",
                                "2946523", "", "492792");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-05-20"), "Compra",
                                "2946524", "", "485638");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-05-20"), "Compra",
                                "29465215", "", "482946");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);

                Obra obra = new Obra("Redes", "Internet", "Comunicaciones y Redes", "El mundo de la tecnologia",
                                "Maximiliano Gregorio", "Exequiel Mendieta", "", Genero.DIDACTICO, "Manuales",
                                "495-653-92-2946-2", indices, new Edicion("TroyaBabbel",
                                                "Argentina", 1, 2012, 100, 350, "Español", "papel"),
                                ejemplares);

                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);
                ejemplares.get(2).setObra(obra);
                ejemplares.get(3).setObra(obra);
                ejemplares.get(4).setObra(obra);
                return obra;

        }

        public Obra obra10() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Historia Regional");
                indices.add("Geografia Argentina");
                indices.add("Ecologia y Medio Anbiente");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-05-13"), "Compra",
                                "4830155", "", "638363");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-05-13"), "Compra",
                                "4830156", "", "485281");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-05-13"), "Compra",
                                "4830157", "", "485729");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-05-13"), "Compra",
                                "4830158", "", "385692");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-05-13"), "Compra",
                                "4830159", "", "296520");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);

                Obra obra = new Obra("Turismo", "Argentina", "Argentina en Todo su esplandor", "",
                                "Gorge Morales", "Mariela Flores", "", Genero.DIDACTICO, "Manuales",
                                "563-862-84-5395-6", indices, new Edicion("TroyaBabbel",
                                                "Argentina", 1, 2012, 100, 350, "Español", "papel"),
                                ejemplares);

                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);
                ejemplares.get(2).setObra(obra);
                ejemplares.get(3).setObra(obra);
                ejemplares.get(4).setObra(obra);
                return obra;

        }

        public Obra obra11() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Turismo General");
                indices.add("Derecho civil y comercial");
                indices.add("legislacion Turistica");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-05-25"), "Compra",
                                "8534962", "", "472097");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-05-25"), "Compra",
                                "8534963", "", "472074");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-05-25"), "Compra",
                                "8534964", "", "682669");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-05-25"), "Compra",
                                "8534965", "", "395762");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-05-25"), "Compra",
                                "8534966", "", "295538");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);

                Obra obra = new Obra("Turismo", "Geografia", "Un Viaje por el Mundo", "",
                                "Leonardo Villagra", "", "", Genero.DIDACTICO, "Manuales",
                                "563-862-84-5395-6", indices, new Edicion("Marfil Industruia",
                                                "Argentina", 1, 2012, 50, 350, "Español", "papel"),
                                ejemplares);

                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasPublicoGeneral(obra.getSolicitadasPublicoGeneral() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);
                ejemplares.get(2).setObra(obra);
                ejemplares.get(3).setObra(obra);
                ejemplares.get(4).setObra(obra);
                return obra;

        }

        public Obra obra12() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Java");
                indices.add("Python");
                indices.add("C++");
                indices.add("JavaScrip");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-10-25"), "Compra",
                                "9834861", "", "205938");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-10-25"), "Compra",
                                "9834862", "", "453976");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-10-25"), "Compra",
                                "9834863", "", "935024");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-10-25"), "Compra",
                                "9834864", "", "496592");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-10-25"), "Compra",
                                "9834865", "", "394563");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);

                Obra obra = new Obra("Programación", "Lenguajes", "Lenguajes de Programación", "",
                                "Geronimo Lima", "", "", Genero.DIDACTICO, "Manuales",
                                "583-856-36-4295-9", indices, new Edicion("Marfil Industruia",
                                                "Argentina", 1, 2005, 50, 350, "Español", "papel"),
                                ejemplares);

                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);
                ejemplares.get(2).setObra(obra);
                ejemplares.get(3).setObra(obra);
                ejemplares.get(4).setObra(obra);
                return obra;

        }

        public Obra obra13() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("IA");
                indices.add("IT");
                indices.add("Redes Neuronales");
                indices.add("Robotica");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-10-03"), "Compra",
                                "3274351", "", "480155");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-10-03"), "Compra",
                                "3274352", "", "018456");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-10-03"), "Compra",
                                "3274353", "", "496582");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-10-03"), "Compra",
                                "3274354", "", "257353");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-10-03"), "Compra",
                                "3274355", "", "958437");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);

                Obra obra = new Obra("Tecnologia", "IA", "Avances Tecnologicos", "La nueva Era",
                                "Emiliano Melgar", "Jonathan Quiroz", "Agustin Balbuena", Genero.DIDACTICO, "Manuales",
                                "582-273-29-2956-6", indices, new Edicion("Marfil Industruia",
                                                "Argentina", 1, 2005, 50, 350, "Español", "papel"),
                                ejemplares);

                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);
                obra.setSolicitadasAlumnosDocentes(obra.getSolicitadasAlumnosDocentes() + 1);

                ejemplares.get(0).setObra(obra);
                ejemplares.get(1).setObra(obra);
                ejemplares.get(2).setObra(obra);
                ejemplares.get(3).setObra(obra);
                ejemplares.get(4).setObra(obra);
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
