package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proyecto00TomasValentinoGomezApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto00TomasValentinoGomezApplication.class, args);
		
		String nombre = "tomas";
		System.out.println("hola edm,dice:  "+ nombre + " " + darNombre());
		
		//aqui el numero 10 se pasa al numero1 y el 2 al numero2
		Calculadora miCalculadora = new Calculadora(10,0);
		
		int suma=miCalculadora.suma();
		System.out.println("la suma es: "+suma);
		
		//una forma de simplificar la operacion anterior:
		System.out.println("la resta es: "+ miCalculadora.resta());
		
		System.out.println("la multiplicaion es: "+ miCalculadora.multiplicar());
		
		double dividir = miCalculadora.dividir();
		if(dividir==0) {
			System.out.println("el divisor tiene que ser mayor a 0" );
		}
		else {
			System.out.println("la division es: "+dividir);
		}
		
	

		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	public static String darNombre() {
		String nuevonombre="valentino";
		return nuevonombre;
		
		
	}

}
