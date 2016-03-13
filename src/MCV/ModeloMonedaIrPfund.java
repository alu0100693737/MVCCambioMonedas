package MCV;

final public class ModeloMonedaIrPfund extends ModeloCambioMoneda {
	private final double IRPFUND= 0.79;
	
	public ModeloMonedaIrPfund() { }
	
	public double getIrPfund() {
		return IRPFUND;
	}
	
	@Override
	double convertir(double valorEntrada) {
		return getIrPfund() * valorEntrada;
	}
}
