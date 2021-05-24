package calculatrice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.NumberFormat;

import javax.swing.JButton;
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
		f.setResizable(false);
		
		// couleur de fond 
		JPanel pan = new JPanel();
		pan.setBackground(Color.DARK_GRAY);
		
		
		jft.setBounds(1, 1,0 , 0);
		jft.setPreferredSize(new Dimension(800,60));
		jft.setBackground(Color.lightGray);
		jft.setBounds(1, 1, 432, 70);
		pan.add(jft);
		
		//ajout des JLabel et des JButton
		JButton button1 = new JButton("SHIFT");
		button1.setBounds(20, 80, 70, 20);
		pan.add(button1);
		JButton button2 = new JButton("MENU");
		button2.setBounds(100, 80, 70, 20);
		pan.add(button2);
		JButton button3 = new JButton("<|");
		button3.setBounds(180, 80, 70, 20);
		pan.add(button3);
		JButton button4 = new JButton("|>");
		button4.setBounds(260, 80, 70, 20);
		pan.add(button4);
		JButton button5 = new JButton("DEL");
		button5.setBounds(340, 80, 70, 20);
		pan.add(button5);
		JButton button6 = new JButton("AC");
		button6.setBounds(20, 130, 70, 20);
		pan.add(button6);
		JButton button7 = new JButton("DRG");
		button7.setBounds(100, 130, 70, 20);
		pan.add(button7);
		JButton button8 = new JButton("x<=>E");
		button8.setBounds(180, 130, 70, 20);
		pan.add(button8);
		JButton button9 = new JButton("...");
		button9.setBounds(260, 130, 70, 20);
		pan.add(button9);
		JButton button10 = new JButton("Σ ");
		button10.setBounds(340, 130, 70, 20);
		pan.add(button10);
		JButton button11 = new JButton("∫dx");
		button11.setBounds(20, 180, 70, 20);
		pan.add(button11);
		JButton button12 = new JButton("CONV");
		button12.setBounds(100, 180, 70, 20);
		pan.add(button12);
		JButton button13 = new JButton("π");
		button13.setBounds(180, 180, 70, 20);
		pan.add(button13);
		JButton button14 = new JButton("sin");
		button14.setBounds(260, 180, 70, 20);
		pan.add(button14);
		JButton button15 = new JButton("cos");
		button15.setBounds(340, 180, 70, 20);
		pan.add(button15);
		JButton button16 = new JButton("..");
		button16.setBounds(20, 230, 70, 20);
		pan.add(button16);
		JButton button17 = new JButton(".");
		button17.setBounds(100, 230, 70, 20);
		pan.add(button17);
		JButton button18 = new JButton("e");
		button18.setBounds(180, 230, 70, 20);
		pan.add(button18);
		JButton button19 = new JButton("x^-1");
		button19.setBounds(260, 230, 70, 20);
		pan.add(button19);
		JButton button20 = new JButton("x^2");
		button20.setBounds(340, 230, 70, 20);
		pan.add(button20);
		JButton button21 = new JButton("x^1/2");
		button21.setBounds(20, 280, 70, 20);
		pan.add(button21);
		JButton button22 = new JButton("x^y");
		button22.setBounds(100, 280, 70, 20);
		pan.add(button22);
		JButton button23 = new JButton("log");
		button23.setBounds(180, 280, 70, 20);
		pan.add(button23);
		JButton button24 = new JButton("ln");
		button24.setBounds(260, 280, 70, 20);
		pan.add(button24);
		JButton button25 = new JButton("D'M'S");
		button25.setBounds(340, 280, 70, 20);
		pan.add(button25);
		JButton button26 = new JButton("d/c");
		button26.setBounds(20, 330, 70, 20);
		pan.add(button26);
		JButton button27 = new JButton("X");
		button27.setBounds(100, 330, 70, 20);
		pan.add(button27);
		JButton button28 = new JButton("RCL");
		button28.setBounds(180, 330, 70, 20);
		pan.add(button28);
		JButton button29 = new JButton("MR");
		button29.setBounds(260, 330, 70, 20);
		pan.add(button29);
		JButton button30 = new JButton("x->M");
		button30.setBounds(340, 330, 70, 20);
		pan.add(button30);
		JButton button31 = new JButton("7");
		button31.setBounds(20, 380, 70, 20);
		pan.add(button31);
		JButton button32 = new JButton("8");
		button32.setBounds(100, 380, 70, 20);
		pan.add(button32);
		JButton button33 = new JButton("9");
		button33.setBounds(180, 380, 70, 20);
		pan.add(button33);
		JButton button34 = new JButton("(");
		button34.setBounds(260, 380, 70, 20);
		pan.add(button34);
		JButton button35 = new JButton(")");
		button35.setBounds(340, 380, 70, 20);
		pan.add(button35);
		JButton button36 = new JButton("4");
		button36.setBounds(20, 430, 70, 20);
		pan.add(button36);
		JButton button = new JButton("5");
		button.setBounds(100, 430, 70, 20);
		pan.add(button);
		JButton button37 = new JButton("6");
		button37.setBounds(180, 430, 70, 20);
		pan.add(button37);
		JButton button38 = new JButton("*");
		button38.setBounds(260, 430, 70, 20);
		pan.add(button38);
		JButton button39 = new JButton(" ÷");
		button39.setBounds(340, 430, 70, 20);
		pan.add(button39);
		JButton button40 = new JButton("1");
		button40.setBounds(20, 480, 70, 20);
		pan.add(button40);
		JButton button41 = new JButton("2");
		button41.setBounds(100, 480, 70, 20);
		pan.add(button41);
		JButton button42 = new JButton("3");
		button42.setBounds(180, 480, 70, 20);
		pan.add(button42);
		JButton button43 = new JButton("+");
		button43.setBounds(260, 480, 70, 20);
		pan.add(button43);
		JButton button44 = new JButton("-");
		button44.setBounds(340, 480, 70, 20);
		pan.add(button44);
		JButton button45 = new JButton("0");
		button45.setBounds(20, 530, 70, 20);
		pan.add(button45);
		JButton button46 = new JButton(".");
		button46.setBounds(100, 530, 70, 20);
		pan.add(button46);
		JButton button47 = new JButton("+/-");
		button47.setBounds(180, 530, 70, 20);
		pan.add(button47);
		JButton button48 = new JButton("EXP");
		button48.setBounds(260, 530, 70, 20);
		pan.add(button48);
		JButton button49 = new JButton("=");
		button49.setBounds(340, 530, 70, 20);
		pan.add(button49);
		
        
    
		
		
		pan.setLayout(null);
		
		f.setContentPane(pan);
		f.setVisible(true);
	}



}
