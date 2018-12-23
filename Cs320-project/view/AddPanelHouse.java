import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPanelHouse extends JFrame {

    void initialize(){
        String[] types = {"For Sale","For Rent"};
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
        JButton add = new JButton("ADD");
        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
               // database ve model sonrası eklenecek
            }

        });
        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                TypePanel types = new TypePanel();
                types.initialize();
            }

        });
        JComboBox estateType = new JComboBox(types);
        JLabel labelEstateType = new JLabel("Estate Type");
        JLabel space = new JLabel("");
        JLabel space1 = new JLabel("");

        panel.setLayout(new GridLayout(7,2));
        panel.add(location);
        panel.add(textLocation);
        panel.add(price);
        panel.add(textPrice);
        panel.add(area);
        panel.add(textArea);
        panel.add(saleType);
        panel.add(textSaleType);
        panel.add(labelEstateType);
        panel.add(estateType);
        panel.add(space);
        panel.add(space1);
        panel.add(back);
        panel.add(add);

        frame.setSize(700,400);
        frame.getContentPane().add(panel,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

