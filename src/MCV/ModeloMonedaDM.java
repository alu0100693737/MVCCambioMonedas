package MCV;

final public class ModeloMonedaDM extends ModeloCambioMoneda {

	private final double DM = 1.96;

	public ModeloMonedaDM() { }
	
	public double getDM() {
		return DM;
	}
	@Override
	double convertir(double valorEntrada) {
		return getDM() * valorEntrada;
	}
}

