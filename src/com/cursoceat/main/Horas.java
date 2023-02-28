package com.cursoceat.main;

public class Horas {

	//defino los atributos de la clase hora
	private int hora;
	private int minutos;
	private int segundos;
	
	//metodos getter y setter
	public int getHora() {//muestra lo que tiene almacenado hora
		return hora;
	}
	
	
	public void setHora(int hora) {//asignar un valor al atributo
		if(0<=hora && hora<=23) {
			this.hora = hora;
		}else {
			this.hora=0;
		}
		
	}
	
	
	
	public int getMinutos() {//muestra los minutos
		return minutos;
	}
	public void setMinutos(int minutos) {//asina un valor al atributo
    if(0<=minutos && minutos <=59) {
    	this.minutos = minutos;
    }else {
    	this.minutos=0;
    }
	}
	
	
	public int getSegundos() {//muestra los segundos
		return segundos;
	}
	public void setSegundos(int segundos) {
		if (0<=segundos && segundos <=59) {
			this.segundos = segundos;	
		}else {
			this.segundos=0;
		}
	}
public void incrementarSegundos() {
	this.segundos++;
	if(this.segundos>59) {
		this.segundos=0;
		this.minutos++;
		if(this.minutos>59) {
			this.minutos=0;
			this.hora++;
			if (this.hora==24) {
				this.hora=0;
			}
		}
	}
}//cierra incrementarSegundos()


}//cierra la clase
