package calculatrice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.NumberFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class CalculatriceScientifique {
	
	//ajout d un champ de text
	private JFormattedTextField jft = new JFormattedTextField(NumberFormat.getIntegerInstance());
	
	
	CalculatriceScientifique(){
		//creation de la fenetre
		JFrame f = new JFrame(" Calculatrice ");
		f.setSize(450, 650);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// couleur de fond 
		JPanel pan = new JPanel();
		pan.setBackground(Color.DARK_GRAY);
		
		jft.setPreferredSize(new Dimension(200,60));
		jft.setBackground(Color.lightGray);
		pan.add(jft);
		
		//ajout des JLabel et des JButton
		GridLayout gl = new GridLayout();
		gl.setColumns(5);
		gl.setRows(9);
		gl.setHgap(10);
		gl.setVgap(10);
		gl.addLayoutComponent(null, pan);
        pan.setLayout(gl);
		
		
		
		
		f.setContentPane(pan);
		f.setVisible(true);
	}



}
