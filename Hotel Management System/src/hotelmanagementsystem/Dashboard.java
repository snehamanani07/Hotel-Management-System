/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel hms = new JLabel("THE TAJ GROUP WELCOMES YOU");
	hms.setForeground(Color.WHITE);
        hms.setFont(new Font("Tahoma", Font.PLAIN, 46));
	hms.setBounds(600, 60, 1000, 85);
	NewLabel.add(hms);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu hm = new JMenu("HOTEL MANAGEMENT");
        hm.setForeground(Color.BLUE);
	menuBar.add(hm);
		
        JMenuItem rec = new JMenuItem("RECEPTION");
	hm.add(rec);
		
	JMenu ad = new JMenu("ADMIN");
        ad.setForeground(Color.RED);
	menuBar.add(ad);
        
        JMenuItem emp = new JMenuItem("ADD EMPLOYEE");
	ad.add(emp);
        
        emp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        JMenuItem room = new JMenuItem("ADD ROOMS");
	ad.add(room);
        
        room.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	rec.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception().setVisible(true);
            }
	});
        
        
        JMenuItem dri = new JMenuItem("ADD DRIVERS");
	ad.add(dri);
        
	dri.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDriver().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
		
        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}