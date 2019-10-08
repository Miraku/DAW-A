
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		Hora ahora=new Hora(17,2);
		ahora.sincronizar();
		ahora.sincronizar();
		System.out.println(ahora.getCurrentHora());
	}
}


