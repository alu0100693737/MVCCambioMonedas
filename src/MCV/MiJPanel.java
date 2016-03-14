package MCV;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class MiJPanel extends JPanel {

	private JPanel p1;
	private JPanel p2;

	private JLabel jlbleuro;
	private JLabel jlbleurois;

	public MiJPanel() {
		
		p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
		p2 = new JPanel(new GridLayout(2, 2, 5, 5));

		jlbleuro = new JLabel("Euro");
		getjlblEuro().setForeground(Color.BLUE);
		jlbleurois = new JLabel("1 Euro is ");
		getjlblEurosis().setForeground(Color.BLUE);
		setLayout(new GridLayout(2, 1, 10, 10));
	}

	public JPanel getP1() {
		return p1;
	}

	public JPanel getP2() {
		return p2;
	}

	public JLabel getjlblEuro() {
		return jlbleuro;
	}

	public JLabel getjlblEurosis() {
		return jlbleurois;
	}
}
