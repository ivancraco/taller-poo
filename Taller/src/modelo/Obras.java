package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que mantiene en una lista la cantidad
 * de obras disponibles en la biblioteca.
 * 
 * @author Ivan Craco, Emanuel Bozzo, Emilio Loggio Said, Jesus Casabillanos
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
                obras.add(obra14());
                obras.add(obra15());
                obras.add(obra16());
                obras.add(obra17());
                obras.add(obra18());
                obras.add(obra19());
                obras.add(obra20());
                obras.add(obra21());
                obras.add(obra22());
                obras.add(obra23());
                obras.add(obra24());
                obras.add(obra25());
                obras.add(obra26());
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

        public Obra obra14() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Funcion Lineal");
                indices.add("Funcion Cuadratica");
                indices.add("Funcion Exponencial");
                indices.add("Funcion Racional");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-10-13"), "Compra",
                                "4632895", "", "632046");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-10-13"), "Compra",
                                "4632894", "", "496573");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-10-13"), "Compra",
                                "4632893", "", "865352");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-10-13"), "Compra",
                                "4632892", "", "596482");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-10-13"), "Compra",
                                "4632891", "", "456592");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);

                Obra obra = new Obra("Matemática", "Funciones", "Analisis Matematico I", "Calculo I",
                                "Jose L.Ponte", "", "", Genero.DIDACTICO, "Manuales",
                                "966-573-37-5956-5", indices, new Edicion("TroyaBabbel",
                                "Argentina", 1, 2013, 50, 350, "Español", "papel"),
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
        
        public Obra obra15() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Sistemas de control");
                indices.add("Sistemas Financieros");
                indices.add("Sistemas Compras");
                indices.add("Sistemas de Almacenamiento");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-10-20"), "Compra",
                                "4765576", "", "342372");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-10-20"), "Compra",
                                "4765577", "", "456201");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-10-20"), "Compra",
                                "4765578", "", "854292");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-10-20"), "Compra",
                                "4765579", "", "358915");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-10-20"), "Compra",
                                "4765570", "", "765253");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-10-20"), "Compra",
                                "4765571", "", "385462");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-10-20"), "Compra",
                                "4765572", "", "374465");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);

                Obra obra = new Obra("Administración", "Empresas", "Los Sistemas dentro de la Empresa", "",
                                "Fabian Tisocco", "", "", Genero.DIDACTICO, "Manuales",
                                "476-857-48-8456-2", indices, new Edicion("TroyaBabbel",
                                "Argentina", 1, 2022, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                
                return obra;

        }
        
        public Obra obra16() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Que es un Algoritmo");
                indices.add("Tipo de Datos");
                indices.add("Bucles");
                indices.add("Deciciones");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3877567", "", "928452");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3877566", "", "387246");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "38775635", "", "395732");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3877564", "", "832462");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3877563", "", "935398");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3877562", "", "437638");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3877561", "", "284764");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);

                Obra obra = new Obra("Programación", "algoritmos", "Programacion para principiantes I", "",
                                "Thiago Perez", "", "", Genero.DIDACTICO, "Manuales",
                                "476-857-48-8456-2", indices, new Edicion("Marfil Industria",
                                "Argentina", 1, 2010, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                return obra;

        }
        
        public Obra obra17() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Que es POO");
                indices.add("Clases");
                indices.add("Metodos");
                indices.add("Herencia");
                indices.add("Polimorfismo");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "7454538", "", "624582");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "7454537", "", "478653");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "7454536", "", "389571");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "7454535", "", "387212");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "7454534", "", "846329");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "7454533", "", "378952");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "7454532", "", "737448");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);

                Obra obra = new Obra("Programación", "Objetos", "Programacion Orientada a Objetos", "Modelo de la Vida",
                                "Martin Neruda", "", "", Genero.DIDACTICO, "Manuales",
                                "286-836-95-4663-3", indices, new Edicion("TroyaBabbel",
                                "Argentina", 1, 2010, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                return obra;

        }
        
        public Obra obra18() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Arrays");
                indices.add("Matrices");
                indices.add("Listas");
                indices.add("Pilas");
                indices.add("Arboles");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3765397", "", "573678");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3765396", "", "673452");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3765395", "", "724687");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3765394", "", "354385");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3765393", "", "636745");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3765392", "", "874634");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-05-01"), "Compra",
                                "3765391", "", "457362");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);

                Obra obra = new Obra("Programación", "algoritmos", "Programacion para principiantes II", "",
                                "Thiago Perez", "", "", Genero.DIDACTICO, "Manuales",
                                "726-389-94-2462-7", indices, new Edicion("Marfil Industria",
                                "Argentina", 1, 2010, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                return obra;
        }
        
        public Obra obra19() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Remitos");
                indices.add("Cheques Endosados");
                indices.add("Cuentas");
                indices.add("Libro Diario");
                indices.add("Debe y Haber");

                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-05-26"), "Compra",
                                "3276647", "", "734637");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-05-26"), "Compra",
                                "3276646", "", "985387");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-05-26"), "Compra",
                                "3276645", "", "427485");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-05-26"), "Compra",
                                "3276644", "", "735353");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-05-26"), "Compra",
                                "3276643", "", "478357");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-05-26"), "Compra",
                                "3276642", "", "875375");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-05-26"), "Compra",
                                "3276641", "", "354634");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);

                Obra obra = new Obra("Contabilidad", "", "Contabilidad de Costos", "",
                                "Mariela j.Nuñez", "", "", Genero.DIDACTICO, "Manuales",
                                "357-874-63-8657-2", indices, new Edicion("Eudecor",
                                "Argentina", 1, 2010, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                return obra;

        }
        
        public Obra obra20() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Seguridad Informatica");
                indices.add("Haking Etico");
                indices.add("Medidas de Seguridad");
               
                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "5376583", "", "785426");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "5376584", "", "783567");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "5376585", "", "732632");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "5376586", "", "782476");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "5376587", "", "457628");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "5376588", "", "762472");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "5376589", "", "723482");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);

                Obra obra = new Obra("Programación", "Hackeo", "Hackers", "",
                                "Isaias Stele", "", "", Genero.DIDACTICO, "Manuales",
                                "847-465-84-4763-7", indices, new Edicion("Eudecor",
                                "Argentina", 1, 2010, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                return obra;

        }
        
        public Obra obra21() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Corriente Continua y Alterna");
                indices.add("Voltaje");
                indices.add("Componentes Electronicos");
               
                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7624233", "", "732576");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7624234", "", "476432");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7624235", "", "749452");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7624236", "", "484722");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7624237", "", "875321");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7624238", "", "387532");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7624239", "", "358787");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);

                Obra obra = new Obra("Arquitectura", "Electronica", "Tecnicas Digitales", "",
                                "Emanuel Benitez", "Lucas Mandala", "", Genero.DIDACTICO, "Manuales",
                                "265-877-63-4762-9", indices, new Edicion("Eudecor",
                                "Argentina", 1, 2010, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                return obra;

        }
        
        public Obra obra22() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Relacion");
                indices.add("Amigos");
                indices.add("Influencia");
               
                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8274983", "", "782476");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8274984", "", "276467");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8274985", "", "375476");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8274986", "", "872765");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8274987", "", "783521");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8274988", "", "897352");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8274989", "", "473785");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);

                Obra obra = new Obra("Autoayuda", "Ayuda", "Como hacer amigos e influir en las personas", "",
                                "Angel Gonzalez", "", "", Genero.DIDACTICO, "Manuales",
                                "394-395-75-7096-4", indices, new Edicion("Eudecor",
                                "Argentina", 1, 2010, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                return obra;

        }
        public Obra obra23() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Clases de Empresas");
                indices.add("Organos y Areas de la actividad Empresarial");
                indices.add("La Actividad Economica");
                indices.add("El Contexto");
                indices.add("Responsabilidad social");
        
                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7856321", "", "628745");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7856322", "", "365922");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7856323", "", "873563");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7856324", "", "376563");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7856325", "", "786587");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7856326", "", "365453");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "7856327", "", "387524");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);

                Obra obra = new Obra("Administración", "Empresas", "Actividad Economica: Empresa y Contexto", "",
                                "Fabian Tisocco", "", "", Genero.DIDACTICO, "Manuales",
                                "735-287-92-3250-7", indices, new Edicion("Americana",
                                "Argentina", 1, 2010, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                return obra;

        }
        
        public Obra obra24() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Derivadas");
                indices.add("Primitivas");
                indices.add("Metodos de Integracion");
                indices.add("Raices reales");
                indices.add("Integrales Definidas");
        
                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8737853", "", "873573");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8737854", "", "875362");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8737855", "", "738965");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8737856", "", "547642");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8737857", "", "893535");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8737858", "", "875632");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8737859", "", "897352");
                
                Ejemplar e8 = new Ejemplar(LocalDate.parse("2012-03-10"), "Compra",
                                "8737850", "", "387587");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);
                ejemplares.add(e8);

                Obra obra = new Obra("Matemática", "calculo", "Analisis Matematico II", "",
                                "Gerardo Mandala", "", "", Genero.DIDACTICO, "Manuales",
                                "734-479-47-8742-5", indices, new Edicion("Eudecor",
                                "Argentina", 1, 2010, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                ejemplares.get(7).setObra(obra);
                return obra;

        }
        
        public Obra obra25() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Introduccion a la Informatica");
                indices.add("Programacion Operativos");
                indices.add("Diseño Grafico");
                indices.add("Introduccion al Desarrollo web");
                indices.add("Redes de Datos");
        
                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "3875623", "", "687428");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "3875624", "", "284724");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "3875625", "", "764272");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "3875626", "", "376567");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "3875627", "", "476234");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "3875628", "", "378762");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "3875629", "", "893584");
                
                Ejemplar e8 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "3875620", "", "376852");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);
                ejemplares.add(e8);

                Obra obra = new Obra("Programación", "WEB", "Desarrollo Web", "",
                                "Ignacio Pacifico", "", "", Genero.DIDACTICO, "Manuales",
                                "384-468-95-9653-3", indices, new Edicion("Eudecor",
                                "Argentina", 1, 2010, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                ejemplares.get(7).setObra(obra);
                return obra;

        }
        
        public Obra obra26() {

                List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

                List<String> indices = new ArrayList<String>();
                indices.add("Teorema del Turismo");
                indices.add("Sociologia Del Turismo");
                indices.add("Calidad Turistica");
                indices.add("Planificacion Turistica");
                indices.add("Marketing Turistico");
        
                Ejemplar e1 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "7824658", "", "837653");

                Ejemplar e2 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "7824657", "", "873538");

                Ejemplar e3 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "7824656", "", "387561");

                Ejemplar e4 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "7824655", "", "785362");

                Ejemplar e5 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "7824654", "", "753621");
                
                Ejemplar e6 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "7824653", "", "465245");
                
                Ejemplar e7 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "7824652", "", "387656");
                
                Ejemplar e8 = new Ejemplar(LocalDate.parse("2012-04-20"), "Compra",
                                "7824651", "", "728456");

                ejemplares.add(e1);
                ejemplares.add(e2);
                ejemplares.add(e3);
                ejemplares.add(e4);
                ejemplares.add(e5);
                ejemplares.add(e6);
                ejemplares.add(e7);
                ejemplares.add(e8);

                Obra obra = new Obra("Turismo", "Turismo", "Un Buen Turismo", "",
                                "Marisa Martinez", "", "", Genero.DIDACTICO, "Manuales",
                                "821-685-57-7352-6", indices, new Edicion("Eudecor",
                                "Argentina", 1, 2010, 50, 350, "Español", "papel"),
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
                ejemplares.get(5).setObra(obra);
                ejemplares.get(6).setObra(obra);
                ejemplares.get(7).setObra(obra);
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
