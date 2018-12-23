import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RealSearchPanel extends JFrame {

    void initialize(){
        String[] estateType = {" ","Land","Workplace","Apartment","Villa"};
        String[] saleType = {" ","For Sale","For Rent"};
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel labelEstateType = new JLabel("Estate Type");
        JComboBox estateTypes = new JComboBox(estateType);
        JLabel labelSaleType = new JLabel("Sale Type");
        JComboBox saleTypes = new JComboBox(saleType);
        JButton back = new JButton("BACK");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Operators operator = new Operators();
                operator.initialize();
            }
        });
        JButton search = new JButton("SEARCH");
        search.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                // model ve database'e göre şekillenecek.
            }
        });
        JLabel space = new JLabel(" ");
        JLabel space1 = new JLabel(" ");

        panel.setLayout(new GridLayout(4,2));
        panel.add(labelEstateType);
        panel.add(estateTypes);
        panel.add(labelSaleType);
        panel.add(saleTypes);
        panel.add(space);
        panel.add(space1);
        panel.add(back);
        panel.add(search);

        frame.setSize(500,200);
        frame.add(panel);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);
        frame.setVisible(true);

    }
}
