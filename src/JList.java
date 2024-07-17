
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;

public class JList {

    private JFrame frame;
    private JTextField textNewItem;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                JList window = new JList();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public JList() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame("*Editable List*");
        frame.setBounds(100, 100, 520, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(18, 24, 472, 195);
        frame.getContentPane().add(scrollPane);

        DefaultListModel myListModel = new DefaultListModel();
        myListModel.addElement("Olive");
        myListModel.addElement("Rose");
        myListModel.addElement("Enter any record into the text field and click on the *Add* button");


        javax.swing.JList list = new javax.swing.JList();
        list.setModel(myListModel);

        list.addListSelectionListener(e -> {
            //String color = list.getSelectedValue().toString();

            if(list.getSelectedIndex()>=0){

            }

        });
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(list);

        list.setFont(new Font("Tahoma", Font.PLAIN, 16));

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(e -> {

            int selectedIdex = list.getSelectedIndex();
            if(selectedIdex>=0) {
                myListModel.remove(selectedIdex);
            }
        });
        btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnDelete.setBounds(18, 230, 89, 23);
        frame.getContentPane().add(btnDelete);

        textNewItem = new JTextField();
        textNewItem.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textNewItem.setBounds(125, 230, 258, 23);
        frame.getContentPane().add(textNewItem);
        textNewItem.setColumns(10);

        JButton btnAdd = new JButton("Add");
        btnAdd.addActionListener(e -> {
            String newItem = textNewItem.getText();
            if(newItem.length()>0 && !myListModel.contains(newItem)) {
                myListModel.addElement(newItem);
                textNewItem.setText("");
            }
        });
        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnAdd.setBounds(400, 230, 89, 23);
        frame.getContentPane().add(btnAdd);
    }}

