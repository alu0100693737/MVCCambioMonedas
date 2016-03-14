package MCV;

import java.awt.GridLayout;
import javax.swing.JFrame;

//1JFrame 6 VistaPaneles sobre un mismo JFrame

public class VistaCambioMoneda extends JFrame {
	
	private VistaMonedaBelgFranc panelBelgFranc;
	private VistaMonedaDM panelDM;
	private VistaMonedaFranzFranc panelFranzFranc;
	private VistaMonedaIrPfund panelIrPfund;
	private VistaMonedaItalicLira panelItalicLira;
	private VistaMonedaUS panelUS;
	
	public VistaCambioMoneda() {
		panelBelgFranc = new VistaMonedaBelgFranc();
		panelDM = new VistaMonedaDM();
		panelFranzFranc = new VistaMonedaFranzFranc();
		panelIrPfund = new VistaMonedaIrPfund();
		panelItalicLira = new VistaMonedaItalicLira();
		panelUS = new VistaMonedaUS();
		setLayout(new GridLayout(6, 1, 5, 5));
		add(getPanelDM());
		add(getPanelBelgFranc());
		add(getPanelFranzFranc());
		add(getPanelIrPfund());
		add(getPanelItalicLira());
		add(getPanelUS());
	}
	
	VistaMonedaBelgFranc getPanelBelgFranc() {
		return panelBelgFranc;
	}
	
	VistaMonedaDM getPanelDM() {
		return panelDM;
	}
	
	VistaMonedaFranzFranc getPanelFranzFranc() {
		return panelFranzFranc;
	}
	
	VistaMonedaIrPfund getPanelIrPfund() {
		return panelIrPfund;
	}
	
	VistaMonedaItalicLira getPanelItalicLira() {
		return panelItalicLira;
	}
	
	VistaMonedaUS getPanelUS() {
		return panelUS;
	}
}
