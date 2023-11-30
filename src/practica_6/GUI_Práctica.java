/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica_6;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author felix
 */
public class GUI_Práctica extends javax.swing.JFrame {

    Control control;
    XYDataset[] mergeSortDatos;
    XYDataset[] sortDatos;
    XYDataset[] parallelDatos;
    XYDataset[] quickSortDatos;
    XYDataset[] datosTotales;
    //Graficas
    JFreeChart chart;
    XYPlot plot;
    ChartPanel panel;
    //Caminos:
    String[] caminoMerge;
    String[] caminoSort;
    String[] caminoParallel;
    String[] caminoQuick;
    ChartFrame chartFrame;
    int casoActual;
    /**
     * Creates new form GUI_Práctica
     */
    
    public GUI_Práctica() throws IOException {
        initComponents();
        // "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\mergeSort(caso1).csv"
        //Creamos control
        this.setBounds(200, 200, 215, 310);
        control = new Control();
        this.casoActual = 0;
        datosTotales = new XYDataset[3];
        for (int i = 0; i < 3; i++)
        {
            datosTotales[i] = new XYSeriesCollection();
        }
        //Creamos los caminos
        String aux =  "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\parallelSort(caso";
        this.caminoParallel = new String[3];
        this.parallelDatos = new XYDataset[3];
        for (int i = 0; i < 3; i++)
        {
            caminoParallel[i] = aux + (i+1) + ").csv";
            this.parallelDatos[i] = generarSetDeDatos(caminoParallel[i], ("Parallel Sort Caso " + (i+1)));
            ////////////////////////////
            añadirADatosTotales(caminoParallel[i], ("Parallel Sort Caso " + (i+1)), (XYSeriesCollection )datosTotales[i]);
        }
        aux =  "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\mergeSort(caso";
        this.caminoMerge =  new String[3];
        this.mergeSortDatos = new XYDataset[3];
        for (int i = 0; i < 3; i++)
        {
            caminoMerge[i] = aux + (i+1) + ").csv";
            this.mergeSortDatos[i] = generarSetDeDatos(caminoMerge[i], ("Merge Sort Caso " + (i+1)));
            ////////////////////////////////////////7
            añadirADatosTotales(caminoMerge[i], ("Merge Sort Caso " + (i+1)), (XYSeriesCollection )datosTotales[i]);
        }
        aux =  "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\quickSort(caso";
        this.caminoQuick =  new String[3];
        this.quickSortDatos = new XYDataset[3];
        for (int i = 0; i < 3; i++)
        {
            caminoQuick[i] = aux + (i+1) + ").csv";
            this.quickSortDatos[i] = generarSetDeDatos(caminoQuick[i], ("Quick Sort caso " + (i+1)));
            /////////////////////////////////7
            añadirADatosTotales(caminoQuick[i], ("Quick Sort Caso " + (i+1)), (XYSeriesCollection )datosTotales[i]);
        }
        aux =  "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\sort(caso";
        this.caminoSort =  new String[3];
        this.sortDatos = new XYDataset[3];
        for (int i = 0; i < 3; i++)
        {
            caminoSort[i] = aux + (i+1) + ").csv";
            this.sortDatos[i] = generarSetDeDatos(caminoSort[i], ("Sort Caso " + (i+1)));
            añadirADatosTotales(caminoSort[i], ("Sort Caso " + (i+1)), (XYSeriesCollection )datosTotales[i]);
        }
        //Leemos los valores
        //Creamos la grafica
        this.asignarMostrarGrafica(this.mergeSortDatos[0], 1, 1);
        //La seteamos invisible
        
    }
    
    private void asignarMostrarGrafica (XYDataset datos, int caso, int ordenamiento )
    {
        String titulo = "";
        switch (ordenamiento)
        {
            //Merge
            case 1:
                titulo += "Merge Sort";
                break;
            //Parallel
            case 2:
                titulo += "Parallel Sort";
                break;
            //Quick
            case 3:
                titulo += "Quick Sort";
                break;
            //Sort
            case 4:
                titulo += "Sort";
                break;
        }
        switch(caso)
        {
            case 1:
                titulo += " Caso 1";
                break;
            case 2:
                titulo += " Caso 2";
                break;
            case 3:
                titulo += " Caso 3";
                break;
        }
        this.chart = ChartFactory.createXYLineChart(titulo, "Número de elementos", "Nano segundos", datos,
        PlotOrientation.VERTICAL,true,true,false);
        this.plot = chart.getXYPlot();
        if (this.chartFrame != null)
        {
            this.chartFrame.setVisible(false);
        }
        this.chartFrame = new ChartFrame("Grafica", chart);
        chartFrame.setVisible(true);
        chartFrame.setSize(450,500);
        chartFrame.setBounds(415, 200, 450, 500);
    }
    public void añadirADatosTotales (String caminoCSV, String serieKey, XYSeriesCollection datos) throws FileNotFoundException, IOException
    {
        FileReader file = new FileReader(caminoCSV);
        BufferedReader buffer = new BufferedReader(file);
        String linea = buffer.readLine();
        String[] elementos;
        var serieDatos = new XYSeries(serieKey);
        long aux1;
        long aux2;
        while (linea != null)
        {
            elementos = linea.split(",");
            aux1 = Long.parseLong(elementos[1]);
            aux2 = Long.parseLong(elementos[2]);
            serieDatos.add(aux1, aux2);
            linea = buffer.readLine();
        }
        datos.addSeries(serieDatos);
    }
    public XYDataset generarSetDeDatos (String caminoCSV, String serieKey) throws FileNotFoundException, IOException
    {
        //String caminoCSV = "C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\mergeSort(caso1).csv";
        //File CSV = new File(caminoCSV);
        FileReader file = new FileReader(caminoCSV);
        BufferedReader buffer = new BufferedReader(file);
        String linea = buffer.readLine();
        String[] elementos;
        var serieDatos = new XYSeries(serieKey);
        long aux1;
        long aux2;
        while (linea != null)
        {
            elementos = linea.split(",");
            aux1 = Long.parseLong(elementos[1]);
            aux2 = Long.parseLong(elementos[2]);
            serieDatos.add(aux1, aux2);
            linea = buffer.readLine();
        }
        var datos = new XYSeriesCollection();
        datos.addSeries(serieDatos);
        return datos;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaCasos = new javax.swing.JComboBox<>();
        quickButton = new javax.swing.JButton();
        sortButton = new javax.swing.JButton();
        mergeButton = new javax.swing.JButton();
        parallelButton = new javax.swing.JButton();
        allButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(215, 350));

        listaCasos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caso 1", "Caso 2", "Caso 3" }));
        listaCasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCasosActionPerformed(evt);
            }
        });

        quickButton.setText("Quick Sort");
        quickButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickButtonActionPerformed(evt);
            }
        });

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        mergeButton.setText("Merge Sort");
        mergeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mergeButtonActionPerformed(evt);
            }
        });

        parallelButton.setText("Parallel Sort");
        parallelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parallelButtonActionPerformed(evt);
            }
        });

        allButton.setText("Show all");
        allButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mergeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parallelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quickButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sortButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(allButton, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(listaCasos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(mergeButton)
                .addGap(18, 18, 18)
                .addComponent(parallelButton)
                .addGap(18, 18, 18)
                .addComponent(quickButton)
                .addGap(18, 18, 18)
                .addComponent(sortButton)
                .addGap(18, 18, 18)
                .addComponent(allButton)
                .addGap(28, 28, 28)
                .addComponent(listaCasos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaCasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCasosActionPerformed
        // TODO add your handling code here:
        String caso = (String)listaCasos.getSelectedItem();
        if (caso.compareTo("Caso 1") == 0)
        {
            this.casoActual = 0;
        }
        else if (caso.compareTo("Caso 2") == 0)
        {
            this.casoActual = 1;
        }
        else if (caso.compareTo("Caso 3") == 0)
        {
            this.casoActual = 2;
        }
    }//GEN-LAST:event_listaCasosActionPerformed

    private void mergeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mergeButtonActionPerformed
        // TODO add your handling code here:
        this.asignarMostrarGrafica(this.mergeSortDatos[casoActual], casoActual+1, 1);
    }//GEN-LAST:event_mergeButtonActionPerformed

    private void parallelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parallelButtonActionPerformed
        // TODO add your handling code here:
        this.asignarMostrarGrafica(this.parallelDatos[casoActual], casoActual+1, 2);
    }//GEN-LAST:event_parallelButtonActionPerformed

    private void quickButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickButtonActionPerformed
        // TODO add your handling code here:
        this.asignarMostrarGrafica(this.quickSortDatos[casoActual], casoActual+1, 3);
    }//GEN-LAST:event_quickButtonActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        // TODO add your handling code here:
        this.asignarMostrarGrafica(this.sortDatos[casoActual], casoActual+1, 4);
    }//GEN-LAST:event_sortButtonActionPerformed

    private void allButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allButtonActionPerformed
        // TODO add your handling code here:
        this.chart = ChartFactory.createXYLineChart("Todos los ordenamientos", "Número de elementos", "Nano segundos", this.datosTotales[this.casoActual],
                PlotOrientation.VERTICAL,true,true,false);
        this.plot = chart.getXYPlot();
        if (this.chartFrame != null)
        {
            this.chartFrame.setVisible(false);
        }
        this.chartFrame = new ChartFrame("Grafica", chart);
        chartFrame.setVisible(true);
        chartFrame.setSize(450,500);
        chartFrame.setBounds(415, 200, 450, 500);
        var renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));
        renderer.setSeriesPaint(2, Color.YELLOW);
        renderer.setSeriesStroke(2, new BasicStroke(2.0f));
        renderer.setSeriesPaint(3, Color.GREEN);
        renderer.setSeriesStroke(3, new BasicStroke(2.0f));
        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);
        
    }//GEN-LAST:event_allButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Práctica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Práctica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Práctica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Práctica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI_Práctica().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GUI_Práctica.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allButton;
    private javax.swing.JComboBox<String> listaCasos;
    private javax.swing.JButton mergeButton;
    private javax.swing.JButton parallelButton;
    private javax.swing.JButton quickButton;
    private javax.swing.JButton sortButton;
    // End of variables declaration//GEN-END:variables
}
