package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lectores {
        private List<Lector> lectores;

        public Lectores() {

                lectores = new ArrayList<Lector>();
                //LectorN°1
                lectores.add(new Lector("Adrián",
                                        "Perez", 
                                        TipoLector.ALUMNO,
                                        "40125645", 
                                        "AdriPerez@gmail.com", 
                                        "5515384756",
                                        LocalDate.parse("1997-05-10"), 
                                        "Masculino", 
                                        "Argentina",
                                        new Domicilio("Calle alegría 123", 3220, 
                                                      "Concordia", "Concordia")));
                //LectorN°2
                lectores.add(new Lector("Ana", 
                                        "Palacios", 
                                        TipoLector.DOCENTE,
                                        "33897556", 
                                        "AnaPalacios@gmail.com", 
                                        "5515886754",
                                        LocalDate.parse("1986-03-10"), 
                                        "Femenino", 
                                        "Argentina",
                                        new Domicilio("Santa Teresita 125", 3229, 
                                                      "Federación", "Villa del Rosario")));
                //LectorN°3
                lectores.add(new Lector("Ezequiel", 
                                        "Leiva", 
                                        TipoLector.DOCENTE,
                                        "32409233", 
                                        "EzequielLeiva@gmail.com", 
                                        "5515337596",
                                        LocalDate.parse("1985-09-25"), 
                                        "Masculino",
                                        "Argentina",
                                        new Domicilio("Yrigoyen 25", 3228, 
                                                      "Federación", "Chajarí")));
                //LectorN°4
                lectores.add(new Lector("Manuel", 
                                        "Peréz", 
                                        TipoLector.PUBLICO_GENERAL, 
                                        "38983222", 
                                        "ManuelPerez20@gmail.com", 
                                        "345403488", 
                                        LocalDate.parse("1991-05-30"), 
                                        "Masculino", 
                                        "Argentina", 
                                        new Domicilio("Saavedra 888", 3212, 
                                                      "Concordia", "Los Charrúas")));
                //LectorN°5
                lectores.add(new Lector("Angelina", 
                                        "Beltran", 
                                        TipoLector.PUBLICO_GENERAL, 
                                        "40963272", 
                                        "AngelinaBeltran@gmail.com", 
                                        "3456048483", 
                                        LocalDate.parse("1997-03-20"), 
                                        "Femenino", 
                                        "Argentina", 
                                        new Domicilio("San Martin 782", 3212, 
                                                      "Concordia", "Los Charrúas")));
                //LectorN°6
                lectores.add(new Lector("Joanna", 
                                        "Dörr", 
                                        TipoLector.ALUMNO, 
                                        "41567812", 
                                        "JoannaDörr@gmail.com", 
                                        "3454709020", 
                                        LocalDate.parse("1995-02-23"), 
                                        "Femenino", 
                                        "Argentina", 
                                        new Domicilio("Andrade 340", 3200, 
                                                      "Concordia", "Concordia")));
                //LectorN°7                                         
                lectores.add(new Lector("Carl", 
                                        "Margraf", 
                                        TipoLector.ALUMNO, 
                                        "40294502", 
                                        "CarlMargraf@gmail.com", 
                                        "3454716543", 
                                        LocalDate.parse("1994-08-12"), 
                                        "Masculino", 
                                        "Argentina", 
                                        new Domicilio("Uquiza 520", 3200, 
                                                      "Concrdia", "Concordia")));
                //LectorN°8
                lectores.add(new Lector("Rodolfo", 
                                        "Cabrera", 
                                        TipoLector.PUBLICO_GENERAL, 
                                        "20397109", 
                                        "RodolfoCabrera@gmail.com", 
                                        "3454774893", 
                                        LocalDate.parse("1969-02-06"), 
                                        "Masculino", 
                                        "Argentina", 
                                        new Domicilio("Tala 1749", 3200, 
                                                      "Concordia", "Concordia")));
                //LectorN°9
                lectores.add(new Lector("Zulma", 
                                        "Neira", 
                                        TipoLector.PUBLICO_GENERAL, 
                                        "17456732", 
                                        "ZulmaNeira65@gmail.com", 
                                        "3454269840", 
                                        LocalDate.parse("1965-09-06"), 
                                        "Femenino", 
                                        "Argentina", 
                                        new Domicilio("Rivadavia 1537", 3200, 
                                                      "Concordia", "Concordia")));
                //LectorN°10
                lectores.add(new Lector("Vanesa", 
                                        "Guantay", 
                                        TipoLector.DOCENTE, 
                                        "31907843", 
                                        "VanesaGuantay82@gmail.com", 
                                        "0345515483159", 
                                        LocalDate.parse("1982-05-24"), 
                                        "Femanino", 
                                        "Argentina", 
                                        new Domicilio("Rivadavia 1054", 3240, 
                                                      "Villaguay", "Villaguay")));
                //LectorN°11
                lectores.add(new Lector("Miguela", 
                                        "Sarmiento", 
                                        TipoLector.DOCENTE, 
                                        "30496768", 
                                        "MiguelaSarmiento@gmail.com", 
                                        "0345615539802", 
                                        LocalDate.parse("1980-06-08"), 
                                        "Femenino", 
                                        "Argentina", 
                                        new Domicilio("Mitre 1925", 3228, 
                                                      "Federación", "Chajarí")));
                //LectorN°12                                           
                lectores.add(new Lector("Ricardo", 
                                        "Chocobar", 
                                        TipoLector.DOCENTE, 
                                        "32504715", 
                                        "RicardoChocobar@gmail.com", 
                                        "3455337834", 
                                        LocalDate.parse("1984-04-19"), 
                                        "Masculino", 
                                        "Argentina", 
                                        new Domicilio("España 749", 3200, 
                                                      "Concordia", "Concordia")));
                //LectorN°13
                lectores.add(new Lector("Aldo", 
                                        "Graco", 
                                        TipoLector.PUBLICO_GENERAL, 
                                        "42123098", 
                                        "AldoGreco@gmail.com", 
                                        "3454936207", 
                                        LocalDate.parse("2000-11-08"), 
                                        "Masculino", 
                                        "Argentina", 
                                        new Domicilio("Montevideo 318", 3200, 
                                                      "concordia", "Concordia")));
                //LectorN°14
                lectores.add(new Lector("Milagro", 
                                        "Salvador", 
                                        TipoLector.ALUMNO, 
                                        "40887381", 
                                        "MilagroSalvador@gmail.com", 
                                        "3454076752", 
                                        LocalDate.parse("2000-02-13"), 
                                        "Femanino", 
                                        "Argentina", 
                                        new Domicilio("Salta 723", 3200, 
                                        "concordia", "Concordia")));
                //LectorN°15
                lectores.add(new Lector("Tomas", 
                                        "Garcia", 
                                        TipoLector.ALUMNO, 
                                        "39756354", 
                                        "TomasGarcia@gmail.com", 
                                        "3456278231", 
                                        LocalDate.parse("1999-07-19"), 
                                        "Masculino", 
                                        "Argentina", 
                                        new Domicilio("Brown 2352", 3200, 
                                        "concordia", "Concordia")));
                //LectorN°16
                lectores.add(new Lector("Paulina", 
                                        "Nuñez", 
                                        TipoLector.ALUMNO, 
                                        "41034867", 
                                        "PaulinaNuñez@gmail.com", 
                                        "3455234344", 
                                        LocalDate.parse("1998-03-21"), 
                                        "Femanino", 
                                        "Argentina", 
                                        new Domicilio("Echagüe 949", 3200, 
                                        "concordia", "Concordia")));
                //LectorN°17                                      
                lectores.add(new Lector("Javier", 
                                        "Guerrero", 
                                        TipoLector.ALUMNO, 
                                        "45263251", 
                                        "JavierGuerrero@gmail.com", 
                                        "3454987630", 
                                        LocalDate.parse("2003-10-15"), 
                                        "Masculino", 
                                        "Argentina", 
                                        new Domicilio("Maipú 1736", 3200, 
                                        "concordia", "Concordia")));
                //LectorN°18
                lectores.add(new Lector("Rafael", 
                                        "Zalazar", 
                                        TipoLector.ALUMNO, 
                                        "40012872", 
                                        "RafaelZalazar13@gmail.com", 
                                        "345481062", 
                                        LocalDate.parse("1997-11-13"), 
                                        "Masculino", 
                                        "Argentina", 
                                        new Domicilio("Peru 1377", 3200, 
                                        "concordia", "Concordia")));
                //LectorN°19
                lectores.add(new Lector("Marisa", 
                                        "Pons", 
                                        TipoLector.ALUMNO, 
                                        "46984394", 
                                        "MarisaPons04@gmail.com", 
                                        "3454907593", 
                                        LocalDate.parse("2004-06-04"), 
                                        "Femanino", 
                                        "Argentina", 
                                        new Domicilio("Diamante 467", 3200, 
                                        "concordia", "Concordia")));
                //LectorN°20
                lectores.add(new Lector("Daniela", 
                                        "Orieta", 
                                        TipoLector.ALUMNO, 
                                        "43828412", 
                                        "DanielaOrieta01@gmail.com", 
                                        "3454097413", 
                                        LocalDate.parse("2001-10-27"), 
                                        "Femenino", 
                                        "Argentina", 
                                        new Domicilio("Ituzaingo 1284", 3200, 
                                        "concordia", "Concordia")));

                lectores.get(0).getPrestamoLector().add(new Prestamo(
                                "05/09/2022",
                                "Roberto Perez",
                                LocalDate.of(2022, 9, 9),
                                "Domicilio",
                                Biblioteca.obras().get(0).getEjemplar().get(2),
                                lectores.get(0)));
                Biblioteca.obras().get(0).getEjemplar().get(2)
                                .setPrestamoEjemplar(lectores.get(0).getPrestamoLector().get(0));


                lectores.get(0).setMulta(new Multa(15, new Devolucion("14/09/2022", "pepe")));
                String fec = Biblioteca.formatearFecha(
                                lectores.get(0).getMulta().getDevolucion().getFechaYHoraDevolucion(),
                                lectores.get(0).getMulta().getPlazo());
                lectores.get(0).getMulta().setMultadoHasta(fec);
                lectores.get(0).getMulta().setMultado(false);
                lectores.get(0).getMulta().setCantidad(5);

                lectores.get(1).getReservaLector().add(new Reserva("14/10/2022",
                Biblioteca.obras().get(0).getEjemplar().get(2),lectores.get(1)));
                // reserva.getLector().getReservaLector().add(reserva);
                // reserva.getEjemplar().setReservaEjemplar(reserva);
        

        }

        public static void ordenar(){
                Biblioteca.lectores().sort((o1, o2) -> {
                        if(o2.getMulta() != null && o1.getMulta() != null){
                                return o2.getMulta().getCantidad().compareTo(o1.getMulta().getCantidad());
                        }
                        return 0;
                });
                
                // o2.getMulta().getCantidad().compareTo(o1.getMulta().getCantidad()));
        }

        public List<Lector> getLectores() {
                return lectores;
        }

        public void setLectores(List<Lector> lectores) {
                this.lectores = lectores;
        }

}
