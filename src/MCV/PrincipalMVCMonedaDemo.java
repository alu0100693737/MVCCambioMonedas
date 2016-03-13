package MCV;

import javax.swing.JFrame;

public class PrincipalMVCMonedaDemo {
	public static void main(String[] args) {
		VistaCambioMoneda prueba = new VistaCambioMoneda();
		prueba.setTitle("Currency Changer");
    prueba.setSize(280, 700);
    prueba.setLocationRelativeTo(null); // Center the frame
    prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    prueba.setVisible(true);
	}

}
