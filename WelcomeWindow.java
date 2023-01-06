package hospital_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WelcomeWindow extends JFrame {

    private JLabel label1;
    public static int secondsPassed = 5;

    WelcomeWindow() {
        super("Hospital Management System");
        setBounds(165, 130, 1000, 550);
        getContentPane().setBackground(new Color(93, 138, 168));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/IMAGES/welcome1.jpeg"));
        label1 = new JLabel(imageIcon);
        label1.setBounds(0, 0, 1000, 500);
        add(label1);
        setVisible(true);
    }

    public static void main(String[] args) {
        WelcomeWindow obj = new WelcomeWindow();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String time = " ";

        if (secondsPassed > 0) {
            g.drawString(time, 820, 350);
        }
        if (secondsPassed == 0) {
            setVisible(false);
            new StatusTypeWindow().setVisible(true);
        }
        secondsPassed--;
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
        }
    }
}
