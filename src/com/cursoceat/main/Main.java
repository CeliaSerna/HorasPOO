package com.cursoceat.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
//creo el objeto miHoras para luego a traves de los metodos
//setter ingresar los valores a la hora, minutos y segundos
Horas miHoras= new Horas();
//a partir de esta linea se solicita la informacion y se asigna
//el valor a los atributos
System.out.println("Escribe la hora");
miHoras.setHora(entrada.nextInt());
		
System.out.println("Escribe los minutos");
miHoras.setMinutos(entrada.nextInt());
	
System.out.println("Escribe los segundos");
miHoras.setSegundos(entrada.nextInt());

System.out.println("¿Cuántos segundos quieres mostrar? ");
int numSegundos=entrada.nextInt();
	
	for (int i=0; i <=numSegundos; i++) {
	System.out.printf("%02d:%02d:%02d\n", miHoras.getHora(),miHoras.getMinutos(),miHoras.getSegundos());
	miHoras.incrementarSegundos();
	
	}
	
	}

}
