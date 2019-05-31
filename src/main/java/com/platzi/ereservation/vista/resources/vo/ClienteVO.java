/**
 * 
 */
package com.platzi.ereservation.vista.resources.vo;

import lombok.Data;

/**
 * Entity para la tabla Cliente
 * @author arturolg
 *
 */
@Data
public class ClienteVO {
	private String nombreCliente;
	private String apellidoCliente;
	private String identificacionCliente;
	private String direccionCliente;
	private String telefonoCliente;
	private String emailCliente;
}
