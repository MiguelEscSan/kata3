package software.ulpgc.kata3.swing;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import software.ulpgc.kata3.Histogram;
import software.ulpgc.kata3.HistogramDisplay;

import javax.swing.*;
import java.awt.*;

public class JFreeChartHIstogramDisplay extends JPanel implements HistogramDisplay {

    public JFreeChartHIstogramDisplay() {
        setLayout(new BorderLayout());
    }

    @Override
    public void show(Histogram histogram) {
        add(new ChartPanel(chart(dataset(histogram.values(), histogram.bins()))));
    }

    private JFreeChart chart(HistogramDataset dataset) {
        return ChartFactory.createHistogram(
                "Histogram",
                "values",
                "count",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );
    }

    private HistogramDataset dataset(double[] values, int bins) {
        HistogramDataset result = new HistogramDataset();
        result.addSeries("x", values, bins);
        return result;
    }


}
