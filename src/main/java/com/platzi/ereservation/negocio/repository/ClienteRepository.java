/**
 * 
 */
package com.platzi.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Cliente;

/**
 * Interface para definir las operaciones de BD relacionadas con  Cliente
 * @author arturolg
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{

	/**
	 * Definición de método para buscar clientes por apellido
	 * @param apellidoCliente
	 * @return
	 */
	public List<Cliente> findByApellidoCliente(String apellidoCliente);
	
	public Cliente findByIdentificacion (String identificadorCliente);
	
}
