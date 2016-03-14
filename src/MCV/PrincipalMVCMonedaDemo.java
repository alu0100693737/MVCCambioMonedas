package MCV;

import javax.swing.JFrame;

public class PrincipalMVCMonedaDemo {
	public static void main(String[] args) {
		ControllerCambioMoneda prueba = new ControllerCambioMoneda();
		prueba.updateViewArgument(Double.parseDouble(args[0]));
		prueba.getVistaCambioMoneda().setTitle("Currency Changer");
		prueba.getVistaCambioMoneda().setSize(280, 700);
		prueba.getVistaCambioMoneda().setLocationRelativeTo(null); // Center the frame
		prueba.getVistaCambioMoneda().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.getVistaCambioMoneda().setVisible(true);
	}

}
