package fpDual2023EcomerceJSF.negocio.validadores.excepciones;

public enum CodigoErrorEnum {
	MONEDA_NO_EXISTE(1, "La moneda introducida no  existe"),
	MONEDA_OBLIGATORIA(2,"La moneda es obligatoria"),
	MONEDA_EN_BLANCO(3, "La moneda no puede ser espacios en blanco");
	
	private final Integer codigo;
	private final String descripcion;
	
	private CodigoErrorEnum(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}
