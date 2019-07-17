package sensorVelocity;

public class Sensor {
	
	private EvaluadorMultas eva;
	public Sensor(EvaluadorMultas eva) {
		super();
		
		this.eva = eva;
	}
	
	public Sensor() {
		
	}

	public EvaluadorMultas getEva() {
		return eva;
	}

	public void setEva(EvaluadorMultas eva) {
		this.eva = eva;
	}
	
	
}
