package Ejercicios;

public class persona {

		/**
		 * Asignacion de atributos
		 * 
		 */
		private String nombre;						
		private String apellido;
		private int edad;
		private String DNI;
		
		/**
		 * 	Constructora
		 * @param nombre
		 * @param apellido
		 */
		public persona (String nombre, String apellido) {     
			
			this.nombre= nombre;
			this.apellido= apellido;
			
		}
		/**
		 * Metodo
		 * @return
		 */
		public String getNombre () {      
			return this.nombre;
		
		}
		}


