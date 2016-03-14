package MCV;

import javax.swing.JFrame;

public class PrincipalMVCMonedaDemo {
	public static void main(String[] args) {
		ControllerCambioMoneda prueba = new ControllerCambioMoneda();
		prueba.updateViewArgument(Double.parseDouble(args[0]));
		prueba.getVistaCambioMoneda().setTitle("Currency Changer");
		prueba.getVistaCambioMoneda().pack();
		prueba.getVistaCambioMoneda().setSize(280, 650);
		prueba.getVistaCambioMoneda().setLocationRelativeTo(null); // Center the frame
		prueba.getVistaCambioMoneda().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.getVistaCambioMoneda().setResizable(false);
		prueba.getVistaCambioMoneda().setVisible(true);
	}

}
