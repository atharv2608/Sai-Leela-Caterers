package panels;



import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class Methods {
    
    public void designTable(JTable tableName, int rowHeight){
        tableName.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tableName.getTableHeader().setOpaque(false);
        tableName.getTableHeader().setBackground(new Color(32, 136, 203));
        tableName.getTableHeader().setForeground(new Color(255, 255, 255));
        tableName.setRowHeight(rowHeight);
        tableName.setShowGrid(false);
        tableName.setShowVerticalLines(false);
        tableName.setShowGrid(false);
        tableName.setShowHorizontalLines(false);
        tableName.setRowMargin(0);
        tableName.getColumnModel().setColumnMargin(0);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)tableName.getDefaultRenderer(Object.class);
        renderer.setHorizontalAlignment( SwingConstants.CENTER );    
    }
    
    public void allEmptyFields(JLabel errorLabel, JTextField ...textField){
        for(JTextField textboxes: textField){
            if(textboxes.getText().equals("")){
                errorLabel.setText("Please Fill All Details");
            }
        }
    }
    
}
