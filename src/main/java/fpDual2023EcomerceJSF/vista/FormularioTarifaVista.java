package fpDual2023EcomerceJSF.vista;

import java.time.LocalDate;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class FormularioTarifaVista {

	private Long idMarca;
	private Long idProducto;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Long precioEnCentimos;
	private String codigoMoneda;

	public FormularioTarifaVista() {
		super();
	}

	public Long getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Long getPrecioEnCentimos() {
		return precioEnCentimos;
	}

	public void setPrecioEnCentimos(Long precioEnCentimos) {
		this.precioEnCentimos = precioEnCentimos;
	}

	public String getCodigoMoneda() {
		return codigoMoneda;
	}

	public void setCodigoMoneda(String codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}

}
