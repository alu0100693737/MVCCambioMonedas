package MCV;

public class ControllerCambioMoneda {

	private ModeloMonedaBelgFranc monedaBelgFranc;
	private ModeloMonedaFranzFranc monedaFranzFranc;
	private ModeloMonedaDM monedaDM;
	private ModeloMonedaIrPfund monedaIrPund;
	private ModeloMonedaItalicLira monedaItalicLira;
	private ModeloMonedaUS monedaUs;

	private double valorEntrada;

	public ControllerCambioMoneda() {

		setValorEntrada(0);

		monedaBelgFranc = new ModeloMonedaBelgFranc();
		monedaFranzFranc = new ModeloMonedaFranzFranc();
		monedaDM = new ModeloMonedaDM();
		monedaIrPund = new ModeloMonedaIrPfund();
		monedaItalicLira = new ModeloMonedaItalicLira();
		monedaUs = new ModeloMonedaUS();
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

	public void updateView(double dato) {
		setValorEntrada(dato);
		//trabajamos sobre el dato de la clase, no el parametro
		
		//hacemos moneda.convert y lo metemos en la vista
	}

}
