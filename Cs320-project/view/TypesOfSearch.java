import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TypesOfSearch {
    void initialize() {

        JFrame operatorsFrame = new JFrame();
        operatorsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel buttonPanel = new JPanel();
        JLabel space = new JLabel("");
        JLabel space2 = new JLabel("");
        JLabel space3 = new JLabel("");
        JLabel space4 = new JLabel("");
        JLabel space5 = new JLabel("");
        JLabel space6 = new JLabel("");
        JLabel space7 = new JLabel("");
        JLabel space8 = new JLabel("");
        JLabel space9 = new JLabel("");
        JLabel space10 = new JLabel("");
        JLabel space11 = new JLabel("");
        JLabel space12 = new JLabel("");

        JButton idButton = new JButton("ID SEARCH");
        idButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                operatorsFrame.dispose();
                IdSearch idSearch = new IdSearch();
                idSearch.initialize();
            }

        });
        JButton searchButton = new JButton("SEARCH");
        searchButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                operatorsFrame.dispose();
            }

        });
        JButton back = new JButton("BACK");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                operatorsFrame.dispose();
                Operators operators = new Operators();
                operators.initialize();
            }

        });

        buttonPanel.setLayout(new GridLayout(3,5));
        buttonPanel.add(space3);
        buttonPanel.add(space4);
        buttonPanel.add(space5);
        buttonPanel.add(space6);
        buttonPanel.add(space7);
        buttonPanel.add(idButton);
        buttonPanel.add(space);
        buttonPanel.add(searchButton);
        buttonPanel.add(space2);
        buttonPanel.add(back);
        buttonPanel.add(space8);
        buttonPanel.add(space9);
        buttonPanel.add(space10);
        buttonPanel.add(space11);
        buttonPanel.add(space12);

        operatorsFrame.setSize(550,200);
        operatorsFrame.add(buttonPanel);
        operatorsFrame.setVisible(true);





    }
}

