package pkg;

public class Empleado {
	
	public enum TipoEmpleado{ Vendedor, Encargado};
	
	public float calculoNominaBruta(TipoEmpleado tipo, float VentaMes, float horaExtra){
		
		float salariobase=0, primas=0,extras=0;
		final int PRECIO_HE=30;
		//det salario base
		if (tipo==TipoEmpleado.Vendedor) {
			salariobase=2000;
		}
		else if(tipo==TipoEmpleado.Encargado) {
			salariobase=2500;
			
		}
		//det prima
		
		if(VentaMes>1500) primas=200;
		else if(VentaMes>=1000) primas=100;
		
		//det extras
		extras=horaExtra*PRECIO_HE;
		
		return salariobase+primas+extras;
	}
	public float calculoNominaNeta(float nominaBruta) {
		float retencion=0;
		
		if(nominaBruta>2500) retencion=0.18f;
		else if (nominaBruta>2100) retencion=0.15f;
	
		return retencion;
	}
	
}
