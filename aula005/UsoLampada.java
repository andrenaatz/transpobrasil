package br.com.cursojava.aula005;

public class UsoLampada {
	
	//public static void main(String[] args){
		
		Lampada lamp;
		
		lamp = new Lampada();
		
		lamp.potencia = 100;
		
		lamp.tipo = "Incandescente";
		
		System.out.println(lamp.potencia);
		System.out.println(lamp.tipo);
		
		lamp.ligar();
		
		System.out.println("está ligada? " + lamp.isLigada());
		
		lamp.desligar();
		
		System.out.println("está ligada? " + lamp.isLigada());
		
				
		lamp.configurarTipo("LED");

		System.out.println(lamp.tipo);
		
		
		System.out.println("lamp.potencia = "+lamp.potencia);
		System.out.println("lamp.tipo = "+lamp.tipo);
		
		Lampada lamp2 = new Lampada();
		
		System.out.println("lamp2.potencia = "+lamp2.potencia);
		System.out.println("lamp2.tipo = "+lamp2.tipo);
		
		
		
		
	}

}
