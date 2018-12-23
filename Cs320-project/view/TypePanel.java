import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TypePanel extends JFrame {

    void initialize(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton house = new JButton("House");
        house.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AddPanelHouse addPanel = new AddPanelHouse();
                addPanel.initialize();
            }
        });
        JButton land = new JButton("Land");
        land.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            AddPanel addPanel = new AddPanel();
            addPanel.initialize();
        }
    });
        JButton workplace = new JButton("Workplace");
        workplace.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AddPanel addPanel = new AddPanel();
                addPanel.initialize();
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
        JButton back = new JButton("BACK");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               frame.dispose();
               Operators operator = new Operators();
               operator.initialize();
                }
            });
        panel.setLayout(new GridLayout(3,5));
        panel.add(house);
        panel.add(space3);
        panel.add(land);
        panel.add(space2);
        panel.add(workplace);
        panel.add(space4);
        panel.add(space5);
        panel.add(space6);
        panel.add(space);
        panel.add(space7);
        panel.add(space8);
        panel.add(space9);
        panel.add(back);
        panel.add(space1);
        panel.add(space0);

        frame.setSize(500,200);
        frame.add(panel);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);
        frame.setVisible(true);

    }
}
