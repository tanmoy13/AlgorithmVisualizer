import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class front extends JFrame{

	front()
	{
		setTitle("Algorithm Visualizer");
		setContentPane( new JLabel(new ImageIcon("2.jpg")));
		setSize(1360, 720);
		
		JButton Lsearch= new JButton("Linear Search");
		Lsearch.setBounds(100, 50, 150, 30);
		Lsearch.setBackground(Color.WHITE);
		Lsearch.setForeground(Color.BLUE);
		Lsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new LinearSearch();
				
			}
		} );
		add(Lsearch);
		JButton about= new JButton("About");
		about.setBounds(1200, 600, 100, 30);
		about.setBackground(Color.WHITE);
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame abut= new JFrame();
				abut.setTitle("About");
				abut.setSize(500, 200);
				abut.add(new JLabel("           This app is devolped by :    Tanmoy Tapos Datta  and  Najmus Sakib"));
				abut.setVisible(true);
			}
		});
		add(about);
		setVisible(true);
	}
}
