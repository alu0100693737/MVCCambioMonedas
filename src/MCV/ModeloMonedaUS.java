package MCV;

final public class ModeloMonedaUS extends ModeloCambioMoneda {
	private final double US = 1.06;
	
	public ModeloMonedaUS() { }
	
	public double getUS() {
		return US;
	}

	@Override
	double convertir(double valorEntrada) {
		return getUS() * valorEntrada;
	}
}
