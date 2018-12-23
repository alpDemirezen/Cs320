import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IdSearch extends JFrame {
    void initialize(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel id = new JLabel("ID");
        JTextField textID = new JTextField();
        JButton search = new JButton("SEARCH");
        search.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                // model ve databaseten sonra search eklenecek
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
        JLabel space2 = new JLabel("");
        JLabel space3 = new JLabel("");
        JLabel space4 = new JLabel("");


        panel.setLayout(new GridLayout(3,3));
        panel.add(id);
        panel.add(textID);
        panel.add(search);
        panel.add(space2);
        panel.add(space3);
        panel.add(space4);
        panel.add(back);


        frame.setSize(390,180);
        frame.add(panel);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);
        frame.setVisible(true);
    }
}
