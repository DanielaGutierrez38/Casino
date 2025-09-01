import java.util.Scanner;

public class Cliente_SegundoNivel extends Cliente{
	
	//----------------------------------------------------------------------------------------
	//Variables Miembro
	
	double DineroApuesta;
	int PorcentajeApuesta;
	int Jade;
	int NumeroAlAzar;
	
	//----------------------------------------------------------------------------------------
	
	public Cliente_SegundoNivel()  {
		
		super();
		DineroApuesta = 9800;
		PorcentajeApuesta = 30;
		NumeroAlAzar = (int)(Math.random() * 100) + 1;
		Jade = 7;
		
	}
	
	//----------------------------------------------------------------------------------------
	
	public Cliente_SegundoNivel(double DineroApuesta, int PorcentajeApuesta, int NumeroAlAzar)  {
		
		super();
		this.DineroApuesta = DineroApuesta;
		this.PorcentajeApuesta = PorcentajeApuesta;
		this.NumeroAlAzar = NumeroAlAzar;
		Jade = 8;
		
	}
	
	public Cliente_SegundoNivel(long NumTelefono, int NumCuenta, double DineroApuesta, int PorcentajeApuesta) {
		
		Nombre = " Fernando Alberto Galv�n Mart�nez ";
		Genero = "masculino";
		this.NumTelefono = NumTelefono;
		Edad = 42;
		this.NumCuenta = NumCuenta;
		DineroCuenta = 7800;
		this.DineroApuesta = DineroApuesta;
		this.PorcentajeApuesta = PorcentajeApuesta;
		NumeroAlAzar = 1;
		
		
	}
	
	public Cliente_SegundoNivel(String Nombre, String Genero, long NumTelefono, int Edad, int NumCuenta, double DineroCuenta, double DineroApuesta, int PorcentajeApuesta, int NumeroAlAzar, int Jade)  {
		
		super(Nombre, Genero, NumTelefono, Edad, NumCuenta, DineroCuenta);
		this.DineroApuesta = DineroApuesta;
		this.PorcentajeApuesta = PorcentajeApuesta;
		this.NumeroAlAzar = NumeroAlAzar;
		
		
	}
	
	//----------------------------------------------------------------------------------------
	

	public double getDineroApuesta() {
		return DineroApuesta;
	}

	public int getPorcentajeApuesta() {
		return PorcentajeApuesta;
	}

	public int getJade() {
		return Jade;
	}

	public int getNumeroAlAzar() {
		return NumeroAlAzar;
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

	public void setPorcentajeApuesta(int PorcentajeApuesta) {
		
		if (PorcentajeApuesta<=90 && PorcentajeApuesta>=10)  {
			this.PorcentajeApuesta = PorcentajeApuesta;
		}else {
			System.out.println(" El Porcentaje de Dinero que deseas Apostar está Fuera de Rango! ");
			System.out.println(" El Porcentaje se establecerá como 45% por default ");
			this.PorcentajeApuesta = 45;
			
		}
		
	}

	public void setJade(int Jade) {
		
		if (Jade>5 && Jade <=10) {
			this.Jade = Jade;
		}else {
			System.out.println(" Tu Antiguedad como Cliente del Casino Kurhaus no te permite ser Miembro Jade ");
			System.out.println(" La Antiguedad se establecerá como 2 años por Default ");
		}
		
	}

	public void setNumeroAlAzar(int NumeroAlAzar) {
		
		if (NumeroAlAzar>=1 && NumeroAlAzar<=100) {
			this.NumeroAlAzar = NumeroAlAzar;
		}else {
			System.out.println(" El Numero que ingresaste está Fuera de Rango. ");
			System.out.println(" El Numero se establecerá como 3 por Default ");
			NumeroAlAzar = 3;
		}
	}
	
	
	//----------------------------------------------------------------------------------------
	
	@Override
	
	public String toString()  {
		
		 return super.toString() +
		 " 	\n| Antiguedad del Cliente: " + Jade + " años " +
		 "  \n......................................... " +
		 "  \n| Maxima Cantidad a Apostar: " + DineroApuesta + " pesos " +
		 "  \n........................................" +
		 "  \n| Porcentaje a Apostar: " + PorcentajeApuesta +
		 "  \n........................................" +
		 "  \n| Numero Al Azar: " + NumeroAlAzar  +
		 "  \n........................................";
		
	}
	
	//---------------------------------------------------------------------------------------
	
	public void ingresarDatos()  {
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println(" -------------------Bienvenido al Casino Kurhaus!------------------------ ");
		System.out.println("  Por favor ingrese su Nombre Completo: ");
		Nombre = Teclado.nextLine();
		System.out.println(" ............................................................................... ");
		System.out.println("  Por favor ingrese su Gwnero: ");
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
		System.out.println("  Por favor ingrese un Numero Al Azar: ");
		NumeroAlAzar = Teclado.nextInt();
		System.out.println(" ............................................................................... ");
		System.out.println(" Por favor ingrese la Cantidad de Dinero que va a apostar ");
		System.out.println(" Recuerde!: La Apuesta no puede exceder la Cantidad de Dinero en su Cuenta ");
		DineroApuesta = Teclado.nextDouble();
		System.out.println(" ------------------------------------------------------------------------- ");
		System.out.println(" Ingrese el Porcentaje que apostar� ");
		System.out.println(" Recuerde!: El Porcentaje no puede ser Mayor a 90%, ni Menor que 10% ");
		PorcentajeApuesta = Teclado.nextInt();
		System.out.println(" ------------------------------------------------------------------------- ");
		Jade = 7;
		
		
	}
	
	//---------------------------------------------------------------------------------------
	
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
		 System.out.println(" | Antiguedad del Cliente: " + Jade + " años ");
		 System.out.println(" .................................................... ");
		 System.out.println(" | Numero Al Azar: " + NumeroAlAzar);
		 System.out.println(" .................................................... ");
		 

		 System.out.println(" | Maxima Cantidad de Dinero a Apostar: " + DineroApuesta + " pesos ");
		 System.out.println(" ----------------------------------------------------- ");
		 System.out.println(" | Porcentaje a Apostar: " + PorcentajeApuesta);
		 System.out.println(" ----------------------------------------------------- ");
		
	}
	
	//---------------------------------------------------------------------------------------
	
	public double MaximoApuesta()  {
		
		return (DineroCuenta*0.90);
		
	}
	

	//---------------------------------------------------------------------------------------
	
	public double Descuento()  {
		
		return (DineroCuenta*.10);
		
	}
	
	//---------------------------------------------------------------------------------------
	
	public double CantApuesta()  {
		
		return (DineroApuesta*PorcentajeApuesta);
		
	}
	
	//---------------------------------------------------------------------------------------
	
	public void Apuesta()  {
		
		String Palabra;
		String Entrada;
		
		System.out.println(" ^^^^^^^^^^^^^^^Palabras Revueltas^^^^^^^^^^^^^^^ ");
		System.out.println(" Si logras escribir la Palabra Ordenada, Ganas! ");
		
		switch ((int)(Math.random() * 3) + 1)  {
		
		case 1:
			
			Palabra = "escribir";
			
			System.out.println(" ribcersi");
			
			System.out.println(" Adivina la Palabra! (Escribe la primera letra con Minuscula)");
			Entrada = Teclado.nextLine();
			
			if (Entrada.equals(Palabra)) {
				System.out.println(" .................................................................. ");
				System.out.println(" Felicidades! Has adivinado la Palabra Desconocida. ");
				System.out.println(" Tu Premio son " + (DineroApuesta+(PorcentajeApuesta*100)) + " pesos " );
				DineroCuenta = DineroCuenta + (DineroApuesta+(PorcentajeApuesta*100));
				System.out.println(" Actualmente tienes: " + DineroCuenta + " pesos en tu Cuenta ");
				System.out.println(" .................................................................. ");
			}else {
				System.out.println(" .................................................................. ");
				System.out.println(" Perdiste! A causa de esto, perdiste todo el Dinero que apostaste ");
				DineroCuenta = DineroCuenta - DineroApuesta;
				System.out.println(" Actualmente tienes: " + DineroCuenta + " pesos en tu Cuenta ");
				System.out.println(" La Palabra Correcta era: " + Palabra);
				System.out.println(" .................................................................. ");
			}
			
			
		break;
		
		case 2:
			
			Palabra = "desierto";
			
			System.out.println(" tiedsero ");
			
			System.out.println(" Adivina la Palabra! (Escribe la primera letra con Minuscula)");
			Entrada = Teclado.nextLine();
			
			if (Entrada.equals(Palabra)) {
				System.out.println(" .................................................................. ");
				System.out.println(" Felicidades! Has adivinado la Palabra Desconocida. ");
				System.out.println(" Tu Premio son " + (DineroApuesta+(PorcentajeApuesta*100)) + " pesos " );
				DineroCuenta = DineroCuenta + (DineroApuesta+(PorcentajeApuesta*100));
				System.out.println(" Actualmente tienes: " + DineroCuenta + " pesos en tu Cuenta ");
				System.out.println(" .................................................................. ");
			}else {
				System.out.println(" .................................................................. ");
				System.out.println(" Perdiste! A causa de esto, perdiste todo el Dinero que apostaste ");
				DineroCuenta = DineroCuenta - DineroApuesta;
				System.out.println(" Actualmente tienes: " + DineroCuenta + " pesos en tu Cuenta ");
				System.out.println(" La Palabra Correcta era: " + Palabra);
				System.out.println(" .................................................................. ");
			}
			
			
			
		break;
		
		
		case 3:
			
			Palabra = "mensaje";
			
			System.out.println(" anmseej ");
			
			System.out.println(" Adivina la Palabra! (Escribe la primera letra con Minúscula)");
			Entrada = Teclado.nextLine();
			
			if (Entrada.equals(Palabra)) {
				System.out.println(" .................................................................. ");
				System.out.println(" Felicidades! Has adivinado la Palabra Desconocida. ");
				System.out.println(" Tu Premio son " + (DineroApuesta+(PorcentajeApuesta*100)) + " pesos " );
				DineroCuenta = DineroCuenta + (DineroApuesta+(PorcentajeApuesta*100));
				System.out.println(" Actualmente tienes: " + DineroCuenta + " pesos en tu Cuenta ");
				System.out.println(" .................................................................. ");
			}else {
				System.out.println(" .................................................................. ");
				System.out.println(" Perdiste! A causa de esto, perdiste todo el Dinero que apostaste ");
				DineroCuenta = DineroCuenta - DineroApuesta;
				System.out.println(" Actualmente tienes: " + DineroCuenta + " pesos en tu Cuenta ");
				System.out.println(" La Palabra Correcta era: " + Palabra);
				System.out.println(" .................................................................. ");
			}
			
			
		break;
		
		}
		
		//---------------------------------------------------------------------------------------
		
		
	}
		
		
		
	
	
}
