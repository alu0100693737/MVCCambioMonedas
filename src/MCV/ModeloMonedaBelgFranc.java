package MCV;

final public class ModeloMonedaBelgFranc extends ModeloCambioMoneda {
	
	private final double BELGFRANC = 40.34;

	public ModeloMonedaBelgFranc() { }

	public double getBelgFranc() {
		return BELGFRANC;
	}
	
	@Override
	double convertir(double valorEntrada) {
		return getBelgFranc() * valorEntrada;
	}
}
