package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    
    About(){
        setBounds(600, 200, 600, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("About");
        l1.setBounds(200, 10, 100, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);
        
        String s = "About Projects        \n" + 
                " \n" +
                "Description:\n" +
                 " * Hello there! I am [PRABHAT PRAJAPATI], the developer behind this Travel and Tourism Management System project in Java.\n" +
                 " * As a passionate programmer and a lover of travel, I embarked on this project to combine my technical skills\n" +
                 " * with my interest in the tourism industry. This system is designed to streamline and enhance various aspects\n" +
                 " * of travel management, making it easier for both travelers and service providers to interact and organize trips.\n" +
                 " \n " +
                
                "The objective of the Travel and tourism Management Systemproject is to develop a system that automates the processes and activities of a travel and the purpose is to design a system using which one can perform all operations related to traveling. \n" +
                "\n" +
                "This application will help in accessing the information related to the travel to the particular destination with great ease. The users can track the information related to their tours by this application. The travel agency information can also be obtained through this application.\n" +
                " \n" +
                
                "Advantages of Project:\n"+
                "Gives accurate information\n"+
                "Simlifies the manual work\n" +
                "It minimizes the documentation related work\n" +
                "Provides up to date information\n" +
                "Friendly Environment by p roviding warning messages.\n" +
                "Travelers details can be provided\n" +
                "booking confirmation notification" ;
        
        TextArea area = new TextArea(s, 100, 80, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(80, 100, 450, 300);
        add(area);
        
        JButton back = new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
        public static void main(String args[]){
            new About();
        }
}
