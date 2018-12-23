import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operators extends JFrame {

    void initialize() {

        JFrame operatorsFrame = new JFrame();
        operatorsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("ADD");
        JButton sell = new JButton("SELL");
        sell.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                operatorsFrame.dispose();
                new SellPanel().initialize();
            }

        });

        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                operatorsFrame.dispose();
                TypePanel types = new TypePanel();
                types.initialize();
            }

        });
        JButton searchButton = new JButton("SEARCH");
        searchButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                operatorsFrame.dispose();
               new RealSearchPanel().initialize();
            }

        });
        JLabel space = new JLabel(" ");
        JLabel space1 = new JLabel(" ");
        JLabel space2 = new JLabel(" ");
        JLabel space3 = new JLabel(" ");
        JLabel space4 = new JLabel(" ");
        JLabel space5 = new JLabel(" ");
        JLabel space6 = new JLabel(" ");
        JLabel space7 = new JLabel(" ");
        JLabel space8 = new JLabel(" ");
        JLabel space9 = new JLabel(" ");
        JLabel space0 = new JLabel(" ");
        JLabel space11 = new JLabel("");

        buttonPanel.setLayout(new GridLayout(3,5));
        buttonPanel.add(space4);
        buttonPanel.add(space5);
        buttonPanel.add(space6);
        buttonPanel.add(space7);
        buttonPanel.add(space8);
        buttonPanel.add(addButton);
        buttonPanel.add(space3);
        buttonPanel.add(searchButton);
        buttonPanel.add(space2);
        buttonPanel.add(sell);
        buttonPanel.add(space);
        buttonPanel.add(space9);
        buttonPanel.add(space11);
        buttonPanel.add(space1);
        buttonPanel.add(space0);

        operatorsFrame.setSize(500,200);
        operatorsFrame.add(buttonPanel);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        operatorsFrame.setLocation(size.width/2 - operatorsFrame.getWidth()/2, size.height/2 - operatorsFrame.getHeight()/2);
        operatorsFrame.setVisible(true);

    }
}
