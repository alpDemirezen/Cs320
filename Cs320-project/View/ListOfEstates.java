import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListOfEstates extends JFrame {

    void initialize(String estateType, String saleType) {
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
        switch (estateType) {
            case "Apartment": {
                Apartment[] result = RealEstate.ApartmentSearch(saleType, estateType);
                for (Apartment apartment : result) {
                    model.addRow(new Object[]{apartment.getId(), apartment.getType(), apartment.getLocation(), apartment.area, apartment.price, apartment.saleType});
                }

                break;
            }
            case "Villa": {
                Villa[] result = RealEstate.VillaSearch(saleType, estateType);
                for (Villa villa : result) {
                    model.addRow(new Object[]{villa.getId(), villa.getType(), villa.location, villa.area, villa.price, villa.saleType});

                }

                break;
            }
            case "Land": {
                Land[] result = RealEstate.LandSearch(saleType, estateType);
                for (Land land : result) {
                    model.addRow(new Object[]{land.getId(), land.getType(), land.location, land.area, land.price, land.saleType});
                }

                break;
            }
            case "Workplace": {
                Workplace[] result = RealEstate.WorkPlaceSearch(saleType, estateType);
                for (Workplace workplace : result) {
                    model.addRow(new Object[]{workplace.getId(), workplace.getType(), workplace.location, workplace.area, workplace.price, workplace.saleType});
                }

                break;
            }
        }
        table.setFillsViewportHeight(true);
        JButton back = new JButton("BACK");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Operators operator = new Operators();
                operator.initialize();
            }
        });

        panel.add(scrollPane);
        panel.add(back);

        frame.add(panel);
        frame.setSize(700, 400);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension size = toolkit.getScreenSize();
        frame.setLocation(size.width / 2 - frame.getWidth() / 2, size.height / 2 - frame.getHeight() / 2);
        frame.setVisible(true);
    }
}
