/**
 * 
 */
package com.platzi.ereservation.modelo;

import lombok.Data;

/**
 * clase que representa la tabla cliente
 * @author cesar
 *
 *
 * lombok generates getters and setter behind the scenes
 */
@Data
public class Cliente {
	String nombreCli;
	String apellidoCli;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}	
}
