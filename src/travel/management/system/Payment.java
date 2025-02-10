package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener {
    
    JButton upi, netBanking, card, back;
    JPanel panel;
    
    Payment(){
        initializeUI();
    }
    
    private void initializeUI() {
        setBounds(500, 200, 800, 600);
        setLayout(null);
        
        // Create a panel with background image
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image bgImage = new ImageIcon("icons/paytm.jpeg").getImage();
                g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(null);
        panel.setBounds(0, 0, 800, 600);
        add(panel);
        
        // Buttons for payment options
        upi = new JButton("UPI");
        upi.setBounds(120, 10, 80, 40);
        upi.addActionListener(this);
        panel.add(upi);
        
        netBanking = new JButton("Net Banking");
        netBanking.setBounds(220, 10, 120, 40);
        netBanking.addActionListener(this);
        panel.add(netBanking);
        
        card = new JButton("Card");
        card.setBounds(360, 10, 80, 40);
        card.addActionListener(this);
        panel.add(card);
        
        back = new JButton("Back");
        back.setBounds(620, 10,  80, 40);
        back.addActionListener(this);
        panel.add(back);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == upi){
            JOptionPane.showMessageDialog(this, "Redirecting to UPI payment page...");
            // Implement logic to redirect to UPI payment page
        } else if(ae.getSource() == netBanking) {
            JOptionPane.showMessageDialog(this, "Redirecting to Net Banking payment page...");
            // Implement logic to redirect to Net Banking payment page
        } else if(ae.getSource() == card) {
            JOptionPane.showMessageDialog(this, "Redirecting to Card payment page...");
            // Implement logic to redirect to Card payment page
        } else if(ae.getSource() == back) {
            setVisible(false);
            // Write code here to go back to the previous frame or window
        }
    }
    
    public static void main(String[] args){
        new Payment();  
    }
}
