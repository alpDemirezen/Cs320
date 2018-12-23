import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TypesOfSearch extends JFrame {
    void initialize(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel buttonPanel = new JPanel();
        JPanel spacePanel = new JPanel();
        JPanel spacePanel2 = new JPanel();
        JButton idSearch = new JButton("ID SEARCH");
        idSearch.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new IdSearch().initialize();
            }
        });
        JButton search = new JButton("SEARCH");
        search.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
               SearchType search = new SearchType();
               search.initialize();
            }
        });
        JButton back = new JButton("BACK");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Operators().initialize();
            }
        });
        JLabel space = new JLabel("");

        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(idSearch);
        buttonPanel.add(space);
        buttonPanel.add(search);

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
