package fpDual2023EcomerceJSF.dto;

import java.time.LocalDate;
import java.util.Date;

public class TarifaDTO {
	private final Long idMarca;
	private final Long idProducto;
	private final Date fechaInicio;
	private final LocalDate fechaFin;
	private final Long precioEnCentimos;
	private final String codigoMoneda;

	public TarifaDTO(Long idMarca, Long idProducto, Date fechaInicio, LocalDate fechaFin, Long precioEnCentimos,
			String codigoMoneda) {
		super();
		this.idMarca = idMarca;
		this.idProducto = idProducto;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.precioEnCentimos = precioEnCentimos;
		this.codigoMoneda = codigoMoneda;
	}

	public Long getIdMarca() {
		return idMarca;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public Long getPrecioEnCentimos() {
		return precioEnCentimos;
	}

	public String getCodigoMoneda() {
		return codigoMoneda;
	}

}
