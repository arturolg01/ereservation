/**
 * 
 */
package com.platzi.ereservation.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Entity para la tabla Cliente
 * @author arturolg
 *
 */

@Data
@Entity
@Table (name = "cliente")
@NamedQuery(name="Cliente.findByIdentificacion", query="Select c from Cliente c where c.identificadorCliente = ?1")
public class Cliente {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid2")
	private String nombreCliente;
	private String apellidoCliente;
	private String identificadorCliente;
	private String direccionCliente;
	private String telefonoCliente;
	private String emailCliente;
	
	@OneToMany (mappedBy="cliente")
	private Set<Reserva> reservas;
}
