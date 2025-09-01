import java.util.Scanner;

public class Cliente_PrimerNivel extends Cliente{
	
	
	//----------------------------------------------------------------------------------------
	//Variables Miembro
	
	double DineroApuesta;
	int Diamante;
	Premio premiodiamante = new Premio(74, 15, 12);
	
	//----------------------------------------------------------------------------------------
	
	public Cliente_PrimerNivel() {
		
		super();
		DineroApuesta = 9600;
		Diamante = 15;
		premiodiamante.setPremio( 95, 1, 2);
		
	}
	
	//----------------------------------------------------------------------------------------
	
	public Cliente_PrimerNivel(double DineroApuesta) {
		
		super();
		setDineroApuesta(DineroApuesta);
		Diamante = 17;
		premiodiamante.setPremio(12, 3, 25);
		
	}
	
	public Cliente_PrimerNivel(int Diamante, Premio premiodiamante)  {
		
		super();
		DineroApuesta = 4300;
		setDiamante(Diamante);
		this.premiodiamante = premiodiamante;
		
	}
	
	public Cliente_PrimerNivel(double DineroApuesta, int Diamante, Premio premiodiamante)  {
		
		super();
		setDineroApuesta(DineroApuesta);
		setDiamante(Diamante);
		this.premiodiamante = premiodiamante;
		
	}
	
	//----------------------------------------------------------------------------------------

	public double getDineroApuesta() {
		return DineroApuesta;
	}

	public int getDiamante() {
		return Diamante;
	}

	public Premio getPremiodiamante() {
		return premiodiamante;
	}
	
	//----------------------------------------------------------------------------------------

	public void setDineroApuesta(double DineroApuesta) {
		
		if (DineroApuesta<DineroCuenta) {
			this.DineroApuesta = DineroApuesta;
			
		}else {
			
			System.out.println(" La Cantidad de Dinero que deseas apostar excede el Monto de tu Cuenta ");
			this.DineroApuesta = (DineroCuenta/3);
			System.out.println(" El Dinero que puedes Apostar se establecera en " + DineroApuesta + " por Default ");
		
		}
		
	}

	public void setDiamante(int Diamante) {
		
		if (Diamante>10) {
			this.Diamante = Diamante;
		}else {
			System.out.println(" Tu Antiguedad como Cliente del Casino Kurhaus no te permite ser Miembro Diamante ");
			System.out.println(" La Antiguedad se establecera como 2 años por Default ");
		}
		
		
	}

	public void setPremiodiamante(Premio premiodiamante) {
		this.premiodiamante = premiodiamante;
	}
	
	//----------------------------------------------------------------------------------------
	
	@Override
	
	public String toString()  {
		
		return super.toString() + 
			"  \n| Antiguedad del Cliente: " + Diamante + " años " +
			"  \n......................................... " +
			"  \n| Maxima Cantidad a Apostar: " + DineroApuesta + " pesos " +
			"  \n........................................" +
				premiodiamante.toString() +
			"  \n........................................";
		
	}
	
	
	//----------------------------------------------------------------------------------------
	
	public void ingresarDatos()  {
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println(" -------------------Bienvenido al Casino Kurhaus!------------------------ ");
		System.out.println("  Por favor ingrese su Nombre Completo: ");
		Nombre = Teclado.nextLine();
		System.out.println(" ............................................................................... ");
		System.out.println("  Por favor ingrese su Género: ");
		Genero = Teclado.nextLine();
		System.out.println(" ............................................................................... ");
		System.out.println("  Por favor ingrese su Número de Teléfono (sin la lada): ");
		NumTelefono = Teclado.nextLong();
		System.out.println(" ............................................................................... ");
		System.out.println("  Por favor ingrese su Edad: ");
		Edad = Teclado.nextInt();
		System.out.println(" ............................................................................... ");
		System.out.println("  Por favor ingrese su Número de Cuenta: ");
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
	
	
	//----------------------------------------------------------------------------------------
	
	public void imprimirDatos()  {
		
		 System.out.println(" .................................................... ");
		 System.out.println(" | Datos del Cliente: " + Nombre);
		 System.out.println(" .................................................... ");
		 System.out.println(" | Género: " + Genero);
		 System.out.println(" .................................................... ");
		 System.out.println(" | Número de Teléfono: " + NumTelefono);
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
	
	
	//----------------------------------------------------------------------------------------
	
	public double MaximoApuesta()  {
		
		return (DineroCuenta);
		
	}
	
	
	//----------------------------------------------------------------------------------------
	
	public double Descuento()  {
		
		return (DineroCuenta*.30);
		
	}
	
	//----------------------------------------------------------------------------------------
	
	public double CantApuesta()  {
		
		return (DineroApuesta);
		
	}
	
	
	//----------------------------------------------------------------------------------------
	
	
	
	
	

}
