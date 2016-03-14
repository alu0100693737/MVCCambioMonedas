package MCV;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class VistaMonedaIrPfund extends MiJPanel {
	private JTextField jlblresultado1;
  private JTextField jlblentrada;
  private JTextField jlblresultado2;
  
  public VistaMonedaIrPfund() {
		Border bordergray = new LineBorder(Color.DARK_GRAY, 1);
		
		JLabel jlblIrPfund = new JLabel("Ir.Pfund");
		jlblIrPfund.setForeground(Color.BLUE);
		JLabel jlblIrPfund1 = new JLabel("Ir.Pfund");
		jlblIrPfund.setForeground(Color.BLUE);
		
	  jlblresultado1 = new JTextField("resultado1");
	  jlblentrada = new JTextField("entrada");
	  jlblresultado2 = new JTextField("resultado2");
	  
	  getResultado1().setBorder(bordergray);
	  getP1().add(getjlblEurosis());
	  getP1().add(getResultado1());
	  getP2().add(jlblIrPfund1);

	  getEntrada().setBorder(bordergray);
	  getResultado2().setBorder(bordergray);
	  
	  getP2().add(getjlblEuro());
	  getP2().add(jlblIrPfund);
	  getP2().add(getEntrada());
	  getP2().add(getResultado2());
	  
	  setBorder(javax.swing.BorderFactory.
	      createTitledBorder(null, "Ir.Pfund", javax.swing.border.
	      TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
	      TitledBorder.DEFAULT_POSITION, null, java.awt.Color.GRAY));
	  
	  add(getP1());
	  add(getP2());
	}
	
	JTextField getResultado1() {
		return jlblresultado1;
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
