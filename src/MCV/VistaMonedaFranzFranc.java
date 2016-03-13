package MCV;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class VistaMonedaFranzFranc extends JPanel {
	
	private JLabel jlblresultado1;
  private JLabel jlblentrada;
  private JLabel jlblresultado2;
  
	public VistaMonedaFranzFranc() {
		Border bordergray = new LineBorder(Color.DARK_GRAY, 1);
		
		JPanel p1 = new JPanel(new GridLayout(1, 3, 5, 5));
		JPanel p2 = new JPanel(new GridLayout(2, 2, 5, 5));
		
		JLabel jlbleuro = new JLabel("Euro");
		jlbleuro.setForeground(Color.BLUE);
		JLabel jlbleurois = new JLabel("1 Euro is ");
		jlbleurois.setForeground(Color.BLUE);
		JLabel jlblFranzFranc = new JLabel("Franz.Franc");
		jlblFranzFranc.setForeground(Color.BLUE);
		JLabel jlblFranzFranc1 = new JLabel("Franz.Franc");
		jlblFranzFranc1.setForeground(Color.BLUE);
		
	  jlblresultado1 = new JLabel("resultado1");
	  jlblentrada = new JLabel("entrada");
	  jlblresultado2 = new JLabel("resultado2");
	  
	  getResultado1().setBorder(bordergray);
	  p1.add(jlbleurois);
	  p1.add(getResultado1());
	  p1.add(jlblFranzFranc1);

	  jlblentrada.setBorder(bordergray);
	  jlblresultado2.setBorder(bordergray);
	  
	  p2.add(jlbleuro);
	  p2.add(jlblFranzFranc);
	  p2.add(getEntrada());
	  p2.add(getResultado2());
	  

	  setBorder(javax.swing.BorderFactory.
	      createTitledBorder(null, "Franz.Franc", javax.swing.border.
	      TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
	      TitledBorder.DEFAULT_POSITION, null, java.awt.Color.orange));
	  
	  setLayout(new GridLayout(2, 1, 10, 10));
	  add(p1);
	  add(p2);
	}
	
	JLabel getResultado1() {
		return jlblresultado1;
	}
	
	void setResultado1(double dato) {
		jlblresultado1 = new JLabel(String.valueOf(dato));
	}
	
	JLabel getResultado2() {
		return jlblresultado2;
	}
	
	void setResultado2(double dato) {
		jlblresultado2 = new JLabel(String.valueOf(dato));
	}
	
	JLabel getEntrada() {
		return jlblentrada;
	}
	
	void setEntrada(double dato) {
		jlblentrada = new JLabel(String.valueOf(dato));
	}
}
