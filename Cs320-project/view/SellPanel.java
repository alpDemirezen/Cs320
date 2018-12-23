import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellPanel extends JFrame {
    void initialize(){
        String[] types = {" ","For Sale","For Rent"};
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel id = new JLabel("ID");
        JTextField textID = new JTextField();
        JLabel labelSaleType = new JLabel("Sale Type");
        JComboBox saleType = new JComboBox(types);
        JButton sell = new JButton("SELL");
        sell.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                // model ve databaseten sonra sell eklenecek
            }
        });
        JButton back = new JButton("BACK");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Operators().initialize();
            }
        });
        JLabel space2 = new JLabel("");
        JLabel space3 = new JLabel("");
        JLabel space4 = new JLabel("");


        panel.setLayout(new GridLayout(4,2));
        panel.add(id);
        panel.add(textID);
        panel.add(labelSaleType);
        panel.add(saleType);
        panel.add(space3);
        panel.add(space4);
        panel.add(back);
        panel.add(sell);


        frame.setSize(390,180);
        frame.add(panel);
        frame.setVisible(true);
    }
}
