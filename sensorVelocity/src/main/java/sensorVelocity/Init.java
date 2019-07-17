package sensorVelocity;

import sensorVelocity.clase2.EvaluadorMultas;
import sensorVelocity.clase2.EvaluadorMultasLogger;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sensorvelocidad.Sensor sV = new sensorvelocidad.Sensor();
		sensorclima.Sensor sC = new sensorclima.Sensor();
		while(true) {
//			sensorvelocidad.DatosVehiculo datos = sV.sensarVehiculo();
//			sensorclima.TipoClima clima = sC.sensar();
		Sensor s = new Sensor(sC,sV,new EvaluadorMultasLogger(new EvaluadorMultas()));	
			
			
			
			
			
			
			
			try {
				Thread.sleep(1000*60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
