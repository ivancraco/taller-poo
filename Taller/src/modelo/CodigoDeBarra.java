package modelo;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CodigoDeBarra {

        public void generarCodigo(){
            try {
                Document doc = new Document();
                PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("codigo.pdf"));
                doc.open();

                Barcode128 codigo = new Barcode128();
                codigo.setCode("9012376548");

                Image img = codigo.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
                img.scalePercent(200);
                doc.add(img);

                doc.close();


            } catch (FileNotFoundException ex) {
                Logger.getLogger(CodigoDeBarra.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(CodigoDeBarra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}
