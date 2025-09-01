import java.util.Scanner;

public class Cliente {
	
	Scanner Teclado = new Scanner(System.in); 
	
	//Variables Miembro
	
	//----------------------------------------------------------------------------------------
	
	String Nombre;
	String Genero;
	long NumTelefono;
	int Edad;
	int NumCuenta;
	double DineroCuenta;
	
	
	//Constructor Principal
	
	//----------------------------------------------------------------------------------------
	
	public Cliente()  {
		
		Nombre = " Imogen Juárez Pérez ";
		Genero = " No Especificado ";
		NumTelefono = 1207741;
		Edad = 25;
		NumCuenta = 45623;
		DineroCuenta = 12300;
		
	}
	
	//----------------------------------------------------------------------------------------
	
	//Sobrecarga
	
	public Cliente(String Nombre, int Edad) {
		
		this.Nombre = Nombre;
		Genero = " Masculino ";
		NumTelefono = 7123478;
		this.Edad = Edad;
		NumCuenta = 74521;
		DineroCuenta = 7450;
		
	}
	
	public Cliente(String Nombre, int Edad, int NumCuenta)  {
		
		this.Nombre = Nombre;
		Genero = " Femenino ";
		NumTelefono = 4217890;
		this.Edad = Edad;
		this.NumCuenta = NumCuenta;
		DineroCuenta = 120.5;
		
	}
	
	public Cliente(String Genero, long NumTelefono, double DineroCuenta)  {
		
		Nombre = " Pedro Emiliano Vicu�a Salazar ";
		this.Genero = Genero;
		this.NumTelefono = NumTelefono;
		Edad = 78;
		NumCuenta = 65239;
		this.DineroCuenta = DineroCuenta;
		
	}
	
	public Cliente(String Nombre, String Genero, long NumTelefono, int Edad, int NumCuenta, double DineroCuenta)  {
		
		this.Nombre = Nombre;
		this.Genero = Genero;
		this.NumTelefono = NumTelefono;
		this.Edad = Edad;
		this.NumCuenta = NumCuenta;
		this.DineroCuenta = DineroCuenta;
		
	}
	
	//----------------------------------------------------------------------------------------
	
	// Getters

	public String getNombre() {
		return Nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public long getNumTelefono() {
		return NumTelefono;
	}

	public int getEdad() {
		return Edad;
	}
	
	public int getNumCuenta() {
		return NumCuenta;
	}

	public double getDineroCuenta() {
		return DineroCuenta;
	}
	

	
	//Setters
	
	//----------------------------------------------------------------------------------------

	public void setNombre(String Nombre) {
		
		if (Nombre.isEmpty()) {
			System.out.println(" No se ingresó ningun Nombre. ");
			System.out.println(" El Nombre se establecerá como No Definido por Default ");
			this.Nombre = " No Definido ";
		}else {
			this.Nombre = Nombre;
		}
		
	}

	public void setGenero(String Genero) {
		
		if (Genero.equals("femenino") || Genero.equals("Femenino") || Genero.equals("masculino") || Genero.equals("Masculino")) {
			this.Genero = Genero;
		}else {
			System.out.println(" El Género ingresado no puede ser Registrado. ");
			System.out.println(" El Género se establecerá como No Definido por Default ");
			this.Genero = " No Definido ";
		}
		
	}

	public void setNumTelefono(long NumTelefono) {
		
		if(NumTelefono<9999999) {
			this.NumTelefono = NumTelefono;
		}else {
			System.out.println(" El Numero de Telefono ingresado es Demasiado Alto! ");
			System.out.println(" El Numero se establecerá como 1234567 por Default ");
			this.NumTelefono = 1234567;
		}
		
	}

	public void setEdad(int Edad) {
		
		if (Edad>=18 && Edad<=100) {
			this.Edad = Edad;
		}else {
			System.out.println(" La Edad ingresada está Fuera del Rango permitido ");
			System.out.println(" La Edad se establecerá como 30 por Default ");
			this.Edad = 30;
		}
	}
	
	public void setNumCuenta()  {
		
		if (NumCuenta<=99999) {
			this.NumCuenta = NumCuenta;
		}else {
			System.out.println(" El Numero de Cuenta está Fuera de Rango. ");
			System.out.println(" El Numero de Cuenta se establecerá como 54230 por Default ");
			this.NumCuenta = NumCuenta;
		}
		
	}

	public void setDineroCuenta(double DineroCuenta) {
		
		if (DineroCuenta>=100 && DineroCuenta<=10000) {
			this.DineroCuenta = DineroCuenta;
		}else {
			System.out.println(" La Cantidad de Dinero ingresada se encuentra Fuera de Rango. ");
			System.out.println(" La Cantidad de Dinero en la Cuenta se establecerá como 1000 por Default ");
			this.DineroCuenta = 1000;
		}
	}
	
	
	
	//----------------------------------------------------------------------------------------
	
	 @Override
	 
	 public String toString()  {
	 return " -------------Casino Kurhaus------------- " +
	  "  \n\t  Historial de Clientes " + 
	  "  \n---------------------------------------- " +
	  "  \n|  Nombre: " + Nombre + 
	  "  \n........................................" +
	  "  \n|  Genero: " + Genero + 
	  "  \n........................................" +
	  "  \n| Telefono: " + NumTelefono +
	  "  \n........................................" +
	  "  \n| Edad: " + Edad +
	  "  \n........................................" +
	  "  \n| Numero de Cuenta: " + NumCuenta +
	  "  \n........................................" +
	  "  \n| Dinero en la Cuenta: $" + DineroCuenta +
	  "  \n........................................";
	  
	 }
	 
	//----------------------------------------------------------------------------------------
	
	
	//M�todos Generales
	 
	 public void ingresarDatos()  {
		 
		 Scanner Teclado = new Scanner(System.in);
		 
		 System.out.println(" ------------------------------------------------------------------------------- ");
		 System.out.println(" | \t\t\t\tNuevo Cliente - Casino Kurhaus ");
		 System.out.println(" ------------------------------------------------------------------------------- ");
		 System.out.println(" | \t\t\t\t\tBienvenido! ");
		 System.out.println(" ............................................................................... ");
		 System.out.println("  Por favor ingrese su Nombre Completo: ");
		 Nombre = Teclado.nextLine();
		 System.out.println(" ............................................................................... ");
		 System.out.println("  Por favor ingrese su Genero: ");
		 Genero = Teclado.nextLine();
		 System.out.println(" ............................................................................... ");
		 System.out.println("  Por favor ingrese su Número de Telefono (sin la lada): ");
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
		 System.out.println(" | Número de Cuenta: " + NumCuenta);
		 System.out.println(" .................................................... ");
		 System.out.println(" | Cantidad de Dinero en la Cuenta: " + DineroCuenta);
		 System.out.println(" .................................................... ");
		 
	 }
	 
	//----------------------------------------------------------------------------------------
	 
	 
	 public double MaximoApuesta()  {
		 
		 return (DineroCuenta*.50);
		 
	 }
	 
	//----------------------------------------------------------------------------------------
	 
	 
	 public double Descuento()  {
		 
		 return (DineroCuenta*0.02);
		 
	 }
	 
	//----------------------------------------------------------------------------------------

	
}
