import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class JList {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JList window = new JList();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(53, 24, 144, 214);
        frame.getContentPane().add(scrollPane);

        javax.swing.JList list = new javax.swing.JList();
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String color = list.getSelectedValue().toString();
                switch(color) {
                    case "Black":
                        frame.getContentPane().setBackground(Color.BLACK);
                        break;
                    case "White":
                        frame.getContentPane().setBackground(Color.WHITE);
                        break;
                    case "Red":
                        frame.getContentPane().setBackground(Color.RED);
                        break;
                    case "Yellow":
                        frame.getContentPane().setBackground(Color.YELLOW);
                        break;
                    case "Green":
                        frame.getContentPane().setBackground(Color.GREEN );
                        break;
                    case "Blue":
                        frame.getContentPane().setBackground(Color.BLUE);
                        break;
                    case "Orange":
                        frame.getContentPane().setBackground(Color.ORANGE);
                        break;
                    case "Purple":
                        frame.getContentPane().setBackground(new Color(153,102,204));
                        break;
                    case "Brown":
                        frame.getContentPane().setBackground(new Color(204, 153, 120));
                        break;
                    case "Light Blue":
                        frame.getContentPane().setBackground(new Color(204,255,255));
                        break;
                    case "Light Green":
                        frame.getContentPane().setBackground(new Color(153,204,153));
                        break;
                    case "Light Red":
                        frame.getContentPane().setBackground(new Color(255,102,102));
                        break;

                    default:
                        frame.getContentPane().setBackground(Color.GRAY);
                        break;
                }

            }
        });
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(list);
        list.setModel(new AbstractListModel() {
            String[] values = new String[] {"Black", "White", "Gray", "Red", "Yellow", "Green", "Blue", "Orange", "Purple", "Brown", "Light Blue", "Light Green", "Light Red"};
            public int getSize() {
                return values.length;
            }
            public Object getElementAt(int index) {
                return values[index];
            }
        });
        list.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }
}

