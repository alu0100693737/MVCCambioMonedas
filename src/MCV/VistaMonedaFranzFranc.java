package MCV;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class VistaMonedaFranzFranc extends MiJPanel {
	
	private JLabel jlblresultado1;
  private JTextField jlblentrada;
  private JTextField jlblresultado2;
  private JButton calcular;
  
	public VistaMonedaFranzFranc() {
		Border bordergray = new LineBorder(Color.DARK_GRAY, 1);
		
		JLabel jlblFranzFranc = new JLabel("Franz.Franc");
		jlblFranzFranc.setForeground(Color.BLUE);
		JLabel jlblFranzFranc1 = new JLabel("Franz.Franc");
		jlblFranzFranc1.setForeground(Color.BLUE);
		
	  jlblresultado1 = new JLabel("resultado1");
	  jlblentrada = new JTextField("entrada");
	  jlblresultado2 = new JTextField("resultado2");
	  getResultado1().setPreferredSize(new Dimension(32, 24));
	  
	  calcular = new JButton("Calcular");
	  getbtnCalcular().setBackground(Color.orange);
		getbtnCalcular().addActionListener(new ControllerCambioMoneda.OyenteBotonFranzFranc());
	  
	  getResultado1().setBorder(bordergray);
	  getP1().add(getjlblEurosis());
	  getP1().add(getResultado1());
	  getP1().add(jlblFranzFranc1);
	  getP1().add(getbtnCalcular());

	  getEntrada().setBorder(bordergray);
	  getResultado2().setBorder(bordergray);
	  
	  getP2().add(getjlblEuro());
	  getP2().add(jlblFranzFranc);
	  getP2().add(getEntrada());
	  getP2().add(getResultado2());
	  
	  setBorder(javax.swing.BorderFactory.
	      createTitledBorder(null, "Franz.Franc", javax.swing.border.
	      TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
	      TitledBorder.DEFAULT_POSITION, null, java.awt.Color.orange));
	 
	  add(getP1());
	  add(getP2());
	}
	
	JLabel getResultado1() {
		return jlblresultado1;
	}
	
	public double getDoubleEntrada() {
		return Double.parseDouble(jlblentrada.getText());
	}
	
	public JButton getbtnCalcular() {
		return calcular;
	}
	
	void setResultado1(double dato) {
		getResultado1().setText(String.valueOf(dato));
	}
	
	JTextField getResultado2() {
		return jlblresultado2;
	}
	
	void setResultado2(double dato) {
		DecimalFormat df = new DecimalFormat("#.##");
		jlblresultado2.setText(String.valueOf(df.format(dato)));
	}
	
	JTextField getEntrada() {
		return jlblentrada;
	}
	
	void setEntrada(double dato) {
		getEntrada().setText(String.valueOf(dato));
	}
}
