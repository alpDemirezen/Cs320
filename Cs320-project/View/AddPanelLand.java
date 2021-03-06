import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPanelLand {

    void initialize(){


        String[] saleTypes = {" ","For Sale","For Rent"};
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel price = new JLabel("Price");
        JTextField textPrice = new JTextField();
        JLabel location = new JLabel("Location");
        JTextField textLocation = new JTextField();
        JLabel saleType = new JLabel("Sale Type");
        JComboBox boxSaleType = new JComboBox(saleTypes);
        JLabel area = new JLabel("Area");
        JTextField textArea = new JTextField();
        JButton add = new JButton("ADD");
        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                if(boxSaleType.getSelectedItem().equals("For Rent")){
                    RealEstate.save("For Rent", Integer.parseInt(textPrice.getText()), Integer.parseInt(textArea.getText()), textLocation.getText(), "Land");
                } else if (boxSaleType.getSelectedItem().equals("For Sale")){
                    RealEstate.save("For Sale", Integer.parseInt(textPrice.getText()), Integer.parseInt(textArea.getText()), textLocation.getText(), "Land");
                }
                TypePanel types = new TypePanel();
                types.initialize();
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
        JLabel space = new JLabel(" ");
        JLabel space1 = new JLabel(" ");


        panel.setLayout(new GridLayout(6,2));
        panel.add(location);
        panel.add(textLocation);
        panel.add(price);
        panel.add(textPrice);
        panel.add(area);
        panel.add(textArea);
        panel.add(saleType);
        panel.add(boxSaleType);
        panel.add(space);
        panel.add(space1);
        panel.add(back);
        panel.add(add);

        frame.setSize(700,400);
        frame.getContentPane().add(panel,BorderLayout.CENTER);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);
        frame.setVisible(true);
    }


}
