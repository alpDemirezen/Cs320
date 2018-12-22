import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPanel extends JPanel {

    void initialize(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel price = new JLabel("Price");
        JTextField textPrice = new JTextField();
        JLabel location = new JLabel("Location");
        JTextField textLocation = new JTextField();
        JLabel saleType = new JLabel("Sale Type");
        JTextField textSaleType = new JTextField();
        JLabel area = new JLabel("Area");
        JTextField textArea = new JTextField();
        JLabel space = new JLabel(" ");
        JButton add = new JButton("ADD");
        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               frame.dispose();
               Operators operator = new Operators();
               operator.initialize();
            }

        });

        panel.setLayout(new GridLayout(5,2));
        panel.add(location);
        panel.add(textLocation);
        panel.add(price);
        panel.add(textPrice);
        panel.add(area);
        panel.add(textArea);
        panel.add(saleType);
        panel.add(textSaleType);
        panel.add(back);
        panel.add(add);

        frame.setSize(600,400);
        frame.getContentPane().add(panel,BorderLayout.CENTER);
        frame.setVisible(true);
   }
}
