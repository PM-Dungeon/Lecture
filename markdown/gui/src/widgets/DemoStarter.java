package widgets;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/** Rahmen für die Widget-Demos */
public final class DemoStarter {
    /** Erzeuge die Komponenten in neuem EDT-Job statt im main()-Tread */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        JFrame frame = new JFrame("Widget Demo");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        frame.add(new RadioButtonDemo());
                        // frame.add(new FileChooserDemo());
                        // frame.add(new TabbedPaneDemo());
                        // frame.add(new DialogDemo());

                        //  Die Menüleiste gehört zum Frame, nicht zum Panel!
                        // frame.setJMenuBar(MenuDemo.newMenuBar());

                        // frame.add(new PopupDemo());

                        frame.pack();
                        frame.setVisible(true);
                    }
                });
    }
}
