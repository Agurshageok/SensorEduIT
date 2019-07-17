package sensorVelocity.clase2;

public class ClienteConInject {

	private ServicioCliente servicio;
	
	public ClienteConInject(Servicio serv) {
		this.servicio = serv;
	}
	
	public void consumirServidor() {
		this.servicio.consumir();
	}
	
}


public class SerivicioCliente {
	 public int consumir(int x) {
		 return x*x;
	 }
}

public class LoggerServicio extends ServicioCliente{
	private ServicioCliete servicio;
	
	public LoggerServicio (ServicioCliente servicio) {
		this.servicio = servicio;	
	}
	
	public void consumir(int x) {
		System.out.println("Uso metodo COnsumir de Servicio con: "+x);
		servicio.consumir(x);
	}
	
	public class Init() {
		main{
			ClienteConInject c = new ClienteConInject(new LoggerServicio(new Servicio));
			c.consumirServidor();
		}
	}
}
