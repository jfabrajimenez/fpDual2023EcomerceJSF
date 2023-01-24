package fpDual2023EcomerceJSF.negocio.validadores.excepciones;

import java.util.Optional;

public class RestriccionViolada {
	private CodigoErrorEnum codigoError;

	public RestriccionViolada(CodigoErrorEnum codigoError) {
		super();
		this.codigoError = codigoError;
	}

	public Integer getCodigo() {
		return Optional.ofNullable(codigoError).map(CodigoErrorEnum::getCodigo).orElse(null);
	}

	public String getDescripcion() {
		if(this.codigoError!=null) {
			return codigoError.getDescripcion();
		}
		
		return null;
	}
	
	
}
