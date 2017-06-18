package il.org.spartan.Leonidas.plugin.GUI.ActionMonitor;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;

/**
 * @author RoeiRaz
 * @since 18/06/17
 */
public class ActionMonitor extends JFrame {
    JPanel mainPanel;
    JProgressBar progressBar;
    JTextArea OutputConsole;
    JLabel statusLabel;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    public ActionMonitor() throws HeadlessException {
        setContentPane(mainPanel);

    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new FormLayout("fill:d:grow", "center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:max(d;4px):noGrow,top:4dlu:noGrow,center:d:grow"));
        progressBar = new JProgressBar();
        progressBar.setString("40%");
        progressBar.setValue(40);
        CellConstraints cc = new CellConstraints();
        mainPanel.add(progressBar, cc.xy(1, 3, CellConstraints.FILL, CellConstraints.DEFAULT));
        final JScrollPane scrollPane1 = new JScrollPane();
        mainPanel.add(scrollPane1, cc.xy(1, 7, CellConstraints.FILL, CellConstraints.FILL));
        OutputConsole = new JTextArea();
        OutputConsole.setEditable(false);
        OutputConsole.setEnabled(true);
        OutputConsole.setPreferredSize(new Dimension(0, 100));
        OutputConsole.setRequestFocusEnabled(true);
        OutputConsole.setText("");
        scrollPane1.setViewportView(OutputConsole);
        statusLabel = new JLabel();
        statusLabel.setText("Performing spartanization on X characters across Y files (Done: m/N characters)");
        mainPanel.add(statusLabel, cc.xy(1, 1));
        final JLabel label1 = new JLabel();
        label1.setText("Output:");
        mainPanel.add(label1, cc.xy(1, 5));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
