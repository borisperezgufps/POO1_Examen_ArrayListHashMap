package cliente;

import modelo.SistemaHotelero;

public class Cliente {

	public static void main(String[] args) {
		SistemaHotelero sh = new SistemaHotelero();
		
		sh.agregarReserva("R45", "Rafael Rodriguez", 3); // id reserva, nombre cliente, cantidad personas
		sh.agregarReserva("R17", "Mani Sepulveda", 2); // id reserva, nombre cliente, cantidad personas
		sh.agregarReserva("R96", "Tatiana Mendoza", 1); // id reserva, nombre cliente, cantidad personas
		sh.agregarReserva("R3", "Marco Adarme", 4); // id reserva, nombre cliente, cantidad personas
		
		// Debe generar la habitación, asignarla en la reserva, crear la entrada en el hashmap y agregar el huesped a la lista de esa habitación.
		sh.registrarHuesped("R3", "CC8865413", "Marco Adarme", 43); 
		sh.registrarHuesped("R3", "CC1456789123", "Sofia Benavides", 41); 
		
		// Este caso no debe permitirlo porque aun no ha llegado la persona de la reserva.
		sh.registrarHuesped("R17", "CC1023789456", "Tatiana Gutierrez", 35); 
		
		sh.registrarHuesped("R96", "CC1023789456", "Tatiana Mendoza", 29); 
		sh.registrarHuesped("R96", "CC63852147", "Eduard Puerto", 26); // A este no debe permitirlo porq esa reserva tiene 1 persona.
		
		sh.imprimirCantidadHuespedes("R3");
		sh.listarHuespedes("R3");
		sh.listarReservasSinHabitacion();

		sh.cancelarReserva("R45");
		
		sh.imprimirDatosReserva("R45");
		sh.imprimirDatosReserva("R17");
	}
	
}
