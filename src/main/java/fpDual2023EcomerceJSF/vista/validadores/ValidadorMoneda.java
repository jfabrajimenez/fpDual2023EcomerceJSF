package fpDual2023EcomerceJSF.vista.validadores;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import fpDual2023EcomerceJSF.negocio.validadores.ValidadorNegocioMoneda;
import fpDual2023EcomerceJSF.negocio.validadores.excepciones.ValidacionFallidaException;

@FacesValidator("validadorMoneda")
public class ValidadorMoneda implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

		if (value instanceof String || value == null) {
			ValidadorNegocioMoneda validadorNegocio = new ValidadorNegocioMoneda((String) value);

			try {
				validadorNegocio.validar();
			} catch (ValidacionFallidaException e) {
				Collection<FacesMessage> mensajes = e.getRestriccionesVioladas()
						.stream().map(rv -> new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de moneda", rv.getDescripcion()))
						.collect(Collectors.toSet());

				throw new ValidatorException(mensajes);
			}

		}

	}

}
