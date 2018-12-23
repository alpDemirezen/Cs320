import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchType extends JFrame {
    void initialize(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel buttonPanel = new JPanel();
        JPanel spacePanel = new JPanel();
        JPanel spacePanel2 = new JPanel();
        JButton house = new JButton("HOUSE");
        house.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new SearchPanelHouse().initialize();
            }
        });
        JButton others = new JButton("OTHERS");
        others.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new SearchPanel().initialize();
            }
        });
        JButton back = new JButton("BACK");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                TypesOfSearch typesOfSearch = new TypesOfSearch();
                typesOfSearch.initialize();
            }
        });
        JLabel space = new JLabel("");

        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(house);
        buttonPanel.add(space);
        buttonPanel.add(others);

        spacePanel2.add(back);

        frame.setLayout(new GridLayout(3,1));
        frame.setSize(300,180);
        frame.add(spacePanel);
        frame.add(buttonPanel);
        frame.add(spacePanel2);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);
        frame.setVisible(true);

    }
}
