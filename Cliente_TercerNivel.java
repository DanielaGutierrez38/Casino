import java.util.Scanner;

public class Cliente_TercerNivel extends Cliente{
	
	//Variables Miembro
	
	//----------------------------------------------------------------------------------------
	
	double DineroApuesta;
	int PorcentajeApuesta;
	int Ambar;
	
	//----------------------------------------------------------------------------------------
	//Constructor Principal
	
	public Cliente_TercerNivel()  {
		
		super();
		DineroApuesta = 1500;
		PorcentajeApuesta = 50;
		Ambar = 3;
		
	}
	
	//----------------------------------------------------------------------------------------
	//Sobrecarga
	
	public Cliente_TercerNivel(double DineroApuesta)  {
		
		super();
		this.DineroApuesta = DineroApuesta;
		PorcentajeApuesta = 40;
		Ambar = 4;
		
	}
	
	public Cliente_TercerNivel(double DineroApuesta, int PorcentajeApuesta)  {
		
		super();
		this.DineroApuesta = DineroApuesta;
		this.PorcentajeApuesta = PorcentajeApuesta;
		Ambar = 1;
		
	}
	
	public Cliente_TercerNivel(String Nombre, int Edad, double DineroApuesta, int PorcentajeApuesta, int Ambar)  {
		
		super(Nombre, Edad);
		this.DineroApuesta = DineroApuesta;
		this.PorcentajeApuesta = PorcentajeApuesta;
		this.Ambar = Ambar;
		
	}
	
	//----------------------------------------------------------------------------------------
	//Getters

	public double getDineroApuesta() {
		return DineroApuesta;
	}

	public int getPorcentajeApuesta() {
		return PorcentajeApuesta;
	}
	
	public int getAmbar()  {
		return Ambar;
	}
	
	//----------------------------------------------------------------------------------------
	//Setters

	public void setDineroApuesta(double DineroApuesta) {
		
		if (DineroApuesta<DineroCuenta) {
			this.DineroApuesta = DineroApuesta;
		}else {
			System.out.println(" La Cantidad de Dinero que deseas apostar excede el Monto de tu Cuenta ");
			this.DineroApuesta = (DineroCuenta/3);
			System.out.println(" El Dinero que puedes Apostar se establecerá en " + DineroApuesta + " por Default ");
		}
	}

	public void setPorcentajeApuesta(int PorcentajeApuesta) {
		
		if (PorcentajeApuesta<=80 && PorcentajeApuesta>=10)  {
			this.PorcentajeApuesta = PorcentajeApuesta;
		}else {
			System.out.println(" El Porcentaje de Dinero que deseas Apostar está Fuera de Rango! ");
			System.out.println(" El Porcentaje se establecerá como 40% por default ");
			this.PorcentajeApuesta = 40;
		}
	}
	
	public void setAmbar() {
		
		if (Ambar>=1 && Ambar <=5) {
			this.Ambar = Ambar;
		}else {
			System.out.println(" Tu Antiguedad como Cliente del Casino Kurhaus no te permite ser Miembro Ambar ");
			System.out.println(" La Antiguedad se establecerá como 0 años por Default ");
		}
		
	}
	
	//----------------------------------------------------------------------------------------
	
	@Override
	
	public String toString()  {
		
		 return super.toString() +
		 " 	\n| Antiguedad del Cliente: " + Ambar + " años " +
		 "  \n......................................... " +
		 "  \n| Cantidad a Apostar: " + DineroApuesta + " pesos " +
		 "  \n........................................" +
		 "  \n| Porcentaje a Apostar: " + PorcentajeApuesta +
		 "  \n........................................";
		
	}

	
	//----------------------------------------------------------------------------------------
	//Metodos Generales
	
	public void ingresarDatos()  {
		
		Scanner Teclado = new Scanner(System.in);
		
		System.out.println(" -------------------�Bienvenido al Casino Kurhaus!------------------------ ");
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
		System.out.println(" Ingrese el Porcentaje que apostará ");
		System.out.println(" Recuerde!: El Porcentaje no puede ser Mayor a 80%, ni Menor que 10% ");
		PorcentajeApuesta = Teclado.nextInt();
		System.out.println(" ------------------------------------------------------------------------- ");
		Ambar = 2;
		
	}
	
	//----------------------------------------------------------------------------------------
	
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
		 System.out.println(" | Antiguedad del Cliente: " + Ambar + " años ");
		 System.out.println(" .................................................... ");
		 

		 System.out.println(" | Cantidad de Dinero a Apostar: " + DineroApuesta + " pesos ");
		 System.out.println(" ----------------------------------------------------- ");
		 System.out.println(" | Porcentaje a Apostar: " + PorcentajeApuesta);
		 System.out.println(" ----------------------------------------------------- ");
		
	}
	
	//----------------------------------------------------------------------------------------
	
	public double MaximoApuesta()  {
		
		return (DineroCuenta*0.80);
		
	}
	
	//----------------------------------------------------------------------------------------
	
	public double Descuento()  {
		
		return (DineroCuenta*.05);
		
	}
	
	//----------------------------------------------------------------------------------------
	
	public double CantApuesta()  {
		
		return (DineroApuesta*(PorcentajeApuesta/100));
		
	}
	
	//----------------------------------------------------------------------------------------
	
	public void Apuesta()  {
		
		double A;
		int B;
		
		A=1+Math.floor(Math.random()*10);
		
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~Adivina el N�mero~~~~~~~~~~~~~~~~~~~~");
		System.out.print(" | Ingresa un Numero entre el 1 y el 10! : ");
		B = Teclado.nextInt();
		
		
		if (A == B) {
			
			
			System.out.println(" .................................................................. ");
			System.out.println(" Felicidades! Has adivinado el Número Desconocido. ");
			System.out.println(" Tu Premio son " + (DineroApuesta*(PorcentajeApuesta/100)) + " pesos " );
			DineroCuenta = DineroCuenta + (DineroApuesta*(PorcentajeApuesta/100));
			System.out.println(" Actualmente tienes: " + DineroCuenta + " pesos en tu Cuenta ");
			System.out.println(" .................................................................. ");
			
		}else {
			
			System.out.println(" .................................................................. ");
			System.out.println(" Perdiste! A causa de esto, perdiste todo el Dinero que apostaste ");
			DineroCuenta = DineroCuenta - DineroApuesta;
			System.out.println(" Actualmente tienes: " + DineroCuenta + " pesos en tu Cuenta ");
			System.out.println("El Numero Correcto era: " + A);
			System.out.println(" .................................................................. ");
			
		}
		
	}
	
	//----------------------------------------------------------------------------------------


}
