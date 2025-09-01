
public class Programa {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		System.out.println(cliente1.toString());
		
		cliente1.setNombre("");
		
		cliente1.getNombre();
		
		System.out.println(cliente1.toString());
		
		Cliente_TercerNivel clientetercernivel1 = new Cliente_TercerNivel();
		
		System.out.println(clientetercernivel1.toString());
		
		clientetercernivel1.Apuesta();
		
		Cliente_SegundoNivel clientesegundo1 = new Cliente_SegundoNivel();
		
		System.out.println(clientesegundo1.toString());
		
		clientesegundo1.Apuesta();

	}

}
