package modelo;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que permite mediante un metodo estático
 * generar los códigos de barra de todos los ejemplares de
 * la biblioteca.
 * 
 * @author Ivan Craco
 */
public class CodigoDeBarra {

    /**
     * Genera un archivo pdf con todos los códigos de barra
     * de los ejemplares de la biblioteca.
     * @param obras listado con todas las obras.
     * @exception FileNotFoundException si no encuentra el archivo pdf.
     * @exception DocumentException si no puede generar el documento.
     */
    public void generarCodigo(List<Obra> obras) {
        try {

            Document doc = new Document();
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("codigo.pdf"));
            doc.open();

            for (int i = 0; i < obras.size(); i++) {
                for (int j = 0; j < obras.get(i).getEjemplares().size(); j++) {
                    Barcode128 codigo = new Barcode128();
                    String IdEjemplar = (obras.get(i).getEjemplares().get(j).getIDUbicacion());
                    String codigoDeBarra = (obras.get(i).getEjemplares().get(j).getCodigoDeBarra());
                    codigo.setCode(IdEjemplar + codigoDeBarra);
                    Image img = codigo.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
                    img.scalePercent(200);
                    doc.add(img);
                }
            }

            doc.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CodigoDeBarra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(CodigoDeBarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
