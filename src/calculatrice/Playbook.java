package calculatrice;

import javax.swing.SwingUtilities;



public class Playbook {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CalculatriceScientifique();
			}
		});

	}

}
