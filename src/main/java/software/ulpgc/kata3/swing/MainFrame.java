package software.ulpgc.kata3.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JFreeChartHIstogramDisplay histogramDisplay;

    public MainFrame() throws HeadlessException {
        setTitle("Histogram");
        setSize(1000,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createHisogramDisplay());
    }

    private Component createHisogramDisplay() {
        JFreeChartHIstogramDisplay jFreeChartHIstogramDisplay = new JFreeChartHIstogramDisplay();
        histogramDisplay = jFreeChartHIstogramDisplay;
        return jFreeChartHIstogramDisplay;
    }

    public JFreeChartHIstogramDisplay getHistogramDisplay() {
        return histogramDisplay;
    }
}
