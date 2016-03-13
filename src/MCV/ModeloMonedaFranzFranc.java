package MCV;

final public class ModeloMonedaFranzFranc extends ModeloCambioMoneda {
	private final double FranzFranc = 6.56;
	
	public ModeloMonedaFranzFranc() { }
	
	public double getFranzFranc() {
		return FranzFranc;
	}
	
	@Override
	double convertir(double valorEntrada) {
		return getFranzFranc() * valorEntrada;
	}
}
