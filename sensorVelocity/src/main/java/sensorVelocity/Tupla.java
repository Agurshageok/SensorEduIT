package sensorVelocity;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class Tupla {
	
	private sensorvelocidad.TipoVehiculo tipoVehiculo;
	private sensorclima.TipoClima tipoClima;
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((tipoClima == null) ? 0 : tipoClima.hashCode());
//		result = prime * result + ((tipoVehiculo == null) ? 0 : tipoVehiculo.hashCode());
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tupla other = (Tupla) obj;
		if (tipoClima != other.tipoClima)
			return false;
		if (tipoVehiculo != other.tipoVehiculo)
			return false;
		return true;
	}
	public sensorvelocidad.TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(sensorvelocidad.TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public sensorclima.TipoClima getTipoClima() {
		return tipoClima;
	}
	public void setTipoClima(sensorclima.TipoClima tipoClima) {
		this.tipoClima = tipoClima;
	}
	
	public int hashcode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	

}
