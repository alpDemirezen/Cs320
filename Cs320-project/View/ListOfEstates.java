import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListOfEstates extends JFrame {

    void initialize(String estateType,String saleType){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        model.addColumn("ID");
        model.addColumn("Estate Type");
        model.addColumn("Location");
        model.addColumn("Area");
        model.addColumn("Price");
        model.addColumn("Sale Type");

        Apartment[] result = RealEstate.ApartmentSearch(saleType,estateType);
        for(int i = 0; i<result.length; ++i){
            model.addRow(new Object[]{result[i].getId(), result[i].getType(), result[i].getLocation(),result[i].area,result[i].price, result[i].saleType});
        }

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
