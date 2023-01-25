package fpDual2023EcomerceJSF.negocio.validadores;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import fpDual2023EcomerceJSF.negocio.validadores.excepciones.CodigoErrorEnum;
import fpDual2023EcomerceJSF.negocio.validadores.excepciones.RestriccionViolada;
import fpDual2023EcomerceJSF.negocio.validadores.excepciones.ValidacionFallidaException;

public class ValidadorNegocioMoneda {
	private final String moneda;

	public ValidadorNegocioMoneda(String moneda) {
		super();
		this.moneda = moneda;
	}

	public void validar() throws ValidacionFallidaException {
		Set<RestriccionViolada>restriccionesVioladas=new HashSet<>();
		
		this.validarObligatoriedad().ifPresent(restriccionesVioladas::add);
		this.validarIntegridadDatos().ifPresent(rv->restriccionesVioladas.add(rv));
		
		if(!restriccionesVioladas.isEmpty()) {
			throw new ValidacionFallidaException(restriccionesVioladas);
		}
		
	}
	
	
	private Optional<RestriccionViolada> validarObligatoriedad(){
		if(this.moneda==null || this.moneda.isEmpty()) {
			return Optional.of(new RestriccionViolada(CodigoErrorEnum.MONEDA_OBLIGATORIA));
		}
		
		return  Optional.empty();
	}
	
	private Optional<RestriccionViolada> validarIntegridadDatos(){
		if(this.moneda==null) {
			return Optional.empty();
		}
		
		if(this.moneda.trim().isEmpty()) {
			return Optional.of(new RestriccionViolada(CodigoErrorEnum.MONEDA_EN_BLANCO)); 
		}
		
		Optional<MonedasPermitidasEnum>monedaPermitida=MonedasPermitidasEnum.getPorCodigo(this.moneda);
		
		if(!monedaPermitida.isPresent()) {
			return Optional.of(new RestriccionViolada(CodigoErrorEnum.MONEDA_NO_EXISTE));
		}
		
		return Optional.empty();
	}
}
