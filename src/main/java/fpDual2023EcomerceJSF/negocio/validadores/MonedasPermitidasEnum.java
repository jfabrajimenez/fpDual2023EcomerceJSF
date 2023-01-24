package fpDual2023EcomerceJSF.negocio.validadores;

import java.util.Arrays;
import java.util.Optional;

public enum MonedasPermitidasEnum {
	EURO("EUR"),
	DOLLAR("USD"),
	LIBRA("GBP"),
	RUPIA("INR"),
	PESETA("PST"),
	RUBLO("RUB");
	
	private final String codigo;

	private MonedasPermitidasEnum(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public static Optional<MonedasPermitidasEnum> getPorCodigo(String codigoMoneda){
		return Arrays.asList(MonedasPermitidasEnum.values()).stream().filter(monedaPermitida->monedaPermitida.getCodigo().equals(codigoMoneda)).findAny();
	}
}
