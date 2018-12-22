import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operators extends JFrame {

    void initialize() {

        JFrame operatorsFrame = new JFrame();
        operatorsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("ADD");
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                operatorsFrame.dispose();
                TypePanel types = new TypePanel();
                types.initialize();
            }

        });
        JButton searchButton = new JButton("SEARCH");


        buttonPanel.setLayout(null);
        buttonPanel.setBounds(0,0,250,200);
        addButton.setBounds(20,30,90,100);
        searchButton.setBounds(120,30,90,100);
        buttonPanel.add(addButton);
        buttonPanel.add(searchButton);

        operatorsFrame.setSize(250,200);
        operatorsFrame.setLayout(null);
        operatorsFrame.add(buttonPanel);
        operatorsFrame.setVisible(true);





    }
}
