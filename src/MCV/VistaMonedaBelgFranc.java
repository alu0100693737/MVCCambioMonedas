package MCV;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class VistaMonedaBelgFranc extends MiJPanel{

	private JLabel jlblresultado1;
	private JTextField jlblentrada;
	private JTextField jlblresultado2;
	private JButton calcular;


	public VistaMonedaBelgFranc() {
		Border bordergray = new LineBorder(Color.DARK_GRAY, 1);

		JLabel jlblBelgFranc = new JLabel("Belg.Franc");
		jlblBelgFranc.setForeground(Color.BLUE);
		JLabel jlblBelgFranc1 = new JLabel("Belg.Franc");
		jlblBelgFranc1.setForeground(Color.BLUE);

		jlblresultado1 = new JLabel("resultado1");
		jlblentrada = new JTextField("entrada");
		jlblresultado2 = new JTextField("resultado2");
		getResultado1().setPreferredSize(new Dimension(35, 24));

		calcular = new JButton("Calcular");
		getbtnCalcular().setBackground(Color.pink);
		getbtnCalcular().addActionListener(new ControllerCambioMoneda.OyenteBotonBelg());

		getResultado1().setBorder(bordergray);
		getP1().add(getjlblEurosis());
		getP1().add(getResultado1());
		getP1().add(jlblBelgFranc1);
		getP1().add(getbtnCalcular());

		getEntrada().setBorder(bordergray);
		getResultado2().setBorder(bordergray);

		getP2().add(getjlblEuro());
		getP2().add(jlblBelgFranc);
		getP2().add(getEntrada());
		getP2().add(getResultado2());

		//setBorder(new TitledBorder("Belg. Franc"));
		setBorder(javax.swing.BorderFactory.
				createTitledBorder(null, "Belg.Franc", javax.swing.border.
						TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
						TitledBorder.DEFAULT_POSITION, null, java.awt.Color.pink));

		setLayout(new GridLayout(2, 1, 10, 10));

		add(getP1());
		add(getP2());
	}

	public JLabel getResultado1() {
		return jlblresultado1;
	}

	public JButton getbtnCalcular() {
		return calcular;
	}

	public void setResultado1(double dato) {
		jlblresultado1.setText(String.valueOf(dato));
	}

	public JTextField getResultado2() {
		return jlblresultado2;
	}

	public void setResultado2(double dato) {
		DecimalFormat df = new DecimalFormat("#.##");
		jlblresultado2.setText(String.valueOf(df.format(dato)));
	}

	public JTextField getEntrada() {
		return jlblentrada;
	}
	
	public double getDoubleEntrada() {
		return Double.parseDouble(jlblentrada.getText());
	}

	public void setEntrada(double dato) {
		jlblentrada.setText(String.valueOf(dato));
	}	
}
