package MCV;

final public class ModeloMonedaItalicLira extends ModeloCambioMoneda {
	private final double ITALIRA = 1936.27;

	public ModeloMonedaItalicLira() { }

	public double getItaLira() {
		return ITALIRA;
	}
	
	@Override
	double convertir(double valorEntrada) {
		return getItaLira() * valorEntrada;
	}
}