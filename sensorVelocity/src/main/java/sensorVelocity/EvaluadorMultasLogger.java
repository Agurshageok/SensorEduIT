package sensorVelocity;

import java.util.HashMap;

public class EvaluadorMultasLogger extends EvaluadorMultas{
	private EvaluadorMultas eva;
	private HashMap<Tupla, String> regMap;


	public EvaluadorMultasLogger(EvaluadorMultas eva) {
		super();
		this.eva = eva;
		this.regMap = new HashMap<Tupla, String>();
	}
	
	public void multar() {
		System.out.println("Logger de multas funcionando");
		
		eva.multar();
	}
	
	public void registrarMulta() {
	/**	
	 * Aca, deberiamos Guardar la multa en el regMap o alguna
	 * otra forma de almacenamiento
	 * (BDD, por ej?)
	 */
	}
}
