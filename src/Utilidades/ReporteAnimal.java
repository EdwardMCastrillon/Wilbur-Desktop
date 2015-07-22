
package Utilidades;

/**
 *
 * @author Edward
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ReporteAnimal extends JFrame {

    JTable tabla;//tabla

    JScrollPane scroll;

    public ReporteAnimal() {
        super("Reporte de Partos");
        JScrollPane caja;
        JLabel lbtitulo;
        DefaultTableModel modelo = null;
        String Identificadores[] = new String[13];
        String Secundarios[] = new String[13];
        int i = 0;
        Identificadores[0] = "Codigo Animal";
        Identificadores[1] = "Raza";
        Identificadores[2] = "Sexo";
        Identificadores[3] = "Peso al Nacer";
        Identificadores[4] = "Peso al destete";
        Identificadores[5] = "Fecha Destete";
        Identificadores[6] = "Fecha consumo Alimento";
        Identificadores[7] = "Raza Madre";
        Identificadores[8] = "Raza Padre";
        Identificadores[9] = "Procedencia";
        //modelo 
        modelo = new DefaultTableModel();//inicializa
        for (int j = 0; j < 9; j++) //añaden columnas
        {
            modelo.addColumn(Identificadores[j]);
        }
    /*    while (L != null) {

            Secundarios[0] = L.getAnimal().getCod_animal();
            Secundarios[1] = L.getAnimal().getRaza();
            Secundarios[2] = L.getAnimal().getSexo();
            Secundarios[3] = L.getAnimal().getPeso_nacer();
            Secundarios[4] = L.getAnimal().getPeso_destete();
            Secundarios[5] = L.getAnimal().getFecha_dest().toString();
            Secundarios[6] = L.getAnimal().getFecha_consumo().toString();
            Secundarios[7] = L.getAnimal().getRazaMadre();
            Secundarios[8] = L.getAnimal().getRazaPadre();
            Secundarios[9] = L.getAnimal().getProcedencia();

            modelo.addRow(Secundarios);//se añade el registro al modelo
            L = L.getLiga();

        }*/

        tabla = new JTable(modelo);//se añade el modelo a la tabla

        caja = new JScrollPane(tabla);//se añade la tabla al scroll (contenedor)
        caja.reshape(50, 50, 1100, 170);//dimensiones
        getContentPane().add(caja);//se añade el scroll(caja) al contenedor principal(ventana)

        this.setSize(1100, 325);
        this.setVisible(true);
        repaint();
    }
    
    //Fecha actual
    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }

    //Hora actual
    public static String getHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        return formateador.format(ahora);
    }

}
