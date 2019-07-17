package sensorVelocity;

import sensorVelocity.clase2.EvaluadorMultas;

public class Sensor {
	private sensorclima.Sensor clima;
	private sensorvelocidad.Sensor velocidad;
	private EvaluadorMultas eva;
	public Sensor(sensorclima.Sensor clima, sensorvelocidad.Sensor velocidad, EvaluadorMultas eva) {
		super();
		this.clima = clima;
		this.velocidad = velocidad;
		this.eva = eva;
	}
	
	public Sensor() {
		
	}
	
	
}
