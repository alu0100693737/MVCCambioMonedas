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

public class VistaMonedaBelgFranc extends JPanel{
	
	private JTextField jlblresultado1;
  private JTextField jlblentrada;
  private JTextField jlblresultado2;
  
	public VistaMonedaBelgFranc() {
		Border bordergray = new LineBorder(Color.DARK_GRAY, 1);
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
		JPanel p2 = new JPanel(new GridLayout(2, 2, 5, 5));
		
		JLabel jlbleuro = new JLabel("Euro");
		jlbleuro.setForeground(Color.BLUE);
		JLabel jlbleurois = new JLabel("1 Euro is ");
		jlbleurois.setForeground(Color.BLUE);
		JLabel jlblBelgFranc = new JLabel("Belg.Franc");
		jlblBelgFranc.setForeground(Color.BLUE);
		JLabel jlblBelgFranc1 = new JLabel("Belg.Franc");
		jlblBelgFranc1.setForeground(Color.BLUE);
		
	  jlblresultado1 = new JTextField("resultado1");
	  jlblentrada = new JTextField("entrada");
	  jlblresultado2 = new JTextField("resultado2");
	  
	  getResultado1().setBorder(bordergray);
	  p1.add(jlbleurois);
	  p1.add(getResultado1());
	  p1.add(jlblBelgFranc1);
	  
	  getEntrada().setBorder(bordergray);
	  getResultado2().setBorder(bordergray);
	  
	  p2.add(jlbleuro);
	  p2.add(jlblBelgFranc);
	  p2.add(getEntrada());
	  p2.add(getResultado2());
	  
	  //setBorder(new TitledBorder("Belg. Franc"));
	  setBorder(javax.swing.BorderFactory.
	      createTitledBorder(null, "Belg.Franc", javax.swing.border.
	      TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
	      TitledBorder.DEFAULT_POSITION, null, java.awt.Color.red));
	  
	  setLayout(new GridLayout(2, 1, 10, 10));
	  
	  add(p1);
	  add(p2);
	}
	
	JTextField getResultado1() {
		return jlblresultado1;
	}
	
	void setResultado1(double dato) {
		jlblresultado1.setText(String.valueOf(dato));
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
		jlblentrada.setText(String.valueOf(dato));
	}	
}
