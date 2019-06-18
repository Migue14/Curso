package com.bbvaitspain.estructuras;

public class App 
{
    public static void main( String[] args )
    {
    	//Sentencia WHILE
    	int i=1;
    	while (i<=10) {
    		System.out.println(i);
    		i++;
    		}
    	
    	//Sentencia DO WHILE
    	i=1;
    	do {
    		System.out.println(i);
    		i++;
    		} while (i<=10);
    	
    	//Sentencia FOR
    	for (i=1;i<=10;i++) {
    		System.out.println(i);
    		}
    	
    	//Conductor
    	int edad = 18;
    	if (edad<18)
    		System.out.println("No puede conducir");
    	else {
    		System.out.println("Puede conducir");
    	}
    	
    	//Conductor y Bebedor
    	int edad2 = 50;
    	if (edad2<18)
    		System.out.println("No puede ni conducir ni beber");
    	else if (edad2>=18 && edad2<21)
    		System.out.println("Puede conducir pero no beber");
    	else 
    		System.out.println("Puede beber y conducir");
    	
    	//Bucle WHILE con BREAK
    	int j=0;
    	while (j<10) {
    		j++;
    		switch (j) {
    		 	case 2:
    		 		System.out.println("Hago continue"+j);
    			    continue;
    		 	case 5:
    		 		System.out.println("Hago break"+j);
    		 		break;
    		 	default:
    		 		System.out.println(j);
    		}
    	}
    }
}
