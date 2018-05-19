package maps;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


import maps.cities.*;

public class Main {

	public static void runGUI() {
		
		JFrame frame = new JFrame("Maps");
		frame.pack();
		frame.setSize(770, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		String filename ="src/cities.csv";
		
		Cities cities = new Cities(filename);
		MapGUI gui = new MapGUI(cities);
		frame.getContentPane().add(gui.getSearchPanel(), BorderLayout.NORTH);
		frame.getContentPane().add(gui.getMapPanel(), BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				runGUI();
			}
		});
	}
}
