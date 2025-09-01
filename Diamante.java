import java.util.Scanner;

public class Diamante extends Cliente_PrimerNivel{

	double ApuestaMaxima;
	
	public Diamante()  {
		
		super();
		ApuestaMaxima = DineroApuesta * premiodiamante.getNumeroAlAzar();
		
	}
	
	public Diamante(double ApuestaMaxima) {
		
		super();
		setApuestaMaxima(ApuestaMaxima);
		
	}

	public double getApuestaMaxima() {
		return ApuestaMaxima;
	}

	public void setApuestaMaxima(double ApuestaMaxima) {
		
		if (ApuestaMaxima<=1000000) {
			this.ApuestaMaxima = ApuestaMaxima;
		}else {
			System.out.println(" La Cantidad de Dinero que deseas Apostar es demasiado Alta. ");
			System.out.println(" La Apuesta Maxima se establecerá en 20000 por Default ");
			ApuestaMaxima = 20000;
			
		}
		
	}
	
	@Override
	
	public String toString() {
		
		return " \n......................................... " +
		" \n| Apuesta Máxima: " + ApuestaMaxima + 
		" \n......................................... ";
		
	}
	
	public void ingresarDatos() {
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println(" -------------------Bienvenido al Casino Kurhaus!------------------------ ");
		System.out.println("  Por favor ingrese su Nombre Completo: ");
		Nombre = Teclado.nextLine();
		System.out.println(" ............................................................................... ");
		System.out.println("  Por favor ingrese su Genero: ");
		Genero = Teclado.nextLine();
		System.out.println(" ............................................................................... ");
		System.out.println("  Por favor ingrese su Numero de Telefono (sin la lada): ");
		NumTelefono = Teclado.nextLong();
		System.out.println(" ............................................................................... ");
		System.out.println("  Por favor ingrese su Edad: ");
		Edad = Teclado.nextInt();
		System.out.println(" ............................................................................... ");
		System.out.println("  Por favor ingrese su Numero de Cuenta: ");
		NumCuenta = Teclado.nextInt(); 
		System.out.println(" ............................................................................... ");
		System.out.println("  Por favor ingrese la Cantidad de Dinero con la que abrirá su Cuenta: ");
		DineroCuenta = Teclado.nextDouble();
		System.out.println(" ............................................................................... ");
		System.out.println(" Por favor ingrese la Cantidad de Dinero que va a apostar ");
		System.out.println(" Recuerde!: La Apuesta no puede exceder la Cantidad de Dinero en su Cuenta ");
		DineroApuesta = Teclado.nextDouble();
		System.out.println(" ------------------------------------------------------------------------- ");
		Diamante = 19;
		
	}
	
	
	public void imprimirDatos()  {
		
		System.out.println(" .................................................... ");
		 System.out.println(" | Datos del Cliente: " + Nombre);
		 System.out.println(" .................................................... ");
		 System.out.println(" | Genero: " + Genero);
		 System.out.println(" .................................................... ");
		 System.out.println(" | Numero de Telefono: " + NumTelefono);
		 System.out.println(" .................................................... ");
		 System.out.println(" | Edad: " + Edad);
		 System.out.println(" .................................................... ");
		 System.out.println(" | Numero de Cuenta: " + NumCuenta);
		 System.out.println(" .................................................... ");
		 System.out.println(" | Cantidad de Dinero en la Cuenta: " + DineroCuenta);
		 System.out.println(" .................................................... ");
		 System.out.println(" | Antiguedad del Cliente: " + Diamante + " años ");
		 System.out.println(" .................................................... ");
		 

		 System.out.println(" | Maxima Cantidad de Dinero a Apostar: " + DineroApuesta + " pesos ");
		 System.out.println(" ----------------------------------------------------- ");
		 System.out.println(premiodiamante.toString());
		
	}
	
	
	public void premioDiamante()  {
		
		float Res1, Res2, Res3, Res4;
		
		System.out.println(premiodiamante.toString());
		
		
		System.out.println(" \nEn este juego, tendrás que resolver 4 operaciones básicas con 2 Numeros entre el 1 y el 10 ");
		System.out.println(" Si lo logras, el Premio será el Producto de todo el Dinero que Apostaste y el Número Al Azar! ");
		
		System.out.println(" \t........................................ ");
		System.out.println(premiodiamante.getNum1() + " + " + premiodiamante.getNum2() + " = ");
		Res1 = Teclado.nextFloat();
		System.out.println(" \t........................................ ");
		System.out.println(premiodiamante.getNum1() + " - " + premiodiamante.getNum2()+ " = ");
		Res2 = Teclado.nextFloat();
		System.out.println(" \t........................................ ");
		System.out.println(premiodiamante.getNum1() + " * " + premiodiamante.getNum2()+ " = ");
		Res3 = Teclado.nextFloat();
		System.out.println(" \t........................................ ");
		System.out.println(premiodiamante.getNum1() + " / " + premiodiamante.getNum2()+ " = ");
		Res4 = Teclado.nextFloat();
		
		
		if (Res1 == (premiodiamante.getNum1()+premiodiamante.getNum2()) || Res2 == (premiodiamante.getNum1()-premiodiamante.getNum2()) || Res3 == (premiodiamante.getNum1()*premiodiamante.getNum2()) || Res4 == (premiodiamante.getNum1()/premiodiamante.getNum2())) {
			
			System.out.println(" Felicidades! Has acertado todas las preguntas. Tu Premio es de: " + (ApuestaMaxima*premiodiamante.getNumeroAlAzar()));
			DineroCuenta = DineroCuenta + (ApuestaMaxima*premiodiamante.getNumeroAlAzar());
		}else {
			
			System.out.println(" Perdiste. No lograste completar las Operaciones correctamente. ");
			System.out.println(" No pierdes nada, pero tampoco ganas nada ");
			
		}
	
	}
	
	
}
	
	

