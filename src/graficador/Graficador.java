/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficador;

import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Cri
 */
 
public class Graficador {
    
    public Graficador() {
        
    }
    
    public static void crearGrafica(XYSeries x){
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(x);
         JFreeChart xylineChart = ChartFactory.createXYLineChart(
                "Grafica XY", 
                "x", 
                "Tiempo",  
                dataset,
                PlotOrientation.VERTICAL, true, true, false);
         
         XYPlot plot = xylineChart.getXYPlot();
        
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        renderer.setSeriesPaint(0, Color.RED);
        plot.setRenderer(renderer);
        
        ChartPanel panel = new ChartPanel(xylineChart);
        
        JFrame ventana = new JFrame("Grafica");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        ventana.add(panel);
    }
}
