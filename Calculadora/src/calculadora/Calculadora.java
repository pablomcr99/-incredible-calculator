package calculadora;

import utilidades.Leer;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a la calculadora");
		int op=0,num1=0,num2;
		do {
		    System.out.println("Pulse 1 para sumar");
		    System.out.println("Pulse 2 para multiplicar");
		    System.out.println("Pulse 3 para para restar");
		    System.out.println("Pulsa 4 para dividir");
		    System.out.println("Pulsa 0 para salir");
		    op=Leer.datoInt();
		    switch(op) {
		    	case 1:
		    		break;
		    	case 2:
		    		break;
		    	case 3:
		    		break;
		    	case 4:
		    		break;
		    	case 0:
		    		break;
		    	default:
		    	
		    
		    }
			
		}while(op!=0);

	}

}
