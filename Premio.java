
public class Premio {
	
	//----------------------------------------------------------------------------------------
	//Variables Miembro
	
	int NumeroAlAzar;
	float Num1;
	float Num2;
	
	//----------------------------------------------------------------------------------------
	//Constructor Principal
	
	
	public Premio()  {
		
		NumeroAlAzar = (int)(Math.random() * 100) + 1;
		Num1 = (int)(Math.random() * 10) + 1;
		Num2 = (int)(Math.random() * 10) + 1;
		
	}
	
	//----------------------------------------------------------------------------------------
	//Sobrecarga
	
	
	public Premio(float Num1)  {
		
		NumeroAlAzar = (int)(Math.random() * 100) + 1;
		setNum1(Num1);
		Num2 = (int)(Math.random() * 10) + 1;
		
	}
	
	public Premio(int NumeroAlAzar, float Num2)  {
		
		setNumeroAlAzar(NumeroAlAzar);
		Num1 = (int)(Math.random() * 10) + 1;
		setNum2(Num2);
		
	}
	
	public Premio(int NumeroAlAzar, float Num1, float Num2) {
		
		setNumeroAlAzar(NumeroAlAzar);
		setNum1(Num1);
		setNum2(Num2);
		
	}
	
	//----------------------------------------------------------------------------------------
	
	
	@Override
	
	public String toString()  {
		
		return " ~~~~~~~~~~Premio Cliente Diamante~~~~~~~~~~ " +
		" \n............................................... " +
		" \n Numero del 1 al 100: " + NumeroAlAzar +
		" \n............................................... " +
		" \n Primer Numero: " + Num1 +
		" \n............................................... " +
		" \n Segundo Numero: " + Num2 +
		" \n............................................... ";
		
	}
	
	//----------------------------------------------------------------------------------------
	
	
	public void setPremio( int NumeroAlAzar, float Num1, float Num2) {
		

		setNumeroAlAzar(NumeroAlAzar);
		setNum1(Num1);
		setNum2(Num2);
		
	}
	
	//----------------------------------------------------------------------------------------


	public int getNumeroAlAzar() {
		return NumeroAlAzar;
	}

	public float getNum1() {
		return Num1;
	}

	public float getNum2() {
		return Num2;
	}
	
	
	//----------------------------------------------------------------------------------------


	public void setNumeroAlAzar(int NumeroAlAzar) {
		
		if (NumeroAlAzar>=1 && NumeroAlAzar<=100) {
			this.NumeroAlAzar = NumeroAlAzar;
		}else {
			System.out.println(" El Número que ingresaste está Fuera de Rango. ");
			System.out.println(" El Número se establecerá como 50 por Default ");
			NumeroAlAzar = 50;
		}
		
	}

	public void setNum1(float Num1) {
		
		if (Num1>=1 && Num1<=10) {
			this.Num1 = Num1;
		}else {
			System.out.println(" El Número que ingresaste está Fuera de Rango. ");
			System.out.println(" El Número se establecerá como 5 por Default ");
			Num1 = 5;
		}
		
	}

	public void setNum2(float Num2) {
		
		if (Num2>=1 && Num2<=10) {
			this.Num2 = Num2;
		}else {
			System.out.println(" El Número que ingresaste está Fuera de Rango. ");
			System.out.println(" El Número se establecerá como 5 por Default ");
			Num2 = 5;
		}
		
	}
	
	
	//----------------------------------------------------------------------------------------
	
	

}
