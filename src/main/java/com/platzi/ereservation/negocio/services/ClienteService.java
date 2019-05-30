/**
 * 
 */
package com.platzi.ereservation.negocio.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;

/**
 * Clase para definir los servicios de cliente
 * 
 * @author arturolg
 *
 */
@Service
@Transactional(readOnly=true)
public class ClienteService {
	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	/**
	 * Método para realizar la operación de guardar un cliente
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Método para realizar la operación de actualizar un cliente
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Método para realizar la operación de eliminar un cliente
	 * @param cliente
	 */
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	
	/**
	 * Método para consultar un cliente por su identificación
	 * @param identificacionCliente
	 * @return
	 */
	@Transactional
	public Cliente findByIdentificacion (String identificacionCliente) {
		return this.clienteRepository.findByIdentificacion(identificacionCliente);
	}
}
