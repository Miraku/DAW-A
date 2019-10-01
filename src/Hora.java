
import java.util.*;
public class Hora{
	private int hora;
	private int min;
	private int seg;
	public Hora(int h,int m, int s) {
		hora=h;
		min=m;
		seg=s;
	}
	public Hora(int h, int m) {
		this(h,m,0);
	}
	public Hora(int h) {
		this(h,0,0);
	}
	public Hora() {
		this(0,0,0);
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		this.seg = seg;
	}
	
	public String getCurrentHora() {
		return "Son las "+hora+"h, "+min+"min y "+seg+"s.";
	}
	public void sincronizar() {
		Date ahora= new Date();
		hora=ahora.getHours();
		min=ahora.getMinutes();
		seg=ahora.getSeconds();
		int a=0;
	}
}