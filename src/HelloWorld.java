
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		Hora ahora=new Hora(17,2);
		ahora.sincronizar();
		System.out.println("Una hora:");
		System.out.println(ahora.getCurrentHora());
	}
}


