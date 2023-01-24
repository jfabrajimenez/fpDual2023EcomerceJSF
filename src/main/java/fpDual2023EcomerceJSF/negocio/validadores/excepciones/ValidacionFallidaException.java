package fpDual2023EcomerceJSF.negocio.validadores.excepciones;

import java.util.Set;

public class ValidacionFallidaException extends Exception {
	private static final long serialVersionUID = -1222790983406314175L;

	private Set<RestriccionViolada>restriccionesVioladas;

	public ValidacionFallidaException(Set<RestriccionViolada> restriccionesVioladas) {
		super();
		this.restriccionesVioladas = restriccionesVioladas;
	}

	public Set<RestriccionViolada> getRestriccionesVioladas() {
		return restriccionesVioladas;
	}
	
	
}
