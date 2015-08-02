/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportesListar;

import Identidades.DatosJaula;
import crudBaseDatos.CrudJaula;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivan
 */
public class ReporteJaulas extends JFrame{
    
     JTable tabla;//tabla

    JScrollPane scroll;
    CrudJaula baseJaula;

    public ReporteJaulas(List<DatosJaula> listaJaula) {
        super("Reporte Jaulas");
        JScrollPane caja;
        JLabel lbtitulo;
        DefaultTableModel modelo = null;
        String Identificadores[] = new String[6];
        String datosJaulas[] = new String[6];
        int i = 0;
        baseJaula = new CrudJaula();
        Identificadores[0] = "Codigo Jaula";
        Identificadores[1] = "Nombre Jaula";
        Identificadores[2] = "Area en Metros";
        Identificadores[3] = "Fecha Construcción";
        Identificadores[4] = "Estado";
        Identificadores[5] = "Número de Cerdos";
        //modelo 
        modelo = new DefaultTableModel();//inicializa
        for (int j = 0; j < 6; j++) //añaden columnas
        {
            modelo.addColumn(Identificadores[j]);
        }
        for (DatosJaula jaula : listaJaula) {

            datosJaulas[0] = String.valueOf(jaula.getCodJaula());
            datosJaulas[1] = jaula.getNombre();
            datosJaulas[2] = String.valueOf(jaula.getArea());
            datosJaulas[3] = jaula.getFechaCons().toString();
            if (jaula.getEstado() == 1){
                datosJaulas[4] = "Activo";
            }else{
                datosJaulas[4] = "Inactivo";
            }
            datosJaulas[5] = String.valueOf(jaula.getNumCerdos());

            modelo.addRow(datosJaulas);//se añade el registro al modelo

        }

        tabla = new JTable(modelo);//se añade el modelo a la tabla

        caja = new JScrollPane(tabla);//se añade la tabla al scroll (contenedor)
        caja.reshape(50, 50, 1100, 170);//dimensiones
        getContentPane().add(caja);//se añade el scroll(caja) al contenedor principal(ventana)

        this.setSize(1100, 325);
        this.setVisible(true);
        repaint();
    }
    
}
