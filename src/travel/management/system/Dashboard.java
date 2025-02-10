package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
   
    String username;
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkpackage, bookpackage, viewpackage, viewhotels, destinations;
    JButton bookhotels, viewBookedHotel, payments, calculators, notepad, about, deletePersonalDetails;
    
    Dashboard(String username){
        this.username = username;
        // Set the frame to maximized state
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
      
        // Top panel
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
      
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
      
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
      
        // Sidebar panel
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        p2.setOpaque(false); // Make panel transparent
        add(p2);
      
        // Button setup
        addPersonalDetails = new JButton("Add Personal Details");
        configureButton(addPersonalDetails, 0);
        p2.add(addPersonalDetails);
      
        updatePersonalDetails = new JButton("Update Personal Details");
        configureButton(updatePersonalDetails, 50);
        p2.add(updatePersonalDetails);
      
        viewPersonalDetails = new JButton("View Details");
        configureButton(viewPersonalDetails, 100);
        p2.add(viewPersonalDetails);
      
        deletePersonalDetails = new JButton("Delete Personal Details");
        configureButton(deletePersonalDetails, 150);
        p2.add(deletePersonalDetails);
      
        checkpackage = new JButton("Check Package");
        configureButton(checkpackage, 200);
        p2.add(checkpackage);
      
        bookpackage = new JButton("Book Package");
        configureButton(bookpackage, 250);
        p2.add(bookpackage);
      
        viewpackage = new JButton("View Package");
        configureButton(viewpackage, 300);
        p2.add(viewpackage);
      
        viewhotels = new JButton("View Hotels");
        configureButton(viewhotels, 350);
        p2.add(viewhotels);
      
        bookhotels = new JButton("Book Hotels");
        configureButton(bookhotels, 400);
        p2.add(bookhotels);
      
        viewBookedHotel = new JButton("View Booked Hotels");
        configureButton(viewBookedHotel, 450);
        p2.add(viewBookedHotel);
      
        destinations = new JButton("Destinations");
        configureButton(destinations, 500);
        p2.add(destinations);
      
        payments = new JButton("Payments");
        configureButton(payments, 550);
        p2.add(payments);
      
        calculators = new JButton("Calculators");
        configureButton(calculators, 600);
        p2.add(calculators);
      
        notepad = new JButton("Notepad");
        configureButton(notepad, 650);
        p2.add(notepad);
      
        about = new JButton("About");
        configureButton(about, 700);
        p2.add(about);
      
        // Background image setup
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
      
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 55));
        image.add(text);
      
        setVisible(true);
    }
    
    // Method to configure buttons
    private void configureButton(JButton button, int yPosition) {
        button.setBounds(0, yPosition, 300, 50);
        button.setBackground(new Color(0, 0, 102));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        } else if(ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
        } else if(ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        } else if(ae.getSource() == checkpackage){
            new CheckPackage();
        } else if(ae.getSource() == bookpackage){
            new BookPackage(username);
        } else if(ae.getSource() == viewpackage){
            new ViewPackage(username);
        } else if(ae.getSource() == viewhotels){
            new CheckHotels();
        } else if(ae.getSource() == destinations){
            new Destinations();
        } else if(ae.getSource() == bookhotels) {
            new BookHotel(username);
        } else if(ae.getSource() == viewBookedHotel){
            new ViewBookedHotel(username);
        } else if(ae.getSource() == payments){
            new Payment();
        } else if(ae.getSource() == calculators){
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else if(ae.getSource() == notepad){
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else if(ae.getSource() == about){
            new About();
        } else if(ae.getSource() == deletePersonalDetails){
            new DeleteDetails(username);
        }
    }

    public static void main(String args[]){
        new Dashboard("");
    }
}

