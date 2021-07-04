/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Javinez
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String title = "Bar chart Color Example";

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		dataset.addValue(1, "Student heights", "Less than 130");
		dataset.addValue(20, "Student heights", "130 to 134");
		dataset.addValue(30, "Student heights", "135 to 139");
		dataset.addValue(16, "Student heights", "140 to 144");
		dataset.addValue(9, "Student heights", "144 to 148");

		dataset.addValue(4, "Teacher heights", "Less than 130");
		dataset.addValue(3, "Teacher heights", "130 to 134");
		dataset.addValue(10, "Teacher heights", "135 to 139");
		dataset.addValue(5, "Teacher heights", "140 to 144");
		dataset.addValue(1, "Teacher heights", "144 to 148");

		/* create chart */
		JFreeChart chart = ChartFactory.createBarChart(title, "heights", "Number Of Persons", dataset);

		/* Get instance of CategoryPlot */
		CategoryPlot plot = chart.getCategoryPlot();

		/* Change Bar colors */
		BarRenderer renderer = (BarRenderer) plot.getRenderer();

		renderer.setSeriesPaint(0, Color.red);
		renderer.setSeriesPaint(1, Color.green);
		renderer.setSeriesPaint(2, Color.blue);

		renderer.setDrawBarOutline(false);
		renderer.setItemMargin(0);

		/* create and display chart on frame */
		ChartFrame frame = new ChartFrame("JFreeChart Demo", chart);
		frame.setVisible(true);
		frame.pack();
    }
    
}
