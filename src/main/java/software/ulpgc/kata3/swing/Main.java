package software.ulpgc.kata3.swing;

import software.ulpgc.kata3.Histogram;

public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram(5, 1, 2, 3, 4, 5, 4, 2, 1, 4, 5, 2, 1, 6, 7, 3, 1, 2, 4, 6);
        MainFrame frame = new MainFrame();
        frame.getHistogramDisplay().show(histogram);
        frame.setVisible(true);
    }
}
