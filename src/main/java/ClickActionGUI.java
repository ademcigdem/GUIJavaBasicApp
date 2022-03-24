import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickActionGUI implements ActionListener {

    private int count;
    private final JFrame frame;
    private final Label label;
    private final JPanel panel;
    private final JButton botton;

    public ClickActionGUI() {
        frame = new JFrame();

        botton = new JButton("Click Here");
        botton.addActionListener(this);


        label = new Label("Click Number : 0");



        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(botton);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The User Interface");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ClickActionGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Click Number : " + count);
    }
}
