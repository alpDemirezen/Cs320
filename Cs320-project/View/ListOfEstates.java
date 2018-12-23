import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListOfEstates extends JFrame {

    void initialize(String estateType,String saleType){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        String[] columnNames = {"ID","Estate Type","Location","Area","Price","Sale Type"};
        Object[][] datas = {{"1","2","3","4","5","6"},{"1","2","3","4","5","6"},{"1","2","3","4","5","6"}};
        JTable table = new JTable(datas,columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        JButton back = new JButton("BACK");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Operators operator = new Operators();
                operator.initialize();
            }
        });

        panel.add(scrollPane);
        panel.add(back);

        frame.add(panel);
        frame.setSize(700,400);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        frame.setLocation(size.width/2 - frame.getWidth()/2, size.height/2 - frame.getHeight()/2);
        frame.setVisible(true);
    }
}
