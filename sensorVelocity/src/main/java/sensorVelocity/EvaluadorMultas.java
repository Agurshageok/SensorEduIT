package sensorVelocity;

import java.util.HashMap;

public class EvaluadorMultas {
	private sensorclima.Sensor clima;
	private sensorvelocidad.Sensor velocidad;
	private HashMap<Tupla, Long> multasMap;
	
	public void multar() {
		/**
		 * Logica de multas, generar los tickets, quizas?
		 * Multas deberian estar en multasMap, pensar en pasar a BDD;
		 */
		
	}
	
	public EvaluadorMultas() {
		this.clima = new sensorclima.Sensor();
		this.velocidad = new sensorvelocidad.Sensor();
		multasMap = new HashMap<Tupla, Long>();
	}

}
