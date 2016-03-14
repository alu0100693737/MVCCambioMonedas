package MCV;

public class ControllerCambioMoneda {

	private ModeloMonedaBelgFranc monedaBelgFranc;
	private ModeloMonedaFranzFranc monedaFranzFranc;
	private ModeloMonedaDM monedaDM;
	private ModeloMonedaIrPfund monedaIrPund;
	private ModeloMonedaItalicLira monedaItalicLira;
	private ModeloMonedaUS monedaUs;

	private VistaCambioMoneda vistaCambioMoneda;
	
	private double valorEntrada;

	public ControllerCambioMoneda() {

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

	public ModeloMonedaBelgFranc getMonedaBelgFranc() {
		return monedaBelgFranc;
	}

	public ModeloMonedaFranzFranc getMonedaFranzFranc() {
		return monedaFranzFranc;
	}

	public ModeloMonedaDM getMonedaDM() {
		return monedaDM;
	}

	public ModeloMonedaIrPfund getMonedaIrPund() {
		return monedaIrPund;
	}

	public ModeloMonedaItalicLira getMonedaItalicLira() {
		return monedaItalicLira;
	}

	public ModeloMonedaUS getMonedaUs() {
		return monedaUs;
	}

	public VistaCambioMoneda getVistaCambioMoneda() {
		return vistaCambioMoneda;
	}
	
	//Actualizacion de la calculadora panel
	public void updateView(double dato) {
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
}
