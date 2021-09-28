package student.notice.app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class UserHome extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserHome frame = new UserHome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public UserHome() {

    }

 
    public UserHome(String userSes) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JButton btnNewButton = new JButton("Logout");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    UserLogin obj = new UserLogin();
                    obj.setTitle("Student-Login");
                    obj.setVisible(true);
                }
                dispose();
                UserLogin obj = new UserLogin();

                obj.setTitle("Student-Login");
                obj.setVisible(true);

            }
        });
        JLabel lbblNewLabel = new JLabel("NOTICES");
        lbblNewLabel.setForeground(Color.blue);
        lbblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        lbblNewLabel.setBounds(30, 25, 450, 250);
        contentPane.add(lbblNewLabel);
        
        JLabel lbblNwLabel = new JLabel("1) On occasion of Gaijatra college will remain close on 27th sep");
        lbblNwLabel.setForeground(Color.BLACK);
        lbblNwLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lbblNwLabel.setBounds(30, 55, 450, 250);
        contentPane.add(lbblNwLabel);
        
        JLabel llNwLabel = new JLabel("2) Phase test 1 will begin from oct 12");
        llNwLabel.setForeground(Color.BLACK);
        llNwLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        llNwLabel.setBounds(30, 85, 450, 250);
        contentPane.add(llNwLabel);
        
        JLabel asLabel = new JLabel("3)All the dues are to be cleared till OCT 1");
        asLabel.setForeground(Color.BLACK);
        asLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        asLabel.setBounds(30, 115, 450, 250);
        contentPane.add(asLabel);
        
        btnNewButton.setBounds(165,10, 150, 22);
        contentPane.add(btnNewButton);
        JButton button = new JButton("Change-password\r\n");
        button.setBackground(UIManager.getColor("Button.disabledForeground"));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChangePassword bo = new ChangePassword(userSes);
                bo.setTitle("Change Password");
                bo.setVisible(true);

            }
        });
        button.setFont(new Font("Tahoma", Font.PLAIN, 14));
        button.setBounds(20, 10, 150, 22);
        contentPane.add(button);
    }
}
