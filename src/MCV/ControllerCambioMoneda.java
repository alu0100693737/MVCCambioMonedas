package MCV;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerCambioMoneda {

	private static ModeloMonedaBelgFranc monedaBelgFranc;
	private static ModeloMonedaFranzFranc monedaFranzFranc;
	private static ModeloMonedaDM monedaDM;
	private static ModeloMonedaIrPfund monedaIrPund;
	private static ModeloMonedaItalicLira monedaItalicLira;
	private static ModeloMonedaUS monedaUs;

	private static VistaCambioMoneda vistaCambioMoneda;
	
	private double valorEntrada;

	public ControllerCambioMoneda() {
		//controller

		setValorEntrada(0);
		
		vistaCambioMoneda = new VistaCambioMoneda();
		
		monedaBelgFranc = new ModeloMonedaBelgFranc();
		monedaFranzFranc = new ModeloMonedaFranzFranc();
		monedaDM = new ModeloMonedaDM();
		monedaIrPund = new ModeloMonedaIrPfund();
		monedaItalicLira = new ModeloMonedaItalicLira();
		monedaUs = new ModeloMonedaUS();
      
		//Inicializacion panel 1 euro es: ?
    getVistaCambioMoneda().getPanelBelgFranc().setResultado1(
      			getMonedaBelgFranc().getBelgFranc());
      
		
		getVistaCambioMoneda().getPanelDM().setResultado1(
				getMonedaDM().getDM());
		
		getVistaCambioMoneda().getPanelFranzFranc().setResultado1(
											getMonedaFranzFranc().getFranzFranc());
		
		getVistaCambioMoneda().getPanelIrPfund().setResultado1(
											getMonedaIrPund().getIrPfund());
		
		getVistaCambioMoneda().getPanelItalicLira().setResultado1(
				getMonedaItalicLira().getItaLira());
		
		getVistaCambioMoneda().getPanelUS().setResultado1(
				getMonedaUs().getUS());
	}

	public double getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(double valor) {
		valorEntrada = valor;
	}

	public static ModeloMonedaBelgFranc getMonedaBelgFranc() {
		return monedaBelgFranc;
	}

	public static ModeloMonedaFranzFranc getMonedaFranzFranc() {
		return monedaFranzFranc;
	}

	public static ModeloMonedaDM getMonedaDM() {
		return monedaDM;
	}

	public static ModeloMonedaIrPfund getMonedaIrPund() {
		return monedaIrPund;
	}

	public static ModeloMonedaItalicLira getMonedaItalicLira() {
		return monedaItalicLira;
	}

	public static ModeloMonedaUS getMonedaUs() {
		return monedaUs;
	}

	public static VistaCambioMoneda getVistaCambioMoneda() {
		return vistaCambioMoneda;
	}
	
	//Actualizacion de la calculadora panel por argumento 
	public void updateViewArgument(double dato) {
		setValorEntrada(dato);
		
		//Entradas
		getVistaCambioMoneda().getPanelBelgFranc().setEntrada(dato);
		
		getVistaCambioMoneda().getPanelDM().setEntrada(dato);
		
		getVistaCambioMoneda().getPanelFranzFranc().setEntrada(dato);
		
		getVistaCambioMoneda().getPanelIrPfund().setEntrada(dato);
		
		getVistaCambioMoneda().getPanelItalicLira().setEntrada(dato);
		
		getVistaCambioMoneda().getPanelUS().setEntrada(dato);
		
		//Resultados
		getVistaCambioMoneda().getPanelBelgFranc().setResultado2(
  			getMonedaBelgFranc().convertir(getValorEntrada()));
		
		getVistaCambioMoneda().getPanelDM().setResultado2(
  			getMonedaDM().convertir(getValorEntrada()));
		
		getVistaCambioMoneda().getPanelFranzFranc().setResultado2(
  			getMonedaFranzFranc().convertir(getValorEntrada()));
		
		getVistaCambioMoneda().getPanelIrPfund().setResultado2(
  			getMonedaIrPund().convertir(getValorEntrada()));
		
		getVistaCambioMoneda().getPanelItalicLira().setResultado2(
  			getMonedaItalicLira().convertir(getValorEntrada()));
		
		getVistaCambioMoneda().getPanelUS().setResultado2(
  			getMonedaUs().convertir(getValorEntrada()));

	}
	
	/** Gestiona la pulsación de los botones de forma interactiva*/
	public static class OyenteBotonBelg implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getVistaCambioMoneda().getPanelBelgFranc().setResultado2(
					getMonedaBelgFranc().convertir(getVistaCambioMoneda().
							getPanelBelgFranc().getDoubleEntrada()));
		}
	}
	
	public static class OyenteBotonDM implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getVistaCambioMoneda().getPanelDM().setResultado2(
					getMonedaDM().convertir(getVistaCambioMoneda().
							getPanelDM().getDoubleEntrada()));
		}
	}
	
	public static class OyenteBotonFranzFranc implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getVistaCambioMoneda().getPanelFranzFranc().setResultado2(
					getMonedaFranzFranc().convertir(getVistaCambioMoneda().
							getPanelFranzFranc().getDoubleEntrada()));
		}
	}
	
	public static class OyenteBotonIrPfund implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getVistaCambioMoneda().getPanelIrPfund().setResultado2(
					getMonedaIrPund().convertir(getVistaCambioMoneda().
							getPanelIrPfund().getDoubleEntrada()));
		}
	}
	
	public static class OyenteBotonItalicLira implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getVistaCambioMoneda().getPanelItalicLira().setResultado2(
					getMonedaItalicLira().convertir(getVistaCambioMoneda().
							getPanelItalicLira().getDoubleEntrada()));
		}
	}
	
	public static class OyenteBotonUS implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getVistaCambioMoneda().getPanelUS().setResultado2(
					getMonedaUs().convertir(getVistaCambioMoneda().
							getPanelUS().getDoubleEntrada()));
		}
	}
}
